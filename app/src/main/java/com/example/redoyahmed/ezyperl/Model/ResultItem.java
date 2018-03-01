package com.example.redoyahmed.ezyperl.Model;

public class ResultItem {
    private String Question;
    private String correct;
    private int isAnswer;
    private String questionNumber;
    private String wrong;

    public ResultItem(String questionNumber, String question, String correct, String wrong, int isAnswer) {
        this.questionNumber = questionNumber;
        this.Question = question;
        this.correct = correct;
        this.wrong = wrong;
        this.isAnswer = isAnswer;
    }

    public String getQuestionNumber() {
        return this.questionNumber;
    }

    public String getQuestion() {
        return this.Question;
    }

    public String getCorrect() {
        return this.correct;
    }

    public String getWrong() {
        return this.wrong;
    }

    public int getIsAnswer() {
        return this.isAnswer;
    }
}
