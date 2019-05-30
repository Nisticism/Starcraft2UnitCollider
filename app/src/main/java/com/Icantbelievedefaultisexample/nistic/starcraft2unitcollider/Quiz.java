package com.Icantbelievedefaultisexample.nistic.starcraft2unitcollider;

import android.util.Pair;

import java.util.ArrayList;

public class Quiz {

    private Integer questionCount;
    private ArrayList<QuestionAnswer> questionAnswer;
    private String timer;

    //  Constructor

    public Quiz(Integer questionCount, ArrayList<QuestionAnswer> questionAnswer, String timer) {
        this.questionCount = questionCount;
        this.questionAnswer = questionAnswer;
        this.timer = timer;
    }

    //  Setters

    public void setQuestionCount(Integer questionCount) {
        this.questionCount = questionCount;
    }

    public void setQuestionAnswer(ArrayList<QuestionAnswer> questionAnswer) {
        this.questionAnswer = questionAnswer;
    }

    public void setTimer(String timer) {
        this.timer = timer;
    }


    //  Getters

    public Integer getQuestionCount() {
        return questionCount;
    }

    public ArrayList<QuestionAnswer> getQuestionAnswer() {
        return questionAnswer;
    }

    public String getTimer() {
        return timer;
    }
}
