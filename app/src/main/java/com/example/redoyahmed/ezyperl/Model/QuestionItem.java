package com.example.redoyahmed.ezyperl.Model;

public class QuestionItem {
    private String answer;
    private int id;
    private String option_four;
    private String option_one;
    private String option_three;
    private String option_two;
    private String question;
    private String subcategory;

    public QuestionItem(int id, String subcategory, String question, String option_one, String option_two, String option_three, String option_four, String answer) {
        this.id = id;
        this.subcategory = subcategory;
        this.question = question;
        this.option_one = option_one;
        this.option_two = option_two;
        this.option_three = option_three;
        this.option_four = option_four;
        this.answer = answer;
    }

    public int getId() {
        return this.id;
    }

    public String getSubcategory() {
        return this.subcategory;
    }

    public String getQuestion() {
        return this.question;
    }

    public String getOption_one() {
        return this.option_one;
    }

    public String getOption_two() {
        return this.option_two;
    }

    public String getOption_three() {
        return this.option_three;
    }

    public String getOption_four() {
        return this.option_four;
    }

    public String getAnswer() {
        return this.answer;
    }
}
