package com.aca.salon.model.entity;



import java.sql.Time;
import java.sql.Date;


/**
 * Created by Armine on 23/05/2017.
 */
public class Reservation {
    private Integer reservationID;
    private Integer employeeId;
    private Integer clientId;
    private Date reserveDate;
    private Time reserveHourFrom;
    private Time reserveHourTo;

    public Reservation(Integer reservationID, Integer employeeId, Integer clientId, Date reserveDate, Time reserveHourFrom, Time reserveHourTo) {
        this.reservationID = reservationID;
        this.employeeId = employeeId;
        this.clientId = clientId;
        this.reserveDate = reserveDate;
        this.reserveHourFrom = reserveHourFrom;
        this.reserveHourTo = reserveHourTo;
    }

    public Reservation(Integer employeeId, Integer clientId, Date reserveDate, Time reserveHourFrom, Time reserveHourTo) {
        this.employeeId = employeeId;
        this.clientId = clientId;
        this.reserveDate = reserveDate;
        this.reserveHourFrom = reserveHourFrom;
        this.reserveHourTo = reserveHourTo;
    }

    public Integer getReservationID() {
        return reservationID;
    }

    public void setReservationID(Integer reservationID) {
        this.reservationID = reservationID;
    }


    public Time getReserveHourFrom() {
        return reserveHourFrom;
    }

    public void setReserveHourFrom(Time reserveHourFrom) {
        this.reserveHourFrom = reserveHourFrom;
    }

    public Date getReserveDate() {
        return reserveDate;
    }

    public void setReserveDate(Date reserveDate) {
        this.reserveDate = reserveDate;
    }

    public Time getReserveHourTo() {
        return reserveHourTo;
    }

    public void setReserveHourTo(Time reserveHourTo) {
        this.reserveHourTo = reserveHourTo;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }
}
