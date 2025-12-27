package com.interview.simulator;

public class MCQQuestion extends Questions {

    private String[] options;
    private String correctAnswer;

    public MCQQuestion(String questionText, int marks,
                       String[] options, String correctAnswer) {
        super(questionText, marks);
        this.options = options;
        this.correctAnswer = correctAnswer.toUpperCase();
    }

    public void displayQuestion() {
        System.out.println("Q: " + questionText);
        char label = 'A';
        for (String option : options) {
            System.out.println(label + ". " + option);
            label++;
        }
    }

    @Override
    public int evaluateAnswer(String answer) {
        return answer.equalsIgnoreCase(correctAnswer) ? marks : 0;
    }

}
