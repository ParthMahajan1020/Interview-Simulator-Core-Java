package com.interview.simulator;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter Role (Java Intern / Java Developer): ");
        String role = sc.nextLine();

        Candidate candidate = new Candidate(name, role);
        Interview engine = new Interview(candidate);

        System.out.println();

        // -------------- MCQ -------------
        String[] options10 = {
                "Java Virtual Machine",
                "Java Variable Method",
                "Just Virtual Machine",
                "None of the above"
        };

        MCQQuestion mcq10 = new MCQQuestion("What does JVM stands for?", 5, "MEDIUM", options10, "A");
        engine.addQuestion(mcq10);

        String[] options1 = {
                "21",
                "22",
                "23",
                "24"
        };
        MCQQuestion mcq1 = new MCQQuestion(
                "What will be the output of: int a=10; System.out.println(a++ + ++a);",
                5, "HARD", options1, "C"
        );
        engine.addQuestion(mcq1);

        String[] options2 = {
                "finalize() is called manually",
                "finally is used for cleanup code",
                "final is used only for methods",
                "finally runs only if exception occurs"
        };
        MCQQuestion mcq2 = new MCQQuestion(
                "Which statement about final, finally and finalize is correct?",
                5, "HARD", options2, "B"
        );
        engine.addQuestion(mcq2);

        String[] options3 = {
                "HashSet",
                "TreeSet",
                "ArrayList",
                "LinkedHashSet"
        };
        MCQQuestion mcq3 = new MCQQuestion(
                "Which collection allows duplicate elements?",
                5, "HARD", options3, "C"
        );
        engine.addQuestion(mcq3);

        String[] options4 = {
                "Program runs normally",
                "Compile time error",
                "Runtime error",
                "JVM cannot access main method"
        };
        MCQQuestion mcq4 = new MCQQuestion(
                "What happens if main() method is private?",
                5, "HARD", options4, "D"
        );
        engine.addQuestion(mcq4);

        String[] options5 = {
                "Serializable",
                "Cloneable",
                "RandomAccess",
                "Runnable"
        };
        MCQQuestion mcq5 = new MCQQuestion(
                "Which of the following is NOT a marker interface?",
                5, "HARD", options5, "D"
        );
        engine.addQuestion(mcq5);

        String[] options6 = {"true", "false", "0", "null"};
        MCQQuestion mcq6 = new MCQQuestion(
                "What is the default value of boolean variable?",
                5, "MEDIUM", options6, "B"
        );
        engine.addQuestion(mcq6);

        String[] options7 = {"implements", "extends", "inherit", "super"};
        MCQQuestion mcq7 = new MCQQuestion(
                "Which keyword is used to inherit a class?",
                5, "MEDIUM", options7, "B"
        );
        engine.addQuestion(mcq7);

        String[] options8 = {"2 bytes", "4 bytes", "8 bytes", "Depends on OS"};
        MCQQuestion mcq8 = new MCQQuestion(
                "What is the size of int data type in Java?",
                5, "MEDIUM", options8, "B"
        );
        engine.addQuestion(mcq8);

        String[] options9 = {"for", "while", "do-while", "foreach"};
        MCQQuestion mcq9 = new MCQQuestion(
                "Which loop executes at least once?",
                5, "MEDIUM", options9, "C"
        );
        engine.addQuestion(mcq9);

        System.out.println();


        // -------------------- Theory ------------------
        String[] theoryKeywords1 = {"overloading", "overriding", "inheritance", "polymorphism"};
        TheoryQuestions tq1 = new TheoryQuestions(
                "Explain method overloading and method overriding.",
                10, "MEDIUM", theoryKeywords1
        );
        engine.addQuestion(tq1);

        String[] theoryKeywords2 = {"autoboxing", "unboxing", "wrapper", "primitive"};
        TheoryQuestions tq2 = new TheoryQuestions(
                "Explain autoboxing and unboxing in Java.",
                10, "MEDIUM", theoryKeywords2
        );
        engine.addQuestion(tq2);

        String[] theoryKeywords3 = {"stack", "heap", "memory", "objects"};
        TheoryQuestions tq3 = new TheoryQuestions(
                "Explain stack memory and heap memory in Java.",
                10, "MEDIUM", theoryKeywords3
        );
        engine.addQuestion(tq3);

        String[] theoryKeywords4 = {"static", "class", "method", "variable"};
        TheoryQuestions tq4 = new TheoryQuestions(
                "Explain the use of static keyword in Java.",
                10, "MEDIUM", theoryKeywords4
        );
        engine.addQuestion(tq4);

        String[] theoryKeywords5 = {"exception", "checked", "unchecked", "compile"};
        TheoryQuestions tq5 = new TheoryQuestions(
                "Differentiate between checked and unchecked exceptions.",
                10, "MEDIUM", theoryKeywords5
        );
        engine.addQuestion(tq5);

        String[] theoryKeywords6 = {"JVM", "classloader", "memory", "execution"};
        TheoryQuestions tq6 = new TheoryQuestions(
                "Explain JVM architecture in detail.",
                10, "HARD", theoryKeywords6
        );
        engine.addQuestion(tq6);

        String[] theoryKeywords7 = {"thread", "lifecycle", "multithreading"};
        TheoryQuestions tq7 = new TheoryQuestions(
                "Explain multithreading and thread lifecycle.",
                10, "HARD", theoryKeywords7
        );
        engine.addQuestion(tq7);

        String[] theoryKeywords8 = {"hashmap", "hashing", "buckets"};
        TheoryQuestions tq8 = new TheoryQuestions(
                "Explain internal working of HashMap.",
                10, "HARD", theoryKeywords8
        );
        engine.addQuestion(tq8);

        String[] theoryKeywords9 = {"abstract", "interface", "java8"};
        TheoryQuestions tq9 = new TheoryQuestions(
                "Differentiate between abstract class and interface in Java 8.",
                10, "HARD", theoryKeywords9
        );
        engine.addQuestion(tq9);

        String[] theoryKeywords10 = {
                "object",
                "class",
                "instance",
                "memory"
        };

        TheoryQuestions tq10 = new TheoryQuestions("What is an object in Java?", 10, "HARD", theoryKeywords10);
        engine.addQuestion(tq10);

        System.out.println();



        // ---------------------- Coding ------------------------

        String[] logicKeywords1 = {"string", "reverse", "loop"};
        CodingQuestions cq1 = new CodingQuestions(
                "Write logic to reverse a string without using built-in methods.",
                15, "MEDIUM", logicKeywords1
        );
        engine.addQuestion(cq1);

        String[] logicKeywords2 = {"palindrome", "number", "reverse"};
        CodingQuestions cq2 = new CodingQuestions(
                "Write logic to check whether a number is palindrome.",
                15, "MEDIUM", logicKeywords2
        );
        engine.addQuestion(cq2);

        String[] logicKeywords3 = {"array", "second largest", "loop"};
        CodingQuestions cq3 = new CodingQuestions(
                "Write logic to find second largest element in an array.",
                15, "MEDIUM", logicKeywords3
        );
        engine.addQuestion(cq3);

        String[] logicKeywords4 = {"string", "vowels", "count"};
        CodingQuestions cq4 = new CodingQuestions(
                "Write logic to count vowels in a string.",
                15, "MEDIUM", logicKeywords4
        );
        engine.addQuestion(cq4);

        String[] logicKeywords5 = {"swap", "variables", "arithmetic"};
        CodingQuestions cq5 = new CodingQuestions(
                "Write logic to swap two numbers without using third variable.",
                15, "MEDIUM", logicKeywords5
        );
        engine.addQuestion(cq5);

        String[] logicKeywords6 = {"linked list", "cycle", "fast slow"};
        CodingQuestions cq6 = new CodingQuestions(
                "Write logic to detect cycle in a linked list.",
                15, "HARD", logicKeywords6
        );
        engine.addQuestion(cq6);

        String[] logicKeywords7 = {"singleton", "thread safe", "synchronization"};
        CodingQuestions cq7 = new CodingQuestions(
                "Write logic to implement thread-safe Singleton class.",
                15, "HARD", logicKeywords7
        );
        engine.addQuestion(cq7);

        String[] logicKeywords8 = {"string", "duplicate", "collection"};
        CodingQuestions cq8 = new CodingQuestions(
                "Write logic to find duplicate characters in a string.",
                15, "HARD", logicKeywords8
        );
        engine.addQuestion(cq8);

        String[] logicKeywords9 = {"hashmap", "sorting", "values"};
        CodingQuestions cq9 = new CodingQuestions(
                "Write logic to sort HashMap by values.",
                15, "HARD", logicKeywords9
        );
        engine.addQuestion(cq9);

        String[] logicKeywords10 = {
                "loop",
                "reverse",
                "mod",
                "divide"
        };
        CodingQuestions cq10 = new CodingQuestions("Explain the logic to check whether a number is palindrome.", 15, "HARD", logicKeywords10);
        engine.addQuestion(cq10);

        // -------------------- Start Interview --------------------------
        engine.startInterview();

        System.out.println();

        sc.close();
    }
}

