package com.aca.salon.service;

import com.aca.salon.dao.EmployeeDao;
import com.aca.salon.dao.SalonDao;
import com.aca.salon.dao.WorkloadDao;
import com.aca.salon.model.dto.SalonInfo;
import com.aca.salon.model.entity.Employee;
import com.aca.salon.model.entity.Salon;
import com.aca.salon.model.entity.Workload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Armine on 25/06/2017.
 */
@Service
public class SalonInfoService {
    private final SalonDao salonDao;
    private final EmployeeDao employeeDao;
    private final WorkloadDao workloadDao;

    @Autowired
    public SalonInfoService(SalonDao salonDao, EmployeeDao employeeDao, WorkloadDao workloadDao) {
        this.salonDao = salonDao;
        this.employeeDao = employeeDao;
        this.workloadDao = workloadDao;
    }

    public SalonInfo getSalonInfo(Integer salonId){
        Salon salon = salonDao.loadById(salonId);
        Integer employeeId = employeeDao.loadIdBySalonId(salonId);
        Employee employee = employeeDao.loadById(employeeId);
        Workload workload = workloadDao.loadByEmployeeId(employeeId);
        SalonInfo salonInfo = new SalonInfo(salon,employee,workload);
        return  salonInfo;

    }

}
