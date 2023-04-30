package com.helena.organiserbackend.controller;

import com.helena.organiserbackend.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    //get all tasks for user

    //get task by id

    //get tasks for user by status

    //create task

    //update task

    //delete task
}
