package com.interview.simulator;

public class MCQQuestion extends Questions {

    private String[] options;
    private String correctAnswer;

    public MCQQuestion(String questionText, int marks,
                       String difficulty, String[] options, String correctAnswer) {
        super(questionText, marks, difficulty);
        this.options = options;
        this.correctAnswer = correctAnswer.toUpperCase();
    }

    @Override
    public void displayQuestion() {
        System.out.println("Q: " + questionText);
        char label = 'A';
        for (String option : options) {
            System.out.println(label + ". " + option);
            label++;
        }
        System.out.print("Enter option (A/B/C/D): ");
    }

    @Override
    public int evaluateAnswer(String answer) {
        return answer.equalsIgnoreCase(correctAnswer) ? marks : 0;
    }
}
