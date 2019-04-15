package com.example.demo.model;

public class Card {
    String ownerName;

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "Card{" +
                "ownerName='" + ownerName + '\'' +
                '}';
    }
}
