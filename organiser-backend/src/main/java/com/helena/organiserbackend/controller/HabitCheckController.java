package com.helena.organiserbackend.controller;

import com.helena.organiserbackend.service.HabitCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/habitchecks")
public class HabitCheckController {

    private HabitCheckService habitCheckService;

    @Autowired
    public HabitCheckController(HabitCheckService habitCheckService) {
        this.habitCheckService = habitCheckService;
    }

    //get habit check by id

    //get all habit checks for user

    //get habit checks for user by completed status

    //get habit checks for user by habit

    //post new habit check

    //update habit check

    //delete habit check

}
