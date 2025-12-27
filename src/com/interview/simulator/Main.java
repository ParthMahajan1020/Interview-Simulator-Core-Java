package com.interview.simulator;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Answer = sc.nextLine();
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter Role (Java Intern / Java Developer): ");
        String role = sc.nextLine();

        Candidate candidate = new Candidate(name, role);
        Interview engine = new Interview(candidate);

        System.out.println();

        // -------------- MCQ -------------
        String[] options1 = {
                "Java Virtual Machine",
                "Java Variable Method",
                "Just Virtual Machine",
                "None of the above"
        };

        MCQQuestion mcq1 = new MCQQuestion("What does JVM stands for?", 5, options1, "A");
        engine.addQuestion(mcq1);


        System.out.println();


        // -------------------- Theory ------------------
        String[] theoryKeywords = {
                "object",
                "class",
                "instance",
                "memory"
        };

        TheoryQuestions tq1 = new TheoryQuestions("What is an object in Java?", 10, theoryKeywords);
        engine.addQuestion(tq1);

        System.out.println();



        // ---------------------- Coding ------------------------
        String[] logicKeywords = {
                "loop",
                "reverse",
                "mod",
                "divide"
        };
        CodingQuestions cq1 = new CodingQuestions("Explain the logic to check whether a number is palindrome.", 15, logicKeywords);
        engine.addQuestion(cq1);

        // -------------------- Start Interview --------------------------
        engine.startInterview();

        System.out.println();

        sc.close();
    }
}

