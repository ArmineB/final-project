package com.aca.salon.dao;


import com.aca.salon.model.entity.Employee;
import com.aca.salon.model.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Armine on 29/05/2017.
 */
@Repository
public class EmployeeDao {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public EmployeeDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public int add(Employee employee) {
        final String sql = "insert into Employee(FirstName, LastName, PhoneNumber, ProfessionId, SalonId, image) values(?, ?,?,?,?,?)";
        GeneratedKeyHolder holder = new GeneratedKeyHolder();
        jdbcTemplate.update(connection -> {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, employee.getFirstName());
            ps.setString(2, employee.getLastName());
            ps.setString(3, employee.getPhoneNumber());
            ps.setInt(4, employee.getProfessionId());
            ps.setInt(5, employee.getSalonId());
            ps.setBytes(6, employee.getImage());
            return ps;
        }, holder);

        return (int) holder.getKey().longValue();
    }


//    public Employee loadById(Integer id) {
//        final String sql = "select * from Employee where EmployeeID = ?";
//        return jdbcTemplate.queryForObject(sql, new EmployeeMapper(), id);
//
//    }

    public List<Employee> loadBySalonId(Integer salonId){
        final String sql = "select * from Employee where SalonId = ?";
          List<Employee> employees = jdbcTemplate.query(sql, new EmployeeMapper(), salonId);
          return  employees;
    }

    public List<Integer> loadIdsBySalonId(Integer salonId) {
       List<Employee> employees = loadBySalonId(salonId);
       List<Integer> ids = new ArrayList<>();
       for (Employee employee : employees){
           ids.add(employee.getEmployeeId());
       }
       return  ids;
    }
}
