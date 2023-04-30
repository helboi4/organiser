package com.helena.organiserbackend.service;

import com.helena.organiserbackend.DAO.HabitDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabitService {

    private HabitDAO habitDAO;

    @Autowired
    public HabitService(HabitDAO habitDAO) {
        this.habitDAO = habitDAO;
    }



}
