package org.launchcode.java.studios.ch07inheretance;

import java.util.ArrayList;

class Question {
    private String questionText;
    private ArrayList<Answer> answers;
    ArrayList<Integer> userAnswers = new ArrayList<>();
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

    protected void print() {
        System.out.println(questionText);
        for (int i = 0; i < answers.size(); i++) {
            System.out.printf("  %s. %s%n", i + 1, answers.get(i).getAnswerText());
        }
    }

    protected void getUserAnswer() {

        do {
            System.out.print("\nYour answer(s): ");
            System.out.println(userAnswers);
            System.out.println("Select you answer(s) or Enter to confirm: ");
        } while (true);

    }
}
