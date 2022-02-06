package org.launchcode.java.studios.ch07inheretance;

import java.util.ArrayList;

public class MultipleChoiceQuestion extends Question{

    public MultipleChoiceQuestion(String questionText) {
        super(questionText);
    }

    @Override
    public void ask() {
        super.ask();
        ArrayList<Integer> userAnswers = new ArrayList<>();
        int userSelection;
        do {
            System.out.print("Your answer(s): ");
            System.out.println(userAnswers);
            userSelection = Menu.getMenuItem("Select all correct answers. ENTER to confirm selection", getAnswers().size());
            if (userSelection > 0) {
                if (userAnswers.contains(userSelection)) {
                    userAnswers.remove((Object)userSelection);
                } else {
                    userAnswers.add(userSelection);
                }
            }
        } while (userSelection != 0);
        setUserAnswers(userAnswers);
    }
}
