package com.helena.organiserbackend.service;

import com.helena.organiserbackend.DAO.ProjectDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    private ProjectDAO projectDAO;

    @Autowired
    public ProjectService(ProjectDAO projectDAO) {
        this.projectDAO = projectDAO;
    }




}
