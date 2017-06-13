package com.aca.salon.service;

import com.aca.salon.dao.EmployeeDao;
import com.aca.salon.dao.WorkloadDao;
import com.aca.salon.model.dto.EmployeeWorkload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Armine on 13/06/2017.
 */
@Service
public class EmployeeWorkloadService {
     private final EmployeeDao employeeDao;
     private final WorkloadDao workloadDao;

    @Autowired
    public EmployeeWorkloadService(EmployeeDao employeeDao, WorkloadDao workloadDao) {
        this.employeeDao = employeeDao;
        this.workloadDao = workloadDao;
    }

    public void add(EmployeeWorkload employeeWorkload, Integer salonID){

        String firstName = employeeWorkload.getFirstName();
        String lastName = employeeWorkload.getLastName();
        String phoneNumber = employeeWorkload.getPhoneNumber();
        byte[] image = employeeWorkload.getImage();


    }
}
