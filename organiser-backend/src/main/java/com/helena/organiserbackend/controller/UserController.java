package com.helena.organiserbackend.controller;

import com.helena.organiserbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    //get user by id

    //get user by username

    //get user by email

    //get all users

    //post new user

    //update user

    //delete user


}
