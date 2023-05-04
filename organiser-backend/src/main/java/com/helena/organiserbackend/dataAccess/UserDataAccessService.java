package com.helena.organiserbackend.dataAccess;

import com.helena.organiserbackend.DAO.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDataAccessService implements UserDAO {

    @Autowired
    public UserDataAccessService() {
    }
}
