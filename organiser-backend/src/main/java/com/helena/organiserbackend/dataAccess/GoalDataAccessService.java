package com.helena.organiserbackend.dataAccess;

import com.helena.organiserbackend.DAO.GoalDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GoalDataAccessService implements GoalDAO {

    @Autowired
    public GoalDataAccessService() {
    }
}
