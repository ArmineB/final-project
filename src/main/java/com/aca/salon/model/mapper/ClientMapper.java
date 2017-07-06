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
        Integer clientId = resultSet.getInt("ClientID");
        String firstName = resultSet.getString("FirstName");
        String lastName = resultSet.getString("LastName");
        String phoneNumber = resultSet.getString("PhoneNumber");
        Client client = new Client(clientId, firstName, lastName, phoneNumber);

        return client;

    }
}
