package com.aca.salon.model.entity;

/**
 * Created by Armine on 25/05/2017.
 */
public class SalonManager {
    private Integer salonManagerId;
    private String login;
    private String password;
    private Integer salonId;

    public SalonManager(Integer salonManagerId,Integer salonId, String login, String password) {
        this.salonManagerId = salonManagerId;
        this.login = login;
        this.password = password;
        this.salonId = salonId;
    }

    public Integer getSalonManagerId() {
        return salonManagerId;
    }

    public void setSalonManagerId(Integer salonManagerId) {
        this.salonManagerId = salonManagerId;
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

    public Integer getSalonId() {
        return salonId;
    }

    public void setSalonId(Salon salon) {
        this.salonId = salonId;
    }
}
