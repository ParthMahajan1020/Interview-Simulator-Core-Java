package com.interview.simulator;

public class TheoryQuestions extends Questions {

    private String[] keyWords;

    public TheoryQuestions(String questionText, int marks,
                           String difficulty, String[] keyWords) {
        super(questionText, marks, difficulty);
        this.keyWords = keyWords;
    }

    @Override
    public void displayQuestion() {
        System.out.println("Q: " + questionText);
        System.out.print("Explain in short: ");
    }

    @Override
    public int evaluateAnswer(String answer) {
        answer = answer.toLowerCase();
        int match = 0;

        for (String k : keyWords) {
            if (answer.contains(k.toLowerCase())) {
                match++;
            }
        }

        return (match * marks) / keyWords.length;
    }
}
