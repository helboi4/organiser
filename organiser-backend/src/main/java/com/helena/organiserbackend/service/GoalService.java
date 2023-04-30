package com.helena.organiserbackend.service;

import com.helena.organiserbackend.DAO.GoalDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoalService {

    private GoalDAO goalDAO;

    @Autowired
    public GoalService(GoalDAO goalDAO) {
        this.goalDAO = goalDAO;
    }

}
