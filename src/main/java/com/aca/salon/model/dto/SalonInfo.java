package com.aca.salon.model.dto;

import com.aca.salon.model.entity.Employee;
import com.aca.salon.model.entity.Salon;
import com.aca.salon.model.entity.Workload;

/**
 * Created by Armine on 25/06/2017.
 */
public class SalonInfo {
    private Salon salon;
    private Employee employee;
    private Workload workload;

    public SalonInfo(Salon salon, Employee employee, Workload workload) {
        this.salon = salon;
        this.employee = employee;
        this.workload = workload;
    }

    public Salon getSalon() {
        return salon;
    }

    public void setSalon(Salon salon) {
        this.salon = salon;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Workload getWorkload() {
        return workload;
    }

    public void setWorkload(Workload workload) {
        this.workload = workload;
    }
}
