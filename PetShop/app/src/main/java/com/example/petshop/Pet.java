package com.example.petshop;

import java.util.Date;

public abstract class Pet {
    // Attributes
    private String name;
    private Date birthDate;

    public Pet(String name) {
        this.name = name;
    }

    public Pet(Date birthDate, String name) {
        this.birthDate = birthDate;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public abstract String speak();


}
