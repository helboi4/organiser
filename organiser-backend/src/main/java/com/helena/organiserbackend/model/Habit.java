package com.helena.organiserbackend.model;

public class Habit {

    private int id;
    private int user_id;
    private int goal_id;
    private int project_id;
    private String title;
    private String description;
    private String category;
    private String date_set;

    public Habit(int id, int user_id, int goal_id, int project_id, String title, String description, String category, String date_set) {
        this.id = id;
        this.user_id = user_id;
        this.goal_id = goal_id;
        this.project_id = project_id;
        this.title = title;
        this.description = description;
        this.category = category;
        this.date_set = date_set;
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

    public String getDate_set() {
        return date_set;
    }

    public void setDate_set(String date_set) {
        this.date_set = date_set;
    }
}
