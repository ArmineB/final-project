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
        Integer salonId = resultSet.getInt("SalonID");
        String salonName = resultSet.getString("Name");
        String salonAddress = resultSet.getString("Address");
        String phoneNumber = resultSet.getString("PhoneNumber");
        byte[] image = resultSet.getBytes("Image");
        String login = resultSet.getString("Login");
        String password = resultSet.getString("Password");

        Salon salon = new Salon(salonId, salonName, salonAddress, phoneNumber,image,login, password);

        return salon;

    }
}
