package com.aca.salon.dao;

import com.aca.salon.model.entity.Salon;
import com.aca.salon.model.entity.Workload;
import com.aca.salon.model.mapper.SalonMapper;
import com.aca.salon.model.mapper.WorkloadMapper;
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
public class WorkloadDao {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public WorkloadDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Workload> findAll() {
        final String sql = "select * from workload";
        List<Workload> workloads = jdbcTemplate.query(sql, new WorkloadMapper());
        return workloads;

    }

    public int add(Workload workload) {
        final String sql = "insert into Workload(EmployeeId, StartHour, EndHour,WeekDayId) values(?,?,?,?)";
        GeneratedKeyHolder holder = new GeneratedKeyHolder();
        jdbcTemplate.update(connection -> {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, workload.getEmployeeId());
            ps.setTime(2, workload.getStartHour());
            ps.setTime(3, workload.getEndHour());
            ps.setInt(4, workload.getWeekDay().getDayOfWeek());
            return ps;
        }, holder);

        return (int) holder.getKey().longValue();
    }


    public Workload loadById(Integer id) {
        final String sql = "select * from Workload where WorkloadID = ?";
        return jdbcTemplate.queryForObject(sql, new WorkloadMapper(), id);

    }

}
