package org.launchcode.java.studios.ch07inheretance.runner;

import org.launchcode.java.studios.ch07inheretance.*;

public class QuizRunner {
    public static void main(String[] args) {
        run(getDefaultQuestions());
    }

    public static void run(Quiz quiz) {
        System.out.printf("%n%n *** %s ***%n", quiz.getTitle());
        for(int questionN = 0; quiz.getQuestions().size() > questionN; questionN++) {
            Question question = quiz.getQuestions().get(questionN);
            System.out.println();
            System.out.printf("Question %s. ", questionN + 1);
            question.ask();
        }
        double score = 0.0;
        System.out.println("\nCorrect answers (X - correct answer(s), * - your answer(s)):");
        for(int questionN = 0; quiz.getQuestions().size() > questionN; questionN++) {
            Question question = quiz.getQuestions().get(questionN);
            System.out.println();
            System.out.printf("Question %s. Score: %s%n", questionN + 1, question.getScore());
            question.print(true);
            score += question.getScore();
        }
        System.out.printf("%nYour total score: %s out of %s%n%n", score, quiz.getQuestions().size());
    }

    private static Quiz getDefaultQuestions() {
        Quiz defaultQuiz = new Quiz("Mathematical quiz");

        System.out.println("\nTrue/False Question:");
        Question question = new TrueFalseQuestion("2 x 2 = 4?", true);
        // Error is expected
        question.addAnswer("3", false);
        // Error is expected
        question.removeAnswer(null);
        defaultQuiz.addQuestion(question);

        System.out.println("\nMultiple Choice Question:");
        question = new MultipleChoiceQuestion("2 x 2 = ?");
        question.addAnswer("3", false);
        question.addAnswer("4", true);
        Answer answerToRemove = question.getAnswers().get((question.getAnswers().size() - 1));
        question.addAnswer("5", false);
        // Error is expected
        question.addAnswer("3", true);
        question.removeAnswer(answerToRemove);
        // Error is expected
        question.removeAnswer(answerToRemove);
        // Error is expected
        defaultQuiz.addQuestion(question);
        question.addAnswer("4", true);
        defaultQuiz.addQuestion(question);

        System.out.println("\nCheckbox Question:");
        question = new CheckboxQuestion("Which numbers are even?");
        question.addAnswer("2", true);
        question.addAnswer("5", false);
        question.addAnswer("112", true);
        question.addAnswer("97", false);
        defaultQuiz.addQuestion(question);
        return defaultQuiz;
    }
}
