package com.aca.salon.model.mapper;

import com.aca.salon.model.entity.Employee;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Armine on 25/05/2017.
 */
public class EmployeeMapper implements RowMapper<Employee> {
    @Override
    public Employee mapRow(ResultSet resultSet, int i) throws SQLException {
        Integer employeeId = resultSet.getInt(1);
        String firstName = resultSet.getString(2);
        String lastName = resultSet.getString(3);
        String phoneNumber = resultSet.getString(4);
        Integer professionId = resultSet.getInt(5);
        Integer salonId = resultSet.getInt(6);
        byte[] image = resultSet.getBytes(7);
        Employee employee = new Employee(employeeId,  firstName,
                lastName, phoneNumber, professionId, salonId, image);

         return  employee;

    }
}
