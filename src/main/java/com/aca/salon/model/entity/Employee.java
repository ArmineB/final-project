package com.aca.salon.model.entity;

/**
 * Created by Armine on 23/05/2017.
 */
public class Employee {
    private Integer EmployeeId;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private Integer professionId;
    private Integer SalonId;
    private byte[] image;

    public Employee(Integer employeeId, String firstName,
                    String lastName, String phoneNumber,
                    Integer professionId, Integer salonId,
                    byte[] image) {
        EmployeeId = employeeId;
        this.image = image;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.professionId = professionId;
        SalonId = salonId;

    }

    public Employee(){}

    public Employee(String firstName, String lastName, String phoneNumber, Integer professionId, Integer salonId, byte[] image) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.professionId = professionId;
        SalonId = salonId;
        this.image = image;
    }

    public Integer getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        EmployeeId = employeeId;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
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

    public Integer getProfessionId() {
        return professionId;
    }

    public void setProfessionId(Integer professionId) {
        this.professionId = professionId;
    }

    public Integer getSalonId() {
        return SalonId;
    }

    public void setSalonId(Integer salonId) {
        SalonId = salonId;
    }

}
