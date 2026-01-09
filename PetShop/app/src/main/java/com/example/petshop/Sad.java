package com.example.petshop;

public class Sad extends Mood{
    public Sad(String theDate) {
        super(theDate);
    }

    @Override
    public String showMood() {
        return "Sadness!";
    }
}
