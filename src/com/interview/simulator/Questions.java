package com.interview.simulator;

public abstract class Questions {

    protected String questionText;
    protected int marks;

    public Questions(String questionText, int marks) {
        this.questionText = questionText;
        this.marks = marks;
    }

    public abstract int evaluateAnswer(String answer);
}
