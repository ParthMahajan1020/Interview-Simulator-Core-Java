package com.interview.simulator;

public class CodingQuestions extends Questions{
    private String[] logicKeyWords;

    public CodingQuestions(String questionText, int marks, String[] logicKeyWords) {
        super(questionText, marks);
        this.logicKeyWords = logicKeyWords;
    }
    @Override
    public int evaluateAnswer(String answer){
        if (answer == null || answer.trim().isEmpty()){
            return 0;
        }
        answer = answer.toLowerCase();
        int matchCount = 0;

        for (String keyword : logicKeyWords) {
            if (answer.contains(keyword.toLowerCase())){
                matchCount++;
            }
        }
        int score = (matchCount * marks) / logicKeyWords.length;
        System.out.println("Matched: " + matchCount + "/"  + logicKeyWords.length);

        //Bonus for detailed answers
        if (answer.length() > 60){
            score += 2;
        }
        return Math.min(score, marks);
    }
}
