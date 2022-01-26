package org.launchcode.java.studios.ch03countingcharacters;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class CharacterCounter {

    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        int menuItem = selectMenuItem();
        String text = getText(menuItem);
        HashMap<Character, Integer> counter = calculateCharacters(text, true, true);
        printResults(counter);
    }

    private static int selectMenuItem() {
        System.out.print("""
                What string would you like to use:
                1. Use the default string
                2. Enter the string
                3. Read the string from a file
                Enter 1, 2 or 3:\s""");
        int menuItem = scanner.nextInt();
        String tmp = scanner.nextLine();
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
            default -> throw new IllegalArgumentException("No such menu item.");
        }
        return text;
    }

    private static HashMap<Character, Integer> calculateCharacters(String text,
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

    private static HashMap<Character, Integer> calculateCharacters(String text) {
        return calculateCharacters(text, false, false);
    }

    private static void printResults(HashMap<Character, Integer> counter) {
        for (char ch : counter.keySet()) {
            System.out.printf("%s: %s%n", ch, counter.get(ch));
        }
    }

    private static String enterString(String prompt) {
        System.out.printf("%s: ", prompt);
        String str = scanner.nextLine();
        return str;
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
        String text = "";
        Scanner reader = null;
        try {
            reader = new Scanner(textFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (reader.hasNextLine()) {
            String nextLine = reader.nextLine();
            text += nextLine;
        }
        reader.close();
        return text;
    }
}
