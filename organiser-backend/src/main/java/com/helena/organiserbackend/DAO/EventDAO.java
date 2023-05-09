package com.helena.organiserbackend.DAO;

import java.util.List;

import com.google.api.services.calendar.model.EventAttendee;
import com.google.api.services.calendar.model.EventReminder;
import com.helena.organiserbackend.model.Event;

public interface EventDAO {
    Event getEventbyId(int id);

    List<Event> getAllEventsForUser(int user_id);

    List<Event> getEventsForUserByCategory(int user_id, String category);

    List<Event> getEventsForUserByGoal(int goal_id);

    List<Event> getEventsForUserByProject(int project_id);

    List<Event> getEventsForUserByPlatform(int platform);

    String postNewEvent(Event event);

    Integer[] postNewReminders(int event_id, int user_id, List<EventReminder> reminders)

    Integer[] postNewAttendees(int event_id, int user_id, List<EventAttendee> attendees);


}
