package com.helena.organiserbackend.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Map;

import com.google.api.services.calendar.model.EventAttendee;
import com.google.api.services.calendar.model.EventReminder;
import com.helena.organiserbackend.model.Event;
import org.springframework.jdbc.core.RowMapper;

public class EventRowMapper implements RowMapper<Event> {

    /*I think the issue with this implementation is that there is a lot of room for error in
    creating the arrays of reminders and attendees. I think it would be better to create a
    separate table for reminders and attendees with a foreign key in the events table.
     */
    //TODO: create separate tables for reminders and attendees with foreign key in events table

    private EventReminder[] createRemindersArray(Map<String, String>[] reminders){
        EventReminder[] eventReminders = Arrays.stream(reminders).map(
                reminder ->{
                    EventReminder eventReminder = new EventReminder();
                    eventReminder.setMethod(reminder.get("method"));
                    eventReminder.setMinutes(Integer.parseInt(reminder.get("minutes")));
                    return eventReminder;
                }
        ).toArray(EventReminder[]::new);
        return eventReminders;
    }

    private EventAttendee[] createAttendeesArray(Map<String, String>[] attendees){
        EventAttendee[] eventAttendees = Arrays.stream(attendees).map(
                attendee ->{
                    EventAttendee eventAttendee = new EventAttendee();
                    eventAttendee.setDisplayName(attendee.get("displayName"));
                    eventAttendee.setEmail(attendee.get("email"));
                    eventAttendee.setOptional(Boolean.parseBoolean(attendee.get("optional")));
                    eventAttendee.setResponseStatus(attendee.get("responseStatus"));
                    eventAttendee.setComment(attendee.get("comment"));
                    return eventAttendee;
                }
        ).toArray(EventAttendee[]::new);
        return eventAttendees;
    }

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
            createRemindersArray((Map<String, String>[]) rs.getArray("reminders").getArray()),
            createAttendeesArray((Map<String, String>[]) rs.getArray("attendees").getArray()),
            rs.getString("link"),
            rs.getString("platform"),
            (String[])rs.getArray("recurrence").getArray(),
            rs.getString("location")
        );

        return event;
    }

}
