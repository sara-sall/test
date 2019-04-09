package com.example.receptapp;

import android.support.annotation.DrawableRes;

import java.util.ArrayList;

public class Recept {
    String title;
    String description;
    ArrayList<String> ingredients;
    String instructions;
    int image;
    int favoriteImage;
    boolean favorite;

    public Recept(){};

    public Recept(String title, String description, int image) {
        this.title = title;
        this.description = description;
        this.image = image;
        this.favoriteImage = R.drawable.ic_favorite_border_black_24dp;
        this.favorite = false;
    }
    public Recept(String title, String description) {
        this.title = title;
        this.description = description;
        this.image = R.drawable.ic_restaurant_color_24dp;
        this.favoriteImage = R.drawable.ic_favorite_border_black_24dp;
        this.favorite = false;
    }
    public Recept(String title, String description, ArrayList ingredients, String instructions) {
        this.title = title;
        this.description = description;
        this.image = R.drawable.ic_restaurant_color_24dp;
        this.favoriteImage = R.drawable.ic_favorite_border_black_24dp;
        this.favorite = false;
        this.ingredients = ingredients;
        this.instructions = instructions;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getFavoriteImage() {
        return favoriteImage;
    }

    public void setFavoriteImage(int favoriteImage) {
        this.favoriteImage = favoriteImage;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }
}

