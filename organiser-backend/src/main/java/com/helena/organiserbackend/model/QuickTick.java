package com.helena.organiserbackend.model;

public class QuickTick {

    private int id;
    private int user_id;
    private int goal_id;
    private String title;
    private String category;

    public QuickTick(int id, int user_id, int goal_id, String title, String category) {
        this.id = id;
        this.user_id = user_id;
        this.goal_id = goal_id;
        this.title = title;
        this.category = category;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
