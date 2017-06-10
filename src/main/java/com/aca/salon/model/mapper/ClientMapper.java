package com.aca.salon.model.mapper;

import com.aca.salon.model.entity.Client;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Armine on 25/05/2017.
 */
public class ClientMapper implements RowMapper<Client> {
    @Override
    public Client mapRow(ResultSet resultSet, int i) throws SQLException {
        Integer clientId = resultSet.getInt(1);
        String firstName = resultSet.getString(2);
        String lastName = resultSet.getString(3);
        String phoneNumber = resultSet.getString(4);
        Client client = new Client(clientId, firstName, lastName, phoneNumber);

        return client;

    }
}
