package com.interview.simulator;

import java.util.*;

public class Interview {

    private Candidate candidate;
    private List<Questions> questions;
    private Scanner sc = new Scanner(System.in);

    public Interview(Candidate candidate) {
        this.candidate = candidate;
        this.questions = new ArrayList<>();
    }

    public void addQuestion(Questions q) {
        questions.add(q);
    }

    public void startInterview() {

        String difficulty = candidate.getRole().equalsIgnoreCase("INTERN")
                ? "HARD" : "MEDIUM";

        int mcqScore = 0, theoryScore = 0, codingScore = 0;
        int mcqTotal = 0, theoryTotal = 0, codingTotal = 0;

        System.out.println("\nInterview Level: " + difficulty);
        System.out.println("--------------------------------");

        for (Questions q : questions) {

            if (!q.getDifficulty().equalsIgnoreCase(difficulty)) continue;

            q.displayQuestion();
            String answer = sc.nextLine();
            int score = q.evaluateAnswer(answer);

            if (q instanceof MCQQuestion) {
                mcqScore += score;
                mcqTotal += q.getMarks();
            } else if (q instanceof TheoryQuestions) {
                theoryScore += score;
                theoryTotal += q.getMarks();
            } else {
                codingScore += score;
                codingTotal += q.getMarks();
            }

            candidate.addScore(score);
            System.out.println("Marks Awarded: " + score + "\n");
        }

        int totalScore = mcqScore + theoryScore + codingScore;
        int totalMarks = mcqTotal + theoryTotal + codingTotal;
        double percentage = (totalScore * 100.0) / totalMarks;

        String grade =
                percentage >= 85 ? "A" :
                        percentage >= 70 ? "B" :
                                percentage >= 55 ? "C" : "D";

        System.out.println("=========== SCORECARD ===========");
        System.out.println("MCQ    : " + mcqScore + "/" + mcqTotal);
        System.out.println("Theory : " + theoryScore + "/" + theoryTotal);
        System.out.println("Coding : " + codingScore + "/" + codingTotal);
        System.out.printf("Percentage: %.2f%%\n", percentage);
        System.out.println("Grade: " + grade);

        System.out.println("\n--- Interview Feedback ---");
        if (percentage >= 80)
            System.out.println("Strong technical foundation. Recommended.");
        else if (percentage >= 60)
            System.out.println("Decent understanding. Needs improvement.");
        else
            System.out.println("Fundamentals need work.");

        System.out.println("\nThank you for attending the interview.");
    }
}
