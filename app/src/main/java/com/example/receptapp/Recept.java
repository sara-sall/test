package com.example.receptapp;

import android.support.annotation.DrawableRes;

public class Recept {
    String title;
    String description;
    int image;
    int favoriteImage;
    boolean favorite;

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

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

    public int getImage(){
        return image;
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
    public int getFavoriteImage() {
        return favoriteImage;
    }

    public void setFavoriteImage(int favoriteImage) {
        this.favoriteImage = favoriteImage;
    }

}

