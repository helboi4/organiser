package com.helena.organiserbackend.controller;

import com.helena.organiserbackend.service.HabitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/habits")
public class HabitController {

    private HabitService habitService;

    @Autowired
    public HabitController(HabitService habitService) {
        this.habitService = habitService;
    }

    //get habit by id

    //get all habits for user

    //get habits for user by category

    //get habits by goal

    //get habits by project

    //post new habit

    //update habit

    //delete habit

}
