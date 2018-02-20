package com.example.redoyahmed.ezyperl.Model;

/**
 * Created by redoy.ahmed on 20-Feb-2018.
 */

public class VideoTutorialItem {
    private String name;
    private String photo;
    private String color;

    public VideoTutorialItem(String name, String photo, String color) {
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

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
