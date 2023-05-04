package com.helena.organiserbackend.dataAccess;

import com.helena.organiserbackend.DAO.QuickTickDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class QuickTickDataAccessService implements QuickTickDAO {

    @Autowired
    public QuickTickDataAccessService() {
    }
}
