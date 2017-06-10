package com.aca.salon.dao;

import com.aca.salon.model.entity.Client;
import com.aca.salon.model.entity.Salon;
import com.aca.salon.model.mapper.ClientMapper;
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
public class ClientDao {
    private final JdbcTemplate jdbcTemplate;
  @Autowired
    public ClientDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Client> findAll() {
        final String sql = "select * from client";
        List<Client> clients = jdbcTemplate.query(sql, new ClientMapper());
        return clients;

    }

    public int add(Client client) {
        final String sql = "insert into Client(FirstName, LastName, PhoneNumber) values(?, ?,?)";
        GeneratedKeyHolder holder = new GeneratedKeyHolder();
        jdbcTemplate.update(connection -> {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, client.getFirstName());
            ps.setString(2, client.getLastName());
            ps.setString(3, client.getPhoneNumber());
            return ps;
        }, holder);

        return (int) holder.getKey().longValue();
    }


    public Client loadById(Integer id) {
        final String sql = "select * from Client where ClientID = ?";
        return jdbcTemplate.queryForObject(sql, new ClientMapper(), id);

    }
}
