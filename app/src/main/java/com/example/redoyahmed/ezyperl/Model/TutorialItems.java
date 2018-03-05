package com.example.redoyahmed.ezyperl.Model;

/**
 * Created by redoy.ahmed on 05-Mar-2018.
 */

public class TutorialItems {
    private int id;
    private int language_id;
    private int category_id;
    private String tutorial_name;
    private String tutorial_details;
    private String tutorial_code;

    public TutorialItems() {
        id = 1;
        language_id = 1;
        category_id = 1;
        tutorial_name = "";
        tutorial_details = "";
        tutorial_code = "";
    }

    public TutorialItems(int language_id, int category_id, String tutorial_name, String tutorial_details, String tutorial_code) {
        this.language_id = language_id;
        this.category_id = category_id;
        this.tutorial_name = tutorial_name;
        this.tutorial_details = tutorial_details;
        this.tutorial_code = tutorial_code;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLanguage_id(int language_id) {
        this.language_id = language_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public void setTutorial_name(String tutorial_name) {
        this.tutorial_name = tutorial_name;
    }

    public void setTutorial_details(String tutorial_details) {
        this.tutorial_details = tutorial_details;
    }

    public void setTutorial_code(String tutorial_code) {
        this.tutorial_code = tutorial_code;
    }

    public int getId() {
        return id;
    }

    public int getLanguage_id() {
        return language_id;
    }

    public int getCategory_id() {
        return category_id;
    }

    public String getTutorial_name() {
        return tutorial_name;
    }

    public String getTutorial_details() {
        return tutorial_details;
    }

    public String getTutorial_code() {
        return tutorial_code;
    }
}
