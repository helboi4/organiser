package com.helena.organiserbackend;

import com.google.api.services.calendar.Calendar;
import com.helena.organiserbackend.GoogleTools.GoogleCalendarService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrganiserBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrganiserBackendApplication.class, args);
	}

}
