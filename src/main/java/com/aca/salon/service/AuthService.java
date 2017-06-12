package com.aca.salon.service;

import com.aca.salon.dao.SalonDao;
import com.aca.salon.dao.SessionDao;
import com.aca.salon.model.entity.Salon;
import com.aca.salon.model.entity.Session;
import org.springframework.stereotype.Service;

/**
 * Created by Armine on 12/06/2017.
 */
@Service
public class AuthService {
    private final SalonDao salonDao;
    private  final SessionDao sessionDao;


    public AuthService(SalonDao salonDao, SessionDao sessionDao) {
        this.salonDao = salonDao;
        this.sessionDao = sessionDao;

    }


    public String add(Salon salon){
       int salonId = salonDao.add(salon);
       String token = tokenGenerator();
        Session session = new Session(salonId,token);
       sessionDao.add(session);
       return token;
    }


    public String tokenGenerator() {
        String s = "";
        double d;
        for (int i = 1; i <= 16; i++) {
            d = Math.random() * 10;
            s = s + ((int) d);
            if (i % 4 == 0 && i != 16) {
                s = s + "-";
            }
        }
        return s;
    }
}
