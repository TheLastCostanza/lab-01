package com.example.petshop;

import java.util.Date;

public class Dog extends Pet implements Pettable{

    public Dog(String name) {
        super(name);
    }

    public Dog(String name, Date birthDate){
        super(birthDate, name);
    }
    @Override
    public String speak() {
        return "Bark!";
    }

    @Override
    public Void pet() {
        return null;
    }
}
