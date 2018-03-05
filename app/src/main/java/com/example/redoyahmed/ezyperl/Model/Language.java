package com.example.redoyahmed.ezyperl.Model;

/**
 * Created by redoy.ahmed on 05-Mar-2018.
 */

public class Language {
    private int id;
    private String name;

    public Language() {
        id = 0;
        name = "";
    }

    public Language(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
