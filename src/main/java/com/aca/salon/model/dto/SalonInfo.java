package com.aca.salon.model.dto;

import com.aca.salon.model.entity.Employee;
import com.aca.salon.model.entity.Reservation;
import com.aca.salon.model.entity.Salon;
import com.aca.salon.model.entity.Workload;

import java.util.List;

/**
 * Created by Armine on 25/06/2017.
 */
public class SalonInfo {
    private Salon salon;
   private List<Employee> employees;
   private  List<List<Workload>> workloads;
   private List<List<Reservation>> reservations;

    public SalonInfo(Salon salon, List<Employee> employees, List<List<Workload>> workloads, List<List<Reservation>> reservations) {
        this.salon = salon;
        this.employees = employees;
        this.workloads = workloads;
        this.reservations = reservations;
    }

    public  SalonInfo(){}

    public Salon getSalon() {
        return salon;
    }

    public void setSalon(Salon salon) {
        this.salon = salon;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<List<Workload>> getWorkloads() {
        return workloads;
    }

    public void setWorkloads(List<List<Workload>> workloads) {
        this.workloads = workloads;
    }

    public List<List<Reservation>> getReservations() {
        return reservations;
    }

    public void setReservations(List<List<Reservation>> reservations) {
        this.reservations = reservations;
    }
}
