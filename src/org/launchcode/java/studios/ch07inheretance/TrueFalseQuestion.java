package org.launchcode.java.studios.ch07inheretance;

import java.util.ArrayList;

public class TrueFalseQuestion extends Question {
    public TrueFalseQuestion(String questionText, boolean isQuestionTrue) {
        super(questionText);
        super.addAnswer("True", isQuestionTrue);
        super.addAnswer("False", !isQuestionTrue);
    }

    @Override
    public void addAnswer(String answerText, boolean isCorrect) {
        System.out.println("  Error! True/False question doesn't have answers.");
    }

    @Override
    public void removeAnswer(Answer answer) {
        System.out.println("  Error! True/False question doesn't have answers.");
    }

    @Override
    public void ask() {
        super.ask();
        int userSelection = Menu.getMenuItem("Select correct answer", getAnswers().size());
        if (userSelection > 0) {
            ArrayList<Integer> userAnswer = new ArrayList<>();
            userAnswer.add(userSelection);
            setUserAnswers(userAnswer);
        }
    }
}
