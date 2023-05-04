package com.helena.organiserbackend.dataAccess;

import com.helena.organiserbackend.DAO.HabitCheckDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HabitCheckDataAccessService implements HabitCheckDAO {

    @Autowired
    public HabitCheckDataAccessService() {
    }
}
