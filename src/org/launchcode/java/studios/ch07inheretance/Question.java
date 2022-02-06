package org.launchcode.java.studios.ch07inheretance;

import java.util.ArrayList;

public class Question {
    private final String questionText;
    private final ArrayList<Answer> answers = new ArrayList<>();
    private ArrayList<Integer> userAnswers = new ArrayList<>();

    public Question(String questionText) {
        this.questionText = questionText;
    }

    public void addAnswer(String answerText, boolean isCorrect) {
        Answer newAnswer = new Answer(answerText, isCorrect);
        if(answers.contains(newAnswer )) {
            System.out.println("  Error! Answer already exists.");
        } else {
            answers.add(newAnswer);
            System.out.println("  Answer has been added.");
        }
    }

    public void removeAnswer(Answer answer) {
        if (answers.remove(answer)) {
            System.out.println("  Answer has been removed.");
        } else {
            System.out.println("  Error! Answer has NOT been removed.");
        }
    }

    public ArrayList<Answer> getAnswers() {
        return new ArrayList<>(answers);
    }

    public void ask() {
        print();
    }

    public void print(boolean withAnswers) {
        System.out.println(questionText);
        for (int i = 0; i < answers.size(); i++) {
            System.out.printf("  %s. %s%s%n",
                    i + 1,
                    withAnswers ? getAnswersString(i) : "",
                    answers.get(i).getAnswerText());
        }
    }

    public void print() {
        print(false);
    }

    private String getAnswersString(int index) {
        return String.format("%s %s ",
                answers.get(index).isCorrect() ? "X" : " ",
                userAnswers.contains(index + 1) ? "*" : " ");
    }

    public void setUserAnswers(ArrayList<Integer> userAnswers) {
        this.userAnswers = new ArrayList<>(userAnswers);
    }

    public double getScore() {
        int correctAnswerN = 0;
        int correctUserAnswerN = 0;
        ArrayList<Integer> userAnswers = new ArrayList<>(this.userAnswers);
        for(int answerN = 0; answerN < answers.size(); answerN++) {
            Answer answer = answers.get(answerN);
            if (answer.isCorrect())  {
                correctAnswerN++;
                if (userAnswers.contains(answerN + 1)) {
                    correctUserAnswerN++;
                    userAnswers.remove((Object)(answerN + 1));
                }
            }
        }
        correctAnswerN += userAnswers.size();
        return Math.round(correctUserAnswerN / (double)correctAnswerN * 100) / 100.0;
    }
}
