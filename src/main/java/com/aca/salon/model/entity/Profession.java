package com.aca.salon.model.entity;

/**
 * Created by Armine on 14/06/2017.
 */
public class Profession {
    private Integer professionId;
    private String name;

    public Profession(Integer professionId, String name) {
        this.professionId = professionId;
        this.name = name;
    }

    public Integer getProfessionId() {
        return professionId;
    }
public Profession(){}
    public void setProfessionId(Integer professionId) {
        this.professionId = professionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
