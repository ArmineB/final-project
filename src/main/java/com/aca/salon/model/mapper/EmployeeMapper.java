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
        Integer employeeId = resultSet.getInt("EmployeeID");
        String firstName = resultSet.getString("FirstName");
        String lastName = resultSet.getString("LastName");
        String phoneNumber = resultSet.getString("PhoneNumber");
        Integer professionId = resultSet.getInt("ProfessionId");
        Integer salonId = resultSet.getInt("SalonId");
        byte[] image = resultSet.getBytes("image");
        Employee employee = new Employee(employeeId,  firstName,
                lastName, phoneNumber, professionId, salonId, image);

         return  employee;

    }
}
