package com.project.attendease.models;

public class Notification {
    private String title;
    private String message;
    private String time;

    public Notification(String title, String message, String time) {
        this.title = title;
        this.message = message;
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
