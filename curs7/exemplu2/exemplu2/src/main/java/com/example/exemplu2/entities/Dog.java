package com.example.exemplu2.entities;

import com.example.exemplu2.pk.DogPk;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Dog {

    @EmbeddedId
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private DogPk dogPk;

    private String name;
    private String color;

    public DogPk getDogPk() {
        return dogPk;
    }

    public void setDogPk(DogPk dogPk) {
        this.dogPk = dogPk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
