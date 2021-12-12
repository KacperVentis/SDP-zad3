package com.example.demo;


public class Postgreeting {
    private String text;
    private String time;

    public String getTime() {
        return time;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Postgreeting(String text, String time) {
        this.text=text;
        this.time=time;
    }
}
