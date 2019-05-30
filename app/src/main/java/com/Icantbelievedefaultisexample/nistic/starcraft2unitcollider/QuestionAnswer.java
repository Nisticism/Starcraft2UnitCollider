package com.Icantbelievedefaultisexample.nistic.starcraft2unitcollider;

public class QuestionAnswer {

    private String question;
    private String answer;

    //  Constructor

    public QuestionAnswer(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    //  Setters
    public void setQuestion(String question) {
        this.question = question;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    //  Getters

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }
}

