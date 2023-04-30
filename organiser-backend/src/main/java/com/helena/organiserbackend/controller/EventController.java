package com.helena.organiserbackend.controller;

import com.helena.organiserbackend.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
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

    //get all events for user

    //get events for user by category

    //get events for user by goal

    //get events for user by project

    //get events for user by platform

    //post new event

    //update event

    //delete event

}
