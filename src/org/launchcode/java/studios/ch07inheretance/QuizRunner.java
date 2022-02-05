package org.launchcode.java.studios.ch07inheretance;

import java.util.ArrayList;

public class QuizRunner {
    public static void main(String[] args) {
        run(new Quiz("Mathematical quiz",true));
//      ArrayList<String> menu = new ArrayList<>();
//      menu.add("Create/edit question list");
//      menu.add("Run quiz with default questions");
//      int userSelection;
//      do {
//          userSelection = Menu.getUserSelection("What would you like to do?", menu);
//          if (userSelection == 2) {
//              run(new Quiz("Mathematical quiz",true));
//          }
//      } while (userSelection > 0);
    }

    public static void run(Quiz quiz) {;
        System.out.printf("%n%n *** %s ***%n", quiz.getTitle());
        for(int questionN = 0; questionN < quiz.getQuestions().size(); questionN++) {
            Question question = quiz.getQuestions().get(questionN);
            question.print();
        }
    }
}
