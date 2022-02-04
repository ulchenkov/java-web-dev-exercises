package org.launchcode.java.studios.ch07inheretance;

import java.util.ArrayList;

public class QuizRunner {
    public static void main(String[] args) {
      TrueFalseQuestion question = new TrueFalseQuestion("Is it true?", true);
      question.printAnswers();
      System.out.println(question.addAnswer("", false));
    }
}
