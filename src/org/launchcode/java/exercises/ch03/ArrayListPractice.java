package org.launchcode.java.exercises.ch03;

import java.util.*;

public class ArrayListPractice {
    public static void main(String[] a) {
        Integer[] arrInt = {1, 2, 3, 5, 8, 13, 21, 34, 55, 89};
        ArrayList<Integer> listInt = new ArrayList<>(Arrays.asList(arrInt));
        System.out.printf("The sum of all the even numbers is %s%n%n", getSumOfEvenNumbers(listInt));

        String str = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";

        ArrayList<String> listStr = new ArrayList<>(Arrays.asList(str.split(" ")));
        printWords(listStr);

        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the word length for the search: ");
        int length = scanner.nextInt();
        printWords(listStr, length);
    }

    private static int getSumOfEvenNumbers (ArrayList<Integer> arr) {
        int sum = 0;
        for(int i : arr) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    private static void printWords(ArrayList<String> list, int length) {
        for(String str : list) {
            if(str.length() == length) {
                System.out.println(str);
            }
        }

    }

    private static void printWords(ArrayList<String> list) {
        printWords(list, 5);
    }
}
