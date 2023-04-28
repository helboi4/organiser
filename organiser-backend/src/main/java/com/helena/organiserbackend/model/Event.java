package com.helena.organiserbackend.model;

public class Event {

    private int id;
    private int user_id;
    private int goal_id;
    private int project_id;
    private String title;
    private String description;
    private String category;
    private String start_datetime;
    private String end_datetime;
    private String[] reminders;
    private String[] attendees;
    private String link;
    private String location;

    public Event(int id, int user_id, int goal_id, int project_id, String title, String description, String category, String start_datetime, String end_datetime, String[] reminders, String[] attendees, String link, String location) {
        this.id = id;
        this.user_id = user_id;
        this.goal_id = goal_id;
        this.project_id = project_id;
        this.title = title;
        this.description = description;
        this.category = category;
        this.start_datetime = start_datetime;
        this.end_datetime = end_datetime;
        this.reminders = reminders;
        this.attendees = attendees;
        this.link = link;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getGoal_id() {
        return goal_id;
    }

    public void setGoal_id(int goal_id) {
        this.goal_id = goal_id;
    }

    public int getProject_id() {
        return project_id;
    }

    public void setProject_id(int project_id) {
        this.project_id = project_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getStart_datetime() {
        return start_datetime;
    }

    public void setStart_datetime(String start_datetime) {
        this.start_datetime = start_datetime;
    }

    public String getEnd_datetime() {
        return end_datetime;
    }

    public void setEnd_datetime(String end_datetime) {
        this.end_datetime = end_datetime;
    }

    public String[] getReminders() {
        return reminders;
    }

    public void setReminders(String[] reminders) {
        this.reminders = reminders;
    }

    public String[] getAttendees() {
        return attendees;
    }

    public void setAttendees(String[] attendees) {
        this.attendees = attendees;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
