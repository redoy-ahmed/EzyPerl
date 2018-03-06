package com.example.redoyahmed.ezyperl.Model;

public class PerformanceItem {
    private String category;
    private int totalQuestion;
    private int correctAnswer;

    public PerformanceItem() {
        category = "";
        totalQuestion = 0;
        correctAnswer = 0;
    }

    public PerformanceItem(String category, int totalQuestion, int correctAnswer) {
        this.category = category;
        this.totalQuestion = totalQuestion;
        this.correctAnswer = correctAnswer;
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
