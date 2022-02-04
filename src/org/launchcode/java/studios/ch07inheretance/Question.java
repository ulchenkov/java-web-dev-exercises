package org.launchcode.java.studios.ch07inheretance;

import java.util.ArrayList;

class Question {
    private String questionText;
    private ArrayList<Answer> answers;
    private final QuestionType questionType;

    protected Question(String questionText, QuestionType questionType) {
        this.questionText = questionText;
        this.questionType = questionType;
        answers = new ArrayList<>();
    }

    public String getQuestionText() {
        return questionText;
    }

    public QuestionType getQuestionType() {
        return questionType;
    }

    protected boolean addAnswer(String answerText, boolean isCorrect) {
        Answer newAnswer = new Answer(answerText, isCorrect);
        if(answers.contains(newAnswer )) {
            return false;
        }
        answers.add(newAnswer);
        return true;
    }

    protected boolean removeAnswer(Answer answer) {
        return answers.remove(answer);
    }

    public ArrayList<Answer> getAnswers() {
        return new ArrayList<>(answers);
    }

    public void printAnswers() {
        for(Answer answer : answers) {
            System.out.println(answer.getAnswerText());
        }
    }
}
