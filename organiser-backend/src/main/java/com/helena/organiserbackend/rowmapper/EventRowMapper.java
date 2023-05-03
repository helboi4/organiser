package com.helena.organiserbackend.rowmapper;

import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.helena.organiserbackend.model.Attendee;
import com.helena.organiserbackend.model.Event;
import org.springframework.jdbc.core.RowMapper;

public class EventRowMapper implements RowMapper<Event> {

    @Override
    public Event mapRow(ResultSet rs, int rowNum) throws SQLException{

        Event event = new Event(
            rs.getInt("id"),
            rs.getInt("user_id"),
            rs.getInt("goal_id"),
            rs.getInt("project_id"),
            rs.getString("title"),
            rs.getString("description"),
            rs.getString("category"),
            rs.getString("start_datetime"),
            rs.getString("end_datetime"),
            (String[]) rs.getArray("reminders").getArray(),
            (Attendee[]) rs.getArray("attendees").getArray(),
            rs.getString("link"),
            rs.getString("platform"),
                rs.getArray("recurrence").getArray(),
            rs.getString("location")
        );

        return event;
    }

}
