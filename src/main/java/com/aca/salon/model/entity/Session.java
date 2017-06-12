package com.aca.salon.model.entity;

/**
 * Created by Armine on 12/06/2017.
 */
public class Session {

   private Integer salonId;
   private String token;

    public Session(Integer salonId, String token) {
        this.salonId = salonId;
        this.token = token;
    }



    public Integer getSalonId() {
        return salonId;
    }

    public void setSalonId(Integer salonId) {
        this.salonId = salonId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
