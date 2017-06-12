package com.aca.salon.service;

import com.aca.salon.dao.SalonDao;
import com.aca.salon.dao.SessionDao;
import com.aca.salon.model.entity.SalonManager;
import org.springframework.stereotype.Service;

/**
 * Created by Armine on 12/06/2017.
 */
@Service
public class AuthService {
    private final SalonDao salonDao;
    private  final SessionDao sessionDao;
    private final SalonManager salonManager;

    public AuthService(SalonDao salonDao, SessionDao sessionDao, SalonManager salonManager) {
        this.salonDao = salonDao;
        this.sessionDao = sessionDao;
        this.salonManager = salonManager;
    }


    public String add(Salo)


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
