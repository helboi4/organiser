package com.helena.organiserbackend.controller;

import com.helena.organiserbackend.service.GoalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/goals")
public class GoalController {

    private GoalService goalService;

    @Autowired
    public GoalController(GoalService goalService) {
        this.goalService = goalService;
    }

    //get goal by id

    //get all goals for user

    //get goals for user by category

    //post new goal

    //update goal

    //delete goal
}
