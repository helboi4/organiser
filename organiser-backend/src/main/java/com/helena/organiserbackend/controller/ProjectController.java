package com.helena.organiserbackend.controller;

import com.helena.organiserbackend.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/projects")
public class ProjectController {

    private ProjectService projectService;

    @Autowired
    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    //get project by id

    //get all projects for user

    //get projects for user by status

    //get projects for user by goal

    //get projects for user by category

    //post new project

    //update project

    //delete project

}
