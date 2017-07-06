package com.aca.salon.model.mapper;

import com.aca.salon.model.entity.Profession;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Armine on 14/06/2017.
 */
public class ProfessionMapper implements RowMapper<Profession> {
    @Override
    public Profession mapRow(ResultSet resultSet, int i) throws SQLException {
        Integer professionId = resultSet.getInt("ProfessionId");
        String name = resultSet.getString("Name");
        Profession profession = new Profession(professionId, name);
        return  profession;
    }
}
