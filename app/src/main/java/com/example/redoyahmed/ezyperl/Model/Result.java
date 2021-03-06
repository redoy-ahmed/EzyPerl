package com.example.redoyahmed.ezyperl.Model;

/**
 * Created by redoy.ahmed on 05-Mar-2018.
 */

public class Result {

    private int id;
    private int language_id;
    private int category_id;
    private int times_played;
    private int total_question;
    private int correct_answer;
    private int level;

    public Result() {
        id = 1;
        language_id = 1;
        category_id = 1;
        times_played = 1;
        total_question = 1;
        correct_answer = 1;
        level = 1;
    }

    public Result(int language_id, int category_id, int times_played, int total_question, int correct_answer, int level) {
        this.language_id = language_id;
        this.category_id = category_id;
        this.times_played = times_played;
        this.total_question = total_question;
        this.correct_answer = correct_answer;
        this.level = level;
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

    public void setTimes_played(int times_played) {
        this.times_played = times_played;
    }

    public void setTotal_question(int total_question) {
        this.total_question = total_question;
    }

    public void setCorrect_answer(int correct_answer) {
        this.correct_answer = correct_answer;
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

    public int getCategory_id() {
        return category_id;
    }

    public int getTimes_played() {
        return times_played;
    }

    public int getTotal_question() {
        return total_question;
    }

    public int getCorrect_answer() {
        return correct_answer;
    }

    public int getLevel() {
        return level;
    }
}
