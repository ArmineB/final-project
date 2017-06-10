package com.aca.salon.model.entity;

import com.aca.salon.model.enums.WeekDay;

import java.sql.Time;

/**
 * Created by Armine on 23/05/2017.
 */
public class Workload {
    private Integer workloadId;
    private Integer employeeId;
    private WeekDay weekDay;
    private Time startHour;
    private Time endHour;

    public Workload(Integer workloadId, Integer employeeId, WeekDay weekDay, Time startHour, Time endHour) {
        this.workloadId = workloadId;
        this.weekDay = weekDay;
        this.startHour = startHour;
        this.endHour = endHour;

        this.employeeId = employeeId;
    }

    public Integer getWorkloadId() {
        return workloadId;
    }

    public void setWorkloadId(Integer workloadId) {
        this.workloadId = workloadId;
    }

    public WeekDay getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(WeekDay weekDay) {
        this.weekDay = weekDay;
    }

    public Time getStartHour() {
        return startHour;
    }

    public void setStartHour(Time startHour) {
        this.startHour = startHour;
    }

    public Time getEndHour() {
        return endHour;
    }

    public void setEndHour(Time endHour) {
        this.endHour = endHour;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }
}



