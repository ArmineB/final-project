package com.aca.salon.model.mapper;

import com.aca.salon.dao.SalonDao;
import com.aca.salon.model.entity.Reservation;
import com.aca.salon.model.entity.Salon;
import org.springframework.jdbc.core.RowMapper;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;

/**
 * Created by Armine on 25/05/2017.
 */
public class ReservationMapper implements RowMapper<Reservation> {
    @Override
    public Reservation mapRow(ResultSet resultSet, int i) throws SQLException {
        Integer reservationId = resultSet.getInt(1);
        Integer clientId = resultSet.getInt(2);
        Integer workloadId = resultSet.getInt(3);
        Date requestDate = resultSet.getDate(4);
        Time requestHourFrom = resultSet.getTime(5);
        Time requestHourTo = resultSet.getTime(6);
        Reservation reservation = new Reservation(reservationId,
                workloadId,clientId, requestDate, requestHourFrom,
                requestHourTo);

        return  reservation;
    }
}
