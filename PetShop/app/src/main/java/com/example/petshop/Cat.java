package com.example.petshop;

import java.util.Date;

public class Cat extends Pet implements Pettable{
    public Cat(String name) {
        super(name);
    }

    public Cat(String name, Date birthDate){
        super(birthDate, name);
    }

    @Override
    public String speak() {
        return "";
    }

    @Override
    public Void pet() {
        return null;
    }
}
