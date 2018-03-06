package com.example.redoyahmed.ezyperl.Model;

/**
 * Created by redoy.ahmed on 05-Mar-2018.
 */

public class Category {
    private int id;
    private int language_id;
    private String category;
    private int level;

    public Category() {
        id = 1;
        language_id = 1;
        category = "";
        level = 1;
    }

    public Category(int language_id, String category, int level) {
        this.language_id = language_id;
        this.category = category;
        this.level = level;
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

    public void setLevel(int level) {
        this.level = level;
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

    public int getLevel() {
        return level;
    }
}
