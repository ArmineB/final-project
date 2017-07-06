package com.aca.salon.model.dto;


import java.util.HashMap;



/**
 * Created by Armine on 13/06/2017.
 */
public class EmployeeWorkload {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String profession;
    private byte[] image;
    private HashMap<String,String> workload;


    public EmployeeWorkload(){}

    public EmployeeWorkload(String firstName, String lastName,
                            String phoneNumber, String profession,
                            byte[] image, HashMap<String, String> workload) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.profession = profession;
        this.image = image;
        this.workload = workload;
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

    public HashMap<String, String> getWorkload() {
        return workload;
    }

    public void setWorkload(HashMap<String, String> workload) {
        this.workload = workload;
    }
}
