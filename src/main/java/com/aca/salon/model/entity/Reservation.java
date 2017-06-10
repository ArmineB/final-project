package com.aca.salon.model.entity;

import java.sql.Time;
import java.sql.Date;

/**
 * Created by Armine on 23/05/2017.
 */
public class Reservation {
    private Integer reservationID;
    private Integer workloadId;
    private Integer clientId;
    private Date requestDate;
    private Time requestHourFrom;
    private Time requestHourTo;

    public Reservation(Integer reservationID,Integer clientId, Integer workloadId, Date requestDate, Time requestHourFrom,
                       Time requestHourTo ) {
        this.reservationID = reservationID;
        this.requestDate = requestDate;
        this.requestHourFrom = requestHourFrom;
        this.requestHourTo = requestHourTo;
        this.clientId = clientId;
        this.workloadId = workloadId;
    }

    public Integer getReservationID() {
        return reservationID;
    }

    public void setReservationID(Integer reservationID) {
        this.reservationID = reservationID;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Time getRequestHourFrom() {
        return requestHourFrom;
    }

    public void setRequestHourFrom(Time requestHourFrom) {
        this.requestHourFrom = requestHourFrom;
    }

    public Time getRequestHourTo() {
        return requestHourTo;
    }

    public void setRequestHourTo(Time requestHourTo) {
        this.requestHourTo = requestHourTo;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public Integer getWorkloadId() {
        return workloadId;
    }

    public void setWorkloadId(Integer workloadId) {
        this.workloadId = workloadId;
    }
}
