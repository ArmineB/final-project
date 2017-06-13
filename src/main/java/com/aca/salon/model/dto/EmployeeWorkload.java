package com.aca.salon.model.dto;

import com.aca.salon.model.enums.WeekDay;

import java.sql.Time;

/**
 * Created by Armine on 13/06/2017.
 */
public class EmployeeWorkload {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String profession;
    private byte[] image;
    private String weekDay;
    private String startHour;
    private String endHour;

    public EmployeeWorkload(String firstName, String lastName,
                            String phoneNumber, String profession,
                            byte[] image, String weekDay,
                            String startHour,
                            String endHour) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.profession = profession;
        this.image = image;
        this.weekDay = weekDay;
        this.startHour = startHour;
        this.endHour = endHour;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(String weekDay) {
        this.weekDay = weekDay;
    }

    public String getStartHour() {
        return startHour;
    }

    public void setStartHour(String startHour) {
        this.startHour = startHour;
    }

    public String getEndHour() {
        return endHour;
    }

    public void setEndHour(String endHour) {
        this.endHour = endHour;
    }
}
