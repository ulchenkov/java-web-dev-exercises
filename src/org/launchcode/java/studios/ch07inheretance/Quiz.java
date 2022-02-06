package org.launchcode.java.studios.ch07inheretance;

import java.util.ArrayList;

public class Quiz {
    private final ArrayList<Question> questions = new ArrayList<>();
    private final String title;

    public Quiz(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void addQuestion(Question question) {
        for(Answer answer : question.getAnswers()) {
            if (answer.isCorrect()) {
                questions.add(question);
                System.out.println("Question has been added into the quiz");
                return;
            }
        }
        System.out.println("Error! No correct answer. Question has NOT been added.");
    }

    public ArrayList<Question> getQuestions() {
        return new ArrayList<>(questions);
    }
}
