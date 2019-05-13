package com.example.nosqltest.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

public class Movie {

    @Id
    private String id; // pt MongoDB id este String

    private String title;
    private String genre;
    private int rating;

//    @DBRef // ca un foreign key - salvam dupa referinta
    private Cast cast;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Cast getCast() {
        return cast;
    }

    public void setCast(Cast cast) {
        this.cast = cast;
    }
}
