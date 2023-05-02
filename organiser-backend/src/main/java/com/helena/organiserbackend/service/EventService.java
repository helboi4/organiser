package com.helena.organiserbackend.service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.text.MessageFormat;
import java.util.List;

import com.google.gson.Gson;
import com.helena.organiserbackend.DAO.EventDAO;
import com.helena.organiserbackend.model.Event;
import org.apache.catalina.valves.JsonAccessLogValve;
import org.apache.logging.log4j.message.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventService {

    private EventDAO eventDAO;

    @Autowired
    public EventService(EventDAO eventDAO) {
        this.eventDAO = eventDAO;
    }

    public Event getEventbyId(int id) {
        return eventDAO.getEventbyId(id);
    }

    public List<Event> getAllEventsForUser(int user_id) {
        return eventDAO.getAllEventsForUser(user_id);
    }

    public List<Event> getEventsForUserByCategory(int user_id, String category) {
        return eventDAO.getEventsForUserByCategory(user_id, category);
    }

    public List<Event> getEventsForUserByGoal(int goal_id) {
        return eventDAO.getEventsForUserByGoal(goal_id);
    }

    public List<Event> getEventsForUserByProject(int project_id) {
        return eventDAO.getEventsForUserByProject(project_id);
    }

    public List<Event> getEventsForUserByPlatform(int platform_id) {
        return eventDAO.getEventsForUserByPlatform(platform_id);
    }

    public void postNewEvent(Event event) {
        /*we need to do some logic here to
        1.check if the event is valid
        2.post event to relevant platform (google or outlook or both) using API
        3.add event to db (eventDAO.postNewEvent(event))
        4.return response to front end
        5.handle errors
        **/
        switch(event.getPlatform()){
            case "Google":
                //post to google
                try {
                    HttpResponse<String> response = postToGoogle(event);
                    System.out.println(response.body());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case "Outlook":
                //post to outlook
                break;
            case "Both":
                //post to both
                break;
            case "None":
                //post to neither
                break;
            default:
                //error
        }


    }

    private HttpResponse<String> postToGoogle(Event event) throws Exception{
        //TODO: Edit the attendees field to reflect Google's format
        String json = MessageFormat.format(
        """
                {
                    "summary": "{0}",
                    "location": "{1}",
                    "description": "{2}",
                    "start": {
                        "dateTime": "{3}",
                        "timeZone": "London"
                    },
                    "end": {
                        "dateTime": "{4}",
                        "timeZone": "London"
                    },
                    "recurrence": [
                        "{5}"
                    ],
                    "attendees": {6},
                    "reminders": {7}
        
                }
                """, event.getTitle(), event.getLocation(), event.getDescription(), event.getStart_datetime(), event.getEnd_datetime(), event.getReccurrence(), event.getAttendees(), event.getReminders());
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                                         .uri(URI.create("https://www.googleapis.com/calendar/v3/calendars/calendarId/events"))
                                         .POST(HttpRequest.BodyPublishers.ofString(json))
                                         .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response;
    }

    private HttpResponse<String> postToOutlook(Event event) throws Exception{
        //TODO: Edit the attendees field to reflect Microsoft's format
        String json = MessageFormat.format(
        """
                {
                    "Subject": "{0}",
                    "Location": { "displayName": "{1}"},
                    "Body": {
                        "ContentType": "HTML",
                        "Content": "{2}"
                    },
                    "Start": {
                        "DateTime": "{3}",
                        "TimeZone": "London"
                    },
                    "End": {
                        "DateTime": "{4}",
                        "TimeZone": "London"
                    },
                    "Recurrence": [
                        "{5}"
                    ],
                    "Attendees": {6},
                    "Reminders": {7}
        
                }
                """, event.getTitle(), event.getLocation(), event.getDescription(), event.getStart_datetime(), event.getEnd_datetime(), event.getReccurrence(), event.getAttendees(), event.getReminders());
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                                         .uri(URI.create("https://outlook.office.com/api/v2.0/me/events"))
                                         .POST(HttpRequest.BodyPublishers.ofString(json))
                                         .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response;
    }

    public void updateEvent(Event event) {
        /*we need to do some logic here to
        1.check if the event is valid
        2.post event to relevant platform (google or outlook or both) using API
        3.update event in db (eventDAO.updateEvent(event))
        4.return response to front end
        5.handle errors
         **/
    }

    public void deleteEvent(int id) {
        /*we need to do some logic here to
        1.delete event on relevant platform (google or outlook or both) using API
        2.delete event in db (eventDAO.deleteEvent(id))
        3.return response to front end
        4.handle errors
         **/
    }
}
