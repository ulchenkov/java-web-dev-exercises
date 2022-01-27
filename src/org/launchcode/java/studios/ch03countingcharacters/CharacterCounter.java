package org.launchcode.java.studios.ch03countingcharacters;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CharacterCounter {

    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        while (true) {

            // Select a string
            ArrayList<String> menuItems = new ArrayList<>();
            menuItems.add("Use the default string");
            menuItems.add("Enter the string");
            menuItems.add("Read the string from a file");
            int menuItem = getUserSelection("What string would you like to use (ENTER to exit)", menuItems);
            if (menuItem == 0) {
                break;
            }
            String text = getText(menuItem);

            // Select a counts type
            menuItems = new ArrayList<>();
            menuItems.add("Case-Sensitive, All Characters");
            menuItems.add("Case-Insensitive, Alphabetic Characters Only");
            menuItem = getUserSelection("Select counts type", menuItems);
            if(menuItem != 0) {
                boolean isCaseInsensitive = menuItem != 1;
                boolean isAlphabeticOnly = menuItem != 1;
                //
                HashMap<Character, Integer> counter = countCharacters(text, isCaseInsensitive, isAlphabeticOnly);
                printResults(counter);
            }
        }
    }

    // Returns number of selected menu item or 0 if nothing was selected
    private static int getUserSelection(String menuTitle, ArrayList<String> menuItems) {
        System.out.printf("%n%s:%n", menuTitle);
        for(int i = 0; i < menuItems.size(); i++) {
            System.out.printf("%s. %s%n", i + 1, menuItems.get(i));
        }

        String selectionOptions;
        if (menuItems.size() > 5) {
            selectionOptions = "Enter 1, 2, ..., " + (menuItems.size() - 1) + ", " + menuItems.size() + ": ";
        } else {
            selectionOptions = "Enter ";
            for(int i = 0; i < menuItems.size() - 1; i++){
                selectionOptions += String.format("%s, ", i + 1);
            }
            selectionOptions += String.format("or %s: ", menuItems.size());
        }

        int menuItem = -1;
        do {
            String userInput = enterString(selectionOptions);
            if (userInput.isEmpty()) {
                menuItem = 0;

            } else {
                try {
                    menuItem = Integer.parseInt(userInput);
                    if (menuItem < 1 || menuItem > menuItems.size()) {
                        menuItem = -1;
                        System.out.printf("Enter a number from 1 to %s!%n", menuItems.size());
                    }
                } catch (NumberFormatException exception) {
                    System.out.println("Not a number!");
                }
            }
        } while (menuItem < 0);
        return menuItem;
    }

    private static String getText(int menuItem) {
        String text;
        switch (menuItem) {
            case 1 -> text = "If the product of two terms is zero then common sense says at least one of the two terms has to " +
                    "be zero to start with. So if you move all the terms over to one side, you can put the quadratics into " +
                    "a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, " +
                    "it’s pretty straightforward from there.";
            case 2 -> text = enterString("Enter the string");
            case 3 -> {
                File textFile = selectFile();
                text = readStringFromFile(textFile);
            }
            default -> throw new IllegalArgumentException(String.format("No such menu item: %s", menuItem));
        }
        return text;
    }

    private static HashMap<Character, Integer> countCharacters(String text,
                                                               boolean isCaseInsensitive,
                                                               boolean isAlphabeticOnly) {
        if (isCaseInsensitive) {
            text = text.toLowerCase();
        }
        HashMap<Character, Integer> counter = new HashMap<>();
        for (char ch : text.toCharArray()) {
            if(isAlphabeticOnly && !Character.isAlphabetic(ch)) {
                continue;
            }
            if (counter.containsKey(ch)) {
                counter.put(ch, counter.get(ch) + 1);
            } else {
                counter.put(ch, 1);
            }
        }
        return counter;
    }

    private static void printResults(HashMap<Character, Integer> counter) {
        for (char ch : counter.keySet()) {
            System.out.printf("%s: %s%n", ch, counter.get(ch));
        }
    }

    private static String enterString(String prompt) {
        System.out.printf("%s: ", prompt);
        return scanner.nextLine();
    }

    private static File selectFile() {
        String fileName;
        File textFile = null;
        boolean isFileExist = false;
        while (!isFileExist) {
            fileName = enterString("Enter file name");
            textFile = new File(fileName);
            if (textFile.exists()) {
                isFileExist = true;
            } else {
                System.out.println("File does not exist!");
            }
        }
        return textFile;
    }

    private static String readStringFromFile(File textFile) {
        StringBuilder text = new StringBuilder();
        try {
            Scanner reader = new Scanner(textFile);
            while (reader.hasNextLine()) {
                String nextLine = reader.nextLine();
                text.append(nextLine);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return text.toString();
    }
}
