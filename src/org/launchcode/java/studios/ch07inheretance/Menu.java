package org.launchcode.java.studios.ch07inheretance;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private static final Scanner scanner = new Scanner(System.in);

    protected static int getUserSelection(String menuTitle, ArrayList<String> menuItems) {
        System.out.printf("%n%s%n", menuTitle);
        for(int i = 0; i < menuItems.size(); i++) {
            System.out.printf("    %s. %s%n", i + 1, menuItems.get(i));
        }

        String selectionOptions;
        if (menuItems.size() > 5) {
            selectionOptions = "Enter 1, 2, ..., " + (menuItems.size() - 1) + ", " + menuItems.size();
        } else {
            selectionOptions = "Enter ";
            for(int i = 0; i < menuItems.size() - 1; i++){
                selectionOptions += String.format("%s, ", i + 1);
            }
            selectionOptions += String.format("or %s", menuItems.size());
        }

        selectionOptions += " (ENTER to exit)";
        return getMenuItem(selectionOptions, menuItems.size());
    }

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
