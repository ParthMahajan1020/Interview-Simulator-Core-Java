package com.interview.simulator;

public class CodingQuestions extends Questions {

    private String[] logicKeyWords;

    public CodingQuestions(String questionText, int marks,
                           String difficulty, String[] logicKeyWords) {
        super(questionText, marks, difficulty);
        this.logicKeyWords = logicKeyWords;
    }

    @Override
    public void displayQuestion() {
        System.out.println("Q: " + questionText);
        System.out.print("Explain the logic: ");
    }

    @Override
    public int evaluateAnswer(String answer) {
        answer = answer.toLowerCase();
        int match = 0;

        for (String k : logicKeyWords) {
            if (answer.contains(k.toLowerCase())) {
                match++;
            }
        }

        int score = (match * marks) / logicKeyWords.length;
        if (answer.length() > 60) score += 2;

        return Math.min(score, marks);
    }
}
