package com.interview.simulator;

public class Candidate {

    private String name;
    private String role;
    private int totalScore;

    public Candidate(String name, String role) {
        this.name = name;
        this.role = role;
        this.totalScore = 0;
    }

    public void addScore(int marks) {
        if (marks > 0) {
            totalScore += marks;
        }
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public int getTotalScore() {
        return totalScore;
    }
}
