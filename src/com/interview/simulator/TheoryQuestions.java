package com.interview.simulator;

public class TheoryQuestions extends Questions {
    private String[] keyWords;

    public TheoryQuestions (String questionText, int marks, String[] keyWords) {
        super(questionText, marks);
        this.keyWords = keyWords;
    }
    @Override
    public int evaluateAnswer(String answer) {
        if (answer == null || answer.trim().isEmpty()) {
            return 0;
        }
        answer = answer.toLowerCase();
        int matchCount = 0;

        for (String keyword : keyWords){
            if (answer.contains(keyword.toLowerCase())){
                matchCount++;
            }
        }
        System.out.println("Keywords matched: " + matchCount + " / " + keyWords.length);

        int awardedMarks = (matchCount * marks) / keyWords.length;
        System.out.println("Marks awarded: " + awardedMarks);

        return awardedMarks;
    }
}
