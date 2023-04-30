package com.helena.organiserbackend.service;

import com.helena.organiserbackend.DAO.HabitCheckDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabitCheckService {

    private HabitCheckDAO habitCheckDAO;

    @Autowired
    public HabitCheckService(HabitCheckDAO habitCheckDAO) {
        this.habitCheckDAO = habitCheckDAO;
    }

}
