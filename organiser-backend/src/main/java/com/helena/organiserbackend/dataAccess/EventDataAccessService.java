package com.helena.organiserbackend.dataAccess;

import java.lang.reflect.Array;
import java.util.List;
import java.util.List;

import com.helena.organiserbackend.DAO.EventDAO;
import com.helena.organiserbackend.model.Event;
import com.helena.organiserbackend.rowmapper.EventRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EventDataAccessService implements EventDAO {

    private JdbcTemplate jdbcTemplate;

    public EventDataAccessService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Event getEventbyId(int id) {
        //sql query to get event by id
        String sql = """
                SELECT e.*, ARRAY_AGG(r.*) AS reminder_objects, ARRAY_AGG(a.*) AS attendee_objects
                FROM events e
                LEFT JOIN reminders r ON r.event_id = e.id
                LEFT JOIN attendees a ON a.event_id = e.id
                WHERE e.id = ?
                GROUP BY e.id
                """;
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, new EventRowMapper());
    }

    @Override
    public List<Event> getAllEventsForUser(int user_id) {
        //sql query to get all events by user
        String sql = """
                SELECT * FROM events WHERE user_id = ?
                """;
        return jdbcTemplate.query(sql, new Object[]{user_id}, new EventRowMapper());
    }

    @Override
    public List<Event> getEventsForUserByCategory(int user_id, String category) {
        //sql query to get all events by user and category
        String sql = """
                SELECT * FROM events WHERE user_id = ? AND category = ?
                """;
        return jdbcTemplate.query(sql, new Object[]{user_id, category}, new EventRowMapper());
    }

    @Override
    public List<Event> getEventsForUserByGoal(int goal_id) {
        //sql query to get all events by goal
        String sql = """
                SELECT * FROM events WHERE goal_id = ?
                """;
        return jdbcTemplate.query(sql, new Object[]{goal_id}, new EventRowMapper());
    }

    @Override
    public List<Event> getEventsForUserByProject(int project_id) {
        //sql query to get all events by project
        String sql = """
                SELECT * FROM events WHERE project_id = ?
                """;
        return jdbcTemplate.query(sql, new Object[]{project_id}, new EventRowMapper());
    }

    @Override
    public List<Event> getEventsForUserByPlatform(int platform) {
        //sql query to get all events by platform
        String sql = """
                SELECT * FROM events WHERE platform = ?
                """;
        return jdbcTemplate.query(sql, new Object[]{platform}, new EventRowMapper());
    }
}
