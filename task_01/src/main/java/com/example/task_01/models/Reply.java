package com.example.task_01.models;

public class Reply {

    private String name;
    private String timeofDay;

    public Reply(String name, String timeofDay) {
        this.name = name;
        this.timeofDay = timeofDay;
    }

    public Reply() {

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTimeofDay() {
        return this.timeofDay;
    }

    public void setTimeofDay(String timeofDay) {
        this.timeofDay = timeofDay;
    }
}
