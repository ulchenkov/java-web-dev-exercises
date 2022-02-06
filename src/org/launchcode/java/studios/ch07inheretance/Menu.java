package org.launchcode.java.studios.ch07inheretance;

import java.util.Scanner;

public class Menu {
    private static final Scanner scanner = new Scanner(System.in);

    private static String enterString(String prompt) {
        System.out.printf("%s: ", prompt);
        return scanner.nextLine();
    }

    public static int getMenuItem(String prompt, int maxNumber) {
        int menuItem = -1;
        do {
            String userInput = enterString(prompt);
            if (userInput.isEmpty()) {
                menuItem = 0;

            } else {
                try {
                    menuItem = Integer.parseInt(userInput);
                    if (menuItem < 1 || menuItem > maxNumber) {
                        menuItem = -1;
                        System.out.printf("Enter a number from 1 to %s!%n", maxNumber);
                    }
                } catch (NumberFormatException exception) {
                    System.out.println("Not a number!");
                }
            }
        } while (menuItem < 0);
        return menuItem;
    }
}
