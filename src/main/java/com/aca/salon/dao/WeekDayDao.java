package com.aca.salon.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by Armine on 14/06/2017.
 */
@Repository
public class WeekDayDao {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public WeekDayDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


}
