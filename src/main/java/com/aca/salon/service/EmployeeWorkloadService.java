package com.aca.salon.service;

import com.aca.salon.dao.EmployeeDao;
import com.aca.salon.dao.ProfessionDao;
import com.aca.salon.dao.WorkloadDao;
import com.aca.salon.model.dto.EmployeeWorkload;
import com.aca.salon.model.entity.Employee;
import com.aca.salon.model.entity.Workload;
import com.aca.salon.model.enums.WeekDay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;


/**
 * Created by Armine on 13/06/2017.
 */
@Service
public class EmployeeWorkloadService {
     private final EmployeeDao employeeDao;
    private final WorkloadDao workloadDao;
    private  final ProfessionDao professionDao;

    @Autowired
    public EmployeeWorkloadService(EmployeeDao employeeDao, WorkloadDao workloadDao, ProfessionDao professionDao) {
        this.employeeDao = employeeDao;
        this.workloadDao = workloadDao;
        this.professionDao = professionDao;
    }



    public void add(EmployeeWorkload employeeWorkload, Integer salonID){
        String firstName = employeeWorkload.getFirstName();
        String lastName = employeeWorkload.getLastName();
        String phoneNumber = employeeWorkload.getPhoneNumber();
        byte[] image = employeeWorkload.getImage();
        Integer professionId = professionDao.getProfessionIdByName(employeeWorkload.getProfession());
        Employee employee = new Employee(firstName, lastName,phoneNumber,professionId,salonID, image);
        Integer employeeId = employeeDao.add(employee);
        Workload workload = new Workload();
        workload.setEmployeeId(employeeId);
        HashMap<String,String> workload1 = employeeWorkload.getWorkload();
        for(String weekDay : workload1.keySet()){
           workload.setWeekDay(getWeekDay(weekDay));
           workload.setStartHour(convertStringToTime(split(workload1.get(weekDay))[0]));
           workload.setEndHour(convertStringToTime(split(workload1.get(weekDay))[1]));
           workloadDao.add(workload);
        }
    }


    private WeekDay getWeekDay(String weekDay){
        switch (weekDay) {
            case "SUNDAY":
                return WeekDay.SUNDAY;
            case "MONDAY":
                return WeekDay.MONDAY;
            case "TUESDAY":
                return WeekDay.TUESDAY;
            case "WEDNESDAY":
                return WeekDay.WEDNESDAY;
            case "THURSDAY":
                return WeekDay.THURSDAY;
            case "FRIDAY":
                return WeekDay.FRIDAY;
            case "SATURDAY":
                return WeekDay.SATURDAY;
            default:
                return null;
        }

    }


    private Time convertStringToTime(String time){
        SimpleDateFormat sdf = new SimpleDateFormat("HH:MM");
        Time t = null;
        try {
           long ms = sdf.parse(time).getTime();
            t = new Time(ms);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return t;
    }


    private String[] split(String line){
        return line.split("-");
    }


}
