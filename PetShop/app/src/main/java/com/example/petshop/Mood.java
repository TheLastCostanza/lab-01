package com.example.petshop;

import java.util.Date;

public abstract class Mood {
    private Date theDate;

    public Mood(String theDate) {
        this.theDate = new Date();
    }

    public Mood(Date theDate) {
        this.theDate = theDate;
    }

    public Date getTheDate() {
        return theDate;
    }

    public void setTheDate(Date theDate) {
        this.theDate = theDate;
    }

    public abstract String showMood();
}
