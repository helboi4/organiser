package com.helena.organiserbackend.controller;

import com.helena.organiserbackend.service.QuickTickService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/quickticks")
public class QuickTickController {

    public QuickTickService quickTickService;

    @Autowired
    public QuickTickController(QuickTickService quickTickService) {
        this.quickTickService = quickTickService;
    }

    //get quicktick by id

    //get all quickticks for user

    //get quickticks for user by category

    //post new quicktick

    //update quicktick

    //delete quicktick

}
