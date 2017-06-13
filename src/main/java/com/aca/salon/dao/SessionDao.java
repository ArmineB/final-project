package com.aca.salon.dao;

import com.aca.salon.model.entity.Salon;
import com.aca.salon.model.entity.Session;
import com.aca.salon.model.mapper.SalonMapper;
import com.aca.salon.model.mapper.SessionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Armine on 12/06/2017.
 */
@Repository
public class SessionDao {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public SessionDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int add(Session session){
        final String sql = "insert into Session(SalonId, Token) values(?, ?)";
        GeneratedKeyHolder holder = new GeneratedKeyHolder();
        jdbcTemplate.update(connection -> {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, session.getSalonId());
            ps.setString(2, session.getToken());
            return ps;
        }, holder);

        return (int) holder.getKey().longValue();
    }


    public List<Session> findAll() {
        final String sql = "select * from Session";
        List<Session> sessions = jdbcTemplate.query(sql, new SessionMapper());
        return sessions;
    }

    public boolean isAuthorized(String token){
        List<Session> sessions = findAll();
        List<String> tokens = new ArrayList<>();
        boolean isFind = false;
        for(Session session : sessions){
            tokens.add(session.getToken());
        }
        for(String str : tokens){
            if(token.equals(str))
                isFind = true;
            break;
        }

        return  isFind;
    }
}
