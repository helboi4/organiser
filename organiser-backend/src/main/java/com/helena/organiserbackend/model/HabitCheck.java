package com.helena.organiserbackend.model;

public class HabitCheck {

    private int id;
    private int habit_id;
    private int user_id;
    private boolean completed;

    public HabitCheck(int id, int habit_id, int user_id, boolean completed) {
        this.id = id;
        this.habit_id = habit_id;
        this.user_id = user_id;
        this.completed = completed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHabit_id() {
        return habit_id;
    }

    public void setHabit_id(int habit_id) {
        this.habit_id = habit_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
