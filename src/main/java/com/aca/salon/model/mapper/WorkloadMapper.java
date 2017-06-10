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
    SalonDao salonDao;
    @Override
    public Workload mapRow(ResultSet resultSet, int i) throws SQLException {
        Integer workloadId = resultSet.getInt(1);
        Integer salonEmployeeId = resultSet.getInt(2);

        int weekDayId = resultSet.getInt(3);
        WeekDay weekDay = WeekDay.getWeekDay(weekDayId);

        Time startHour = resultSet.getTime(4);
        Time endHour = resultSet.getTime(5);
        return  null; //toDo

    }
}
