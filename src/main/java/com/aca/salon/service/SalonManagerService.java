package com.aca.salon.service;

import com.aca.salon.dao.SalonManagerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Armine on 03/06/2017.
 */
@Service
public class SalonManagerService {
    private SalonManagerDao salonManagerDao;

    @Autowired
    public SalonManagerService(SalonManagerDao salonManagerDao) {
        this.salonManagerDao = salonManagerDao;
    }
}
