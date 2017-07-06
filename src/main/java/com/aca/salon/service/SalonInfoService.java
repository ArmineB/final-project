package com.aca.salon.service;

import com.aca.salon.dao.EmployeeDao;
import com.aca.salon.dao.ReservationDao;
import com.aca.salon.dao.SalonDao;
import com.aca.salon.dao.WorkloadDao;
import com.aca.salon.model.dto.SalonInfo;
import com.aca.salon.model.entity.Employee;
import com.aca.salon.model.entity.Reservation;
import com.aca.salon.model.entity.Salon;
import com.aca.salon.model.entity.Workload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Armine on 25/06/2017.
 */
@Service
public class SalonInfoService {
    private final SalonDao salonDao;
    private final EmployeeDao employeeDao;
    private final WorkloadDao workloadDao;
    private final ReservationDao reservationDao;

    @Autowired
    public SalonInfoService(SalonDao salonDao, EmployeeDao employeeDao, WorkloadDao workloadDao, ReservationDao reservationDao) {
        this.salonDao = salonDao;
        this.employeeDao = employeeDao;
        this.workloadDao = workloadDao;
        this.reservationDao = reservationDao;
    }


    public SalonInfo getSalonInfo(Integer salonId){
        Salon salon = salonDao.loadById(salonId);
        List<Employee> employees = employeeDao.loadBySalonId(salonId);
        List<Integer> allEmployeeIds = employeeDao.loadIdsBySalonId(salonId);
        List<List<Workload>> workloads = new ArrayList<>();
        List<List<Reservation>> reservations = new ArrayList<>();
        for(Integer employeeId : allEmployeeIds){
            workloads.add(workloadDao.loadByEmployeeId(employeeId));
            reservations.add(reservationDao.loadByEmployeeId(employeeId));
        }
        SalonInfo salonInfo = new SalonInfo(salon,employees,workloads,reservations);
        return  salonInfo;

    }

}
