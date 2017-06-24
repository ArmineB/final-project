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
        Integer reservationId = resultSet.getInt("ReservationID");
        Integer clientId = resultSet.getInt("ClientId");
        Integer workloadId = resultSet.getInt("WorkloadId");
        Date requestDate = resultSet.getDate("RequestDate");
        Time requestHourFrom = resultSet.getTime("RequestHourFrom");
        Time requestHourTo = resultSet.getTime("RequestHourTo");
        Reservation reservation = new Reservation(reservationId,
                workloadId,clientId, requestDate, requestHourFrom,
                requestHourTo);

        return  reservation;
    }
}
