package com.example.redoyahmed.ezyperl.Model;

/**
 * Created by redoy.ahmed on 20-Feb-2018.
 */

public class TextTutorialItem {

    private String name;
    private int photo;
    private String color;

    public TextTutorialItem(String name, int photo, String color) {
        this.name = name;
        this.photo = photo;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}