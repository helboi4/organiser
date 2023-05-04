package com.helena.organiserbackend.dataAccess;

import com.helena.organiserbackend.DAO.TaskDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TaskDataAccessService implements TaskDAO {

    @Autowired
    public TaskDataAccessService() {
    }
}
