package com.aca.salon.dao;

import com.aca.salon.model.entity.Salon;
import com.aca.salon.model.entity.SalonManager;
import com.aca.salon.model.mapper.SalonManagerMapper;
import com.aca.salon.model.mapper.SalonMapper;
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
public class SalonManagerDao {
    private  final JdbcTemplate jdbcTemplate;

    @Autowired
    public SalonManagerDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<SalonManager> findAll() {
        final String sql = "select * from salonmanager";
        List<SalonManager> salonManagers = jdbcTemplate.query(sql, new SalonManagerMapper());
        return salonManagers;

    }
    public int add(SalonManager salonManager) {
        final String sql = "insert into SalonManager(SalonID, Login, Password) values(?,?,?)";
        GeneratedKeyHolder holder = new GeneratedKeyHolder();
        jdbcTemplate.update(connection -> {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, salonManager.getSalonId());
            ps.setString(2, salonManager.getLogin());
            ps.setString(3, salonManager.getPassword());
            return ps;
        }, holder);

        return (int) holder.getKey().longValue();
    }

    public SalonManager loadById(Integer id) {
        final String sql = "select * from SalonManager where SalonManagerId = ?";
        return jdbcTemplate.queryForObject(sql, new SalonManagerMapper(), id);
    }

}
