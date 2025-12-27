package com.interview.simulator;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Interview {
    private Candidate candidate;
    private List<Questions> questions;
    private Scanner scanner;

    public Interview(Candidate candidate) {
        this.candidate = candidate;
        this.questions = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void addQuestion(Questions question){
        questions.add(question);
    }

    public void startInterview(){
        System.out.println("Interview started for " + candidate.getName());
        System.out.println("----------------------------------------------------------------");
        for(Questions question : questions){
            if (question instanceof MCQQuestion) {
                ((MCQQuestion)question).displayQuestion();
            } else{
                System.out.println("Q: " + question.questionText);
            }
            System.out.println("Your Answer: ");
            String asnwer = scanner.nextLine();

            int score = question.evaluateAnswer(asnwer);
            candidate.addScore(score);

            System.out.println("Marks awarded: " + score);
            System.out.println("Current Score: " + candidate.getTotalScore());

            System.out.println();
        }
    }
}
