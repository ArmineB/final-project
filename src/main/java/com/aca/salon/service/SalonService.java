package com.aca.salon.service;


import com.aca.salon.dao.SalonDao;
import com.aca.salon.model.dto.SalonInfo;
import com.aca.salon.model.entity.Salon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * Created by Armine on 23/05/2017.
 */
@Service
public class SalonService {
 private final SalonDao salonDao;
  @Autowired


    public SalonService(SalonDao salonDao) {
        this.salonDao = salonDao;

    }

    public int add(SalonInfo salonInfo){
      return  salonDao.add(salonInfo.getSalon());
    }
}
