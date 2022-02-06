package org.launchcode.java.studios.ch07inheretance;

import java.util.ArrayList;

public class CheckboxQuestion extends Question{

    public CheckboxQuestion(String questionText) {
        super(questionText);
    }

    @Override
    public void addAnswer(String answerText, boolean isCorrect) {
        if (isCorrect && !getAnswers().isEmpty()) {
            for(Answer answer : getAnswers()) {
                if (answer.isCorrect()) {
                    System.out.println("  Error! Question already has a correct answer.");
                    return;
                }
            }
        }
        super.addAnswer(answerText, isCorrect);
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
