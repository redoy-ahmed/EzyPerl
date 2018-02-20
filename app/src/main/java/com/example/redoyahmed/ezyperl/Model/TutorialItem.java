package com.example.redoyahmed.ezyperl.Model;

/**
 * Created by redoy.ahmed on 20-Feb-2018.
 */

public class TutorialItem {
    private String name;
    private int photo;

    public TutorialItem(String name, int photo) {
        this.name = name;
        this.photo = photo;
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
}
