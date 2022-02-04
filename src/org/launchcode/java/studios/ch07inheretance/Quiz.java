package org.launchcode.java.studios.ch07inheretance;

import java.util.ArrayList;

public class Quiz {
    private ArrayList<Question> questions;
    private final String title;

    public Quiz(String title, boolean useDefaultQuestions) {
        this.title = title;
        if (useDefaultQuestions) {
            questions = getDefaultQuestions();
        } else {
            questions = new ArrayList<>();
        }
    }

    public String getTitle() {
        return title;
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public ArrayList<Question> getQuestions() {
        return new ArrayList<>(questions);
    }

    private ArrayList<Question> getDefaultQuestions() {
        ArrayList<Question> questions = new ArrayList<>();
        Question question = new TrueFalseQuestion("2 x 2 = 4?", true);
        questions.add(question);

        question = new MultipleChoiceQuestion("2 x 2 = ?");
        question.addAnswer("3", false);
        question.addAnswer("4", true);
        question.addAnswer("5", false);
        questions.add(question);

        question = new CheckboxQuestion("Which numbers are even?");
        question.addAnswer("2", true);
        question.addAnswer("5", false);
        question.addAnswer("112", true);
        question.addAnswer("97", false);
        questions.add(question);

        return questions;
    }
}
