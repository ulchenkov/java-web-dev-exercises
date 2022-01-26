package org.launchcode.java.exercises.ch02;

import java.util.Scanner;

public class AliceExtended {
    public static void main (String[] args) {
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having " +
                "nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures " +
                "or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a search term: ");
        String search = input.next();
        input.close();

        int index = sentence.toLowerCase().indexOf(search.toLowerCase());
        System.out.printf("The index of '%s' is %s. Length of '%s' is %s.%n", search, index, search, search.length());
        System.out.println("The new sentence is:");
        System.out.println(index == -1 ? sentence : sentence.substring(0, index) + sentence.substring(index + search.length()));
    }
}
