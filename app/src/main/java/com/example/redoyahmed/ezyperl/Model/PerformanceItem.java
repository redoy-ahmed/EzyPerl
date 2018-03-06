package com.example.redoyahmed.ezyperl.Model;

public class PerformanceItem {
    private int categoryID;
    private String category;
    private int totalQuestion;
    private int correctAnswer;

    public PerformanceItem() {
        categoryID = 0;
        category = "";
        totalQuestion = 0;
        correctAnswer = 0;
    }

    public PerformanceItem(int categoryID, String category, int totalQuestion, int correctAnswer) {
        this.categoryID = categoryID;
        this.category = category;
        this.totalQuestion = totalQuestion;
        this.correctAnswer = correctAnswer;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setTotalQuestion(int totalQuestion) {
        this.totalQuestion = totalQuestion;
    }

    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public String getCategory() {
        return category;
    }

    public int getTotalQuestion() {
        return totalQuestion;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }
}
