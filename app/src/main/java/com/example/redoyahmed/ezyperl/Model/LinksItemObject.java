package com.example.redoyahmed.ezyperl.Model;

/**
 * Created by redoy.ahmed on 15-Feb-2018.
 */

public class LinksItemObject {
    private String name;
    private String link;
    private int rating;

    public LinksItemObject(String name, String link, int rating) {
        this.name = name;
        this.link = link;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}