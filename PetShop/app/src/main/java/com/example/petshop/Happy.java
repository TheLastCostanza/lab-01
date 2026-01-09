package com.example.petshop;

public class Happy extends Mood{
    public Happy(String theDate) {
        super(theDate);
    }

    @Override
    public String showMood() {
        return "Happiness!";
    }
}
