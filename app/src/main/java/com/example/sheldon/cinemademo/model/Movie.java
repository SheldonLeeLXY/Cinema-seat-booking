package com.example.sheldon.cinemademo.model;

public class Movie {
    private String name, description;
    private int image;

    public Movie() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public Movie(String name, String description, int image) {
        this.name = name;
        this.description = description;
        this.image = image;

    }
}
