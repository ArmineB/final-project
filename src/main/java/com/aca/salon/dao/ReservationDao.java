package com.aca.salon.dao;


import com.aca.salon.model.entity.Reservation;
import com.aca.salon.model.mapper.ReservationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.util.List;

/**
 * Created by Armine on 29/05/2017.
 */
@Repository
public class ReservationDao {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public ReservationDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public List<Reservation> findAll() {
        final String sql = "select * from reservation";
        List<Reservation> reservations = jdbcTemplate.query(sql, new ReservationMapper());
        return reservations;

    }

    public int add(Reservation reservation) {
        final String sql = "insert into Reservation(ClientID, WorkloadID, RequestDate, RequestHourFrom, RequestHourTo) values(?,?,?,?,?)";
        GeneratedKeyHolder holder = new GeneratedKeyHolder();
        jdbcTemplate.update(connection -> {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, reservation.getClientId());
            ps.setInt(2, reservation.getWorkloadId());
            ps.setDate(3, reservation.getRequestDate());
            ps.setTime(4, reservation.getRequestHourFrom());
            ps.setTime(5, reservation.getRequestHourTo());
            return ps;
        }, holder);

        return (int) holder.getKey().longValue();
    }

    public Reservation loadById(Integer id) {
        final String sql = "select * from reservation where ReservationID = ?";
        return jdbcTemplate.queryForObject(sql, new ReservationMapper(), id);

    }

}
