package com.helena.organiserbackend.dataAccess;

import com.helena.organiserbackend.DAO.ProjectDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProjectDataAccessService implements ProjectDAO {

    @Autowired
    public ProjectDataAccessService() {
    }
}
