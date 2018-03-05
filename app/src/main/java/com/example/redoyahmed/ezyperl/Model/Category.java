package com.example.redoyahmed.ezyperl.Model;

/**
 * Created by redoy.ahmed on 05-Mar-2018.
 */

public class Category {
    private int id;
    private int language_id;
    private String category;

    public Category() {
        id = 1;
        language_id = 1;
        category = "";
    }

    public Category(int language_id, String category) {
        this.language_id = language_id;
        this.category = category;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLanguage_id(int language_id) {
        this.language_id = language_id;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public int getLanguage_id() {
        return language_id;
    }

    public String getCategory() {
        return category;
    }
}
