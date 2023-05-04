package com.helena.organiserbackend.dataAccess;

import com.helena.organiserbackend.DAO.HabitDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HabitDataAccessService implements HabitDAO {

    @Autowired
    public HabitDataAccessService() {
    }
}
