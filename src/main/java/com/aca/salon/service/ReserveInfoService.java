package com.aca.salon.service;

import com.aca.salon.dao.ClientDao;
import com.aca.salon.dao.ReservationDao;
import com.aca.salon.model.dto.ReserveInfo;
import com.aca.salon.model.entity.Client;
import com.aca.salon.model.entity.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.sql.Date;

/**
 * Created by Armine on 03/07/2017.
 */
@Service
public class ReserveInfoService {
    private final ReservationDao reservationDao;
    private  final ClientDao clientDao;

    @Autowired
    public ReserveInfoService(ReservationDao reservationDao, ClientDao clientDao) {
        this.reservationDao = reservationDao;
        this.clientDao = clientDao;
    }



    public Integer add(ReserveInfo reserveInfo) {
        Client client = new Client(reserveInfo.getClientFirstName(),
                reserveInfo.getClientLastName(), reserveInfo.getClientPhoneNumber());
        Integer clientId = clientDao.add(client);
        Reservation reservation = new Reservation(reserveInfo.getEmployeeId(), clientId,
                Date.valueOf(LocalDate.now()), convertStringToTime(reserveInfo.getReserveHourFrom()),convertStringToTime(reserveInfo.getReserveHourTo()));
        reservationDao.add(reservation);

        return clientId;
    }

    private Time convertStringToTime(String time){
        SimpleDateFormat sdf = new SimpleDateFormat("HH:MM");
        Time t = null;
        try {
            long ms = sdf.parse(time).getTime();
            t = new Time(ms);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return t;
    }

}
