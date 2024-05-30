package com.example.task_01.models;

public class NameAndTimeOfDay {

    private String name;
    private String timeOfDay;

    public NameAndTimeOfDay (String name, String timeOfDay) {
        this.name = name;
        this.timeOfDay = timeOfDay;
    }

    public NameAndTimeOfDay() {
        //todo
    }

    public String getName () {
        return this.name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getTimeOfDay () {
        return this.timeOfDay;
    }

    public void setTimeOfDay (String timeOfDay) {
        this.timeOfDay = timeOfDay;
    }


}
