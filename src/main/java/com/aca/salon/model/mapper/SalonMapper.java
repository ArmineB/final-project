package com.aca.salon.model.mapper;


import com.aca.salon.model.entity.Salon;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Armine on 25/05/2017.
 */
public class SalonMapper implements RowMapper<Salon> {
    @Override
    public Salon mapRow(ResultSet resultSet, int i) throws SQLException {
        Integer salonId = resultSet.getInt(1);
        String salonName = resultSet.getString(2);
        String salonAddress = resultSet.getString(3);
        String phoneNumber = resultSet.getString(4);
        byte[] image = resultSet.getBytes(5);
        String login = resultSet.getString(6);
        String password = resultSet.getString(7);

        Salon salon = new Salon(salonId, salonName, salonAddress, phoneNumber,image,login, password);

        return salon;

    }
}
