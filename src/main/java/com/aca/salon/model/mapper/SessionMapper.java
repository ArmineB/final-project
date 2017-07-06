package com.aca.salon.model.mapper;

import com.aca.salon.model.entity.Session;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Armine on 13/06/2017.
 */
public class SessionMapper implements RowMapper<Session> {
    @Override
    public Session mapRow(ResultSet resultSet, int i) throws SQLException {

        Integer salonId = resultSet.getInt("SalonId");
        String token = resultSet.getString("Token");
        Session session = new Session(salonId,token);
         return  session;


    }
}
