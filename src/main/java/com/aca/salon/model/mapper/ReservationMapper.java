package com.aca.salon.model.mapper;

import com.aca.salon.dao.SalonDao;
import com.aca.salon.model.entity.Reservation;
import com.aca.salon.model.entity.Salon;
import org.springframework.jdbc.core.RowMapper;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.time.LocalDate;

/**
 * Created by Armine on 25/05/2017.
 */
public class ReservationMapper implements RowMapper<Reservation> {
    @Override
    public Reservation mapRow(ResultSet resultSet, int i) throws SQLException {
        Integer reservationId = resultSet.getInt("ReservationID");
        Integer clientId = resultSet.getInt("ClientId");
        Integer employeeId = resultSet.getInt("EmployeeId");
        Time reserveHourFrom = resultSet.getTime("ReserveHourFrom");
        Time reserveHourTo = resultSet.getTime("ReserveHourTo");
        Date reserveDate = resultSet.getDate("ReserveDate");



        Reservation reservation = new Reservation(reservationId,
                employeeId,clientId,reserveDate,reserveHourFrom, reserveHourTo);

        return  reservation;
    }
}
