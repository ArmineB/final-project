package com.aca.salon.model.dto;

/**
 * Created by Armine on 06/07/2017.
 */
public class SalonData {
    private Integer salonId;
    private String salonName;
    private String salonAddress;
    private String phoneNumber;
    private String login;
    private String password;

    public SalonData(){
    }

    public SalonData(Integer salonId, String salonName, String salonAddress, String phoneNumber, String login, String password) {
        this.salonId = salonId;
        this.salonName = salonName;
        this.salonAddress = salonAddress;
        this.phoneNumber = phoneNumber;
        this.login = login;
        this.password = password;
    }

    public Integer getSalonId() {
        return salonId;
    }

    public void setSalonId(Integer salonId) {
        this.salonId = salonId;
    }

    public String getSalonName() {
        return salonName;
    }

    public void setSalonName(String salonName) {
        this.salonName = salonName;
    }

    public String getSalonAddress() {
        return salonAddress;
    }

    public void setSalonAddress(String salonAddress) {
        this.salonAddress = salonAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
