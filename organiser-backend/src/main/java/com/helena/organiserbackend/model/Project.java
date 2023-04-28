package com.helena.organiserbackend.model;

public class Project {

    private int id;
    private int user_id;
    private int goal_id;
    private String title;
    private String description;
    private String category;
    private String deadline;
    private String date_set;
    private String date_completed;
    private String difficult;
    private String status;

    public Project(int id, int user_id, int goal_id, String title, String description, String category, String deadline, String date_set, String date_completed, String difficult, String status) {
        this.id = id;
        this.user_id = user_id;
        this.goal_id = goal_id;
        this.title = title;
        this.description = description;
        this.category = category;
        this.deadline = deadline;
        this.date_set = date_set;
        this.date_completed = date_completed;
        this.difficult = difficult;
        this.status = status;
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

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getDate_set() {
        return date_set;
    }

    public void setDate_set(String date_set) {
        this.date_set = date_set;
    }

    public String getDate_completed() {
        return date_completed;
    }

    public void setDate_completed(String date_completed) {
        this.date_completed = date_completed;
    }

    public String getDifficult() {
        return difficult;
    }

    public void setDifficult(String difficult) {
        this.difficult = difficult;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
