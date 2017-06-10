package com.aca.salon.model.mapper;

import com.aca.salon.dao.SalonDao;
import com.aca.salon.model.entity.Salon;
import com.aca.salon.model.entity.SalonManager;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Armine on 28/05/2017.
 */
public class SalonManagerMapper implements RowMapper<SalonManager> {
    @Override
    public SalonManager mapRow(ResultSet resultSet, int i) throws SQLException {
        Integer salonManagerId = resultSet.getInt(1);
        Integer salonId = resultSet.getInt(2);
        String login = resultSet.getString(3);
        String password = resultSet.getString(4);
        SalonManager salonManager = new SalonManager(salonManagerId,salonId,login,password);
        return  salonManager;

    }
}
