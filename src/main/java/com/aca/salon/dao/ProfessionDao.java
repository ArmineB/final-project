package com.aca.salon.dao;


import com.aca.salon.model.entity.Client;
import com.aca.salon.model.entity.Profession;
import com.aca.salon.model.mapper.ClientMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.stereotype.Repository;


import java.sql.PreparedStatement;

/**
 * Created by Armine on 14/06/2017.
 */
@Repository
public class ProfessionDao {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public ProfessionDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int add(Profession profession) {
        final String sql = "insert into profession(Name) values(?)";
        GeneratedKeyHolder holder = new GeneratedKeyHolder();
        jdbcTemplate.update(connection -> {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, profession.getName());
            return ps;
        }, holder);

        return (int) holder.getKey().longValue();
    }

//   public Integer getProfessionIdByName(String name){
//        final String sql = "select * from Profession where Name= ?";
//        jdbcTemplate.queryForObject(sql,);
//   }
}
