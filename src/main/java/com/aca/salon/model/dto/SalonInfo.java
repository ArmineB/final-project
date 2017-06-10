package com.aca.salon.model.dto;

import com.aca.salon.model.entity.Salon;
import com.aca.salon.model.entity.SalonManager;

/**
 * Created by Armine on 03/06/2017.
 */
public class SalonInfo {

    private Salon salon;
    private SalonManager salonManager;

    public SalonInfo(Salon salon, SalonManager salonManager) {
        this.salon = salon;
        this.salonManager = salonManager;
    }

    public Salon getSalon() {
        return salon;
    }

    public void setSalon(Salon salon) {
        this.salon = salon;
    }

    public SalonManager getSalonManager() {
        return salonManager;
    }

    public void setSalonManager(SalonManager salonManager) {
        this.salonManager = salonManager;
    }
}
