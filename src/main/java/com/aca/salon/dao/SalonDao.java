package com.aca.salon.dao;

import com.aca.salon.model.entity.*;
import com.aca.salon.model.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.stereotype.Repository;
import java.sql.PreparedStatement;
import java.util.List;

/**
 * Created by Armine on 23/05/2017.
 */
@Repository
public class SalonDao {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public SalonDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public List<Salon> findAll() {
        final String sql = "select * from Salon";
        List<Salon> salons = jdbcTemplate.query(sql, new SalonMapper());
        return salons;
    }


    public int add(Salon salon) {
        final String sql = "insert into Salon(Name, Address, PhoneNumber,Image,Login, Password) values(? ?,?,?,?,?)";
        GeneratedKeyHolder holder = new GeneratedKeyHolder();
        jdbcTemplate.update(connection -> {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, salon.getSalonName());
            ps.setString(2, salon.getSalonAddress());
            ps.setString(3, salon.getPhoneNumber());
//            Blob blob = new SerialBlob(salon.getImage());
            ps.setBytes(4, salon.getImage());
            ps.setString(5, salon.getLogin());
            ps.setString(6,salon.getPassword());

            return ps;
        }, holder);

        return (int) holder.getKey().longValue();
    }


    public Salon loadById(Integer id) {
        final String sql = "select * from Salon where SalonID= ?";
        return jdbcTemplate.queryForObject(sql, new SalonMapper(), id);

    }


//    public void delete(Integer id){
//        final String sql = "delete from Salon where SalonID= ?";
//        jdbcTemplate.update(sql,id);
//    }



}



