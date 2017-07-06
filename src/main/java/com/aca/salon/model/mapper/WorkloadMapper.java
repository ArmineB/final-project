package com.aca.salon.model.mapper;

import com.aca.salon.dao.SalonDao;
import com.aca.salon.model.entity.Workload;
import com.aca.salon.model.enums.WeekDay;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;

/**
 * Created by Armine on 25/05/2017.
 */
public class WorkloadMapper implements RowMapper<Workload> {
    @Override
    public Workload mapRow(ResultSet resultSet, int i) throws SQLException {
        Integer workloadId = resultSet.getInt("WorkloadID");
        Integer salonEmployeeId = resultSet.getInt("EmployeeId");
        int weekDayId = resultSet.getInt("WeekDayId");
        WeekDay weekDay = WeekDay.getWeekDay(weekDayId);
        Time startHour = resultSet.getTime("StartHour");
        Time endHour = resultSet.getTime("EndHour");
        Workload workload = new Workload(workloadId,salonEmployeeId,
                startHour, endHour, weekDay);
        return workload;

    }
}
