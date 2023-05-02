package com.helena.organiserbackend.controller;

import java.util.List;

import com.helena.organiserbackend.model.Event;
import com.helena.organiserbackend.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/events")
public class EventController {

    private EventService eventService;

    @Autowired
    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    //get event by id
    @GetMapping("/id")
    public Event getEventbyId(@RequestParam("id") int id) {
        return eventService.getEventbyId(id);
    }

    //get all events for user
    @GetMapping("/all")
    public List<Event> getAllEventsForUser(@RequestParam("user_id") int user_id) {
        return eventService.getAllEventsForUser(user_id);
    }

    //get events for user by category

    @GetMapping("/category")
    public List<Event> getEventsForUserByCategory(@RequestParam("user_id") int user_id, @RequestParam("category") String category) {
        return eventService.getEventsForUserByCategory(user_id, category);
    }

    //get events for user by goal
    @GetMapping("/goal")
    public List<Event> getEventsForUserByGoal(@RequestParam("goal_id") int goal_id) {
        return eventService.getEventsForUserByGoal(goal_id);
    }

    //get events for user by project
    @GetMapping("/project")
    public List<Event> getEventsForUserByProject(@RequestParam("project_id") int project_id) {
        return eventService.getEventsForUserByProject(project_id);
    }

    //get events for user by platform
    @GetMapping("/platform")
    public List<Event> getEventsForUserByPlatform(@RequestParam("platform") int platform) {
        return eventService.getEventsForUserByPlatform(platform);
    }

    //post new event
    @PostMapping("/new")
    public void postNewEvent(@RequestBody Event event) {
        eventService.postNewEvent(event);
    }

    //update event
    @PutMapping("/update")
    public void updateEvent(@RequestBody Event event) {
        eventService.updateEvent(event);
    }

    //delete event
    @DeleteMapping("/delete")
    public void deleteEvent(@RequestParam("id") int id) {
        eventService.deleteEvent(id);
    }

}
