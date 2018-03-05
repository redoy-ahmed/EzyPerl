package com.example.redoyahmed.ezyperl.Model;

public class QuestionItem {
    private int id;
    private String category;
    private String question;
    private String option_four;
    private String option_one;
    private String option_three;
    private String option_two;
    private int answer;

    public QuestionItem() {
        id = 0;
        category = "";
        question = "";
        option_one = "";
        option_two = "";
        option_three = "";
        option_four = "";
        answer = 0;
    }

    public QuestionItem(String category, String question, String option_one, String option_two, String option_three, String option_four, int answer) {
        this.category = category;
        this.question = question;
        this.option_one = option_one;
        this.option_two = option_two;
        this.option_three = option_three;
        this.option_four = option_four;
        this.answer = answer;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setOption_four(String option_four) {
        this.option_four = option_four;
    }

    public void setOption_one(String option_one) {
        this.option_one = option_one;
    }

    public void setOption_three(String option_three) {
        this.option_three = option_three;
    }

    public void setOption_two(String option_two) {
        this.option_two = option_two;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public int getId() {
        return this.id;
    }

    public String getCategory() {
        return this.category;
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

    public int getAnswer() {
        return this.answer;
    }
}
