package com.aca.salon.model.entity;

/**
 * Created by Armine on 12/06/2017.
 */
public class Session {
   private Integer sessionId;
   private Integer salonId;
   private String token;

    public Session(Integer sessionId, Integer salonId, String token) {
        this.sessionId = sessionId;
        this.salonId = salonId;
        this.token = token;
    }

    public Integer getSessionId() {
        return sessionId;
    }

    public void setSessionId(Integer sessionId) {
        this.sessionId = sessionId;
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
