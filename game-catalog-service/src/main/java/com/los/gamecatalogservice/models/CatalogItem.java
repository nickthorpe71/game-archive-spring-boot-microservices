package com.los.gamecatalogservice.models;

public class CatalogueItem {

    private String name;
    private String description;
    private int rating;

    public CatalogueItem(String name, String description, int rating) {
        this.name = name;
        this.description = description;
        this.rating = rating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getRating() {
        return rating;
    }


}
