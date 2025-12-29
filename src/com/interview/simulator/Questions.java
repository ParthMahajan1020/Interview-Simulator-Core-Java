package com.interview.simulator;

public abstract class Questions {

    protected String questionText;
    protected int marks;
    protected String difficulty; // MEDIUM / HARD

    public Questions(String questionText, int marks, String difficulty) {
        this.questionText = questionText;
        this.marks = marks;
        this.difficulty = difficulty;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public int getMarks() {
        return marks;
    }

    public abstract void displayQuestion();
    public abstract int evaluateAnswer(String answer);
}
