package com.aca.salon.model.dto;

/**
 * Created by Armine on 01/07/2017.
 */
public class ReserveInfo {
    private Integer employeeId;
    private String reserveHourFrom;
    private String reserveHourTo;
    private String clientFirstName;
    private String clientLastName;
    private String clientPhoneNumber;

    public ReserveInfo(Integer employeeId, String reserveHourFrom, String reserveHourTo, String clientFirstName, String clientLastName, String clientPhoneNumber) {
        this.employeeId = employeeId;
        this.reserveHourFrom = reserveHourFrom;
        this.reserveHourTo = reserveHourTo;
        this.clientFirstName = clientFirstName;
        this.clientLastName = clientLastName;
        this.clientPhoneNumber = clientPhoneNumber;
    }

    public ReserveInfo() {
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getReserveHourFrom() {
        return reserveHourFrom;
    }

    public void setReserveHourFrom(String reserveHourFrom) {
        this.reserveHourFrom = reserveHourFrom;
    }

    public String getReserveHourTo() {
        return reserveHourTo;
    }

    public void setReserveHourTo(String reserveHourTo) {
        this.reserveHourTo = reserveHourTo;
    }

    public String getClientFirstName() {
        return clientFirstName;
    }

    public void setClientFirstName(String clientFirstName) {
        this.clientFirstName = clientFirstName;
    }

    public String getClientLastName() {
        return clientLastName;
    }

    public void setClientLastName(String clientLastName) {
        this.clientLastName = clientLastName;
    }

    public String getClientPhoneNumber() {
        return clientPhoneNumber;
    }

    public void setClientPhoneNumber(String clientPhoneNumber) {
        this.clientPhoneNumber = clientPhoneNumber;
    }
}
