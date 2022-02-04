package org.launchcode.java.studios.ch07inheretance;

import java.util.ArrayList;

public class TrueFalseQuestion extends Question {
    public TrueFalseQuestion(String questionText, boolean isQuestionTrue) {
        super(questionText);
        setQuestionCorrectAnswer(isQuestionTrue);
    }

    public void setQuestionCorrectAnswer(boolean correctAnswer) {
        if (!super.getAnswers().isEmpty()) {
            for(Answer answer : super.getAnswers()){
                super.removeAnswer(answer);
            }
        }
        super.addAnswer("True", correctAnswer);
        super.addAnswer("False", !correctAnswer);
    }

    @Override
    protected boolean addAnswer(String answerText, boolean isCorrect) {
        return false;
    }

    @Override
    protected boolean removeAnswer(Answer answer) {
        return false;
    }

    @Override
    public ArrayList<Answer> getAnswers() {
        return null;
    }
}
