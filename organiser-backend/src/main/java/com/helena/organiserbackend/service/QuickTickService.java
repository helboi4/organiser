package com.helena.organiserbackend.service;

import com.helena.organiserbackend.DAO.QuickTickDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuickTickService {

    private QuickTickDAO quickTickDAO;

    @Autowired
    public QuickTickService(QuickTickDAO quickTickDAO) {
        this.quickTickDAO = quickTickDAO;
    }


}
