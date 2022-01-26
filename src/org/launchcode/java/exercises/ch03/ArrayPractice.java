package org.launchcode.java.exercises.ch03;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args){
        int[] arrInt = {1, 1, 2, 3, 5, 8 };

        for(int i : arrInt) {
            System.out.println(i);
        }

        System.out.println();

        for (int j : arrInt) {
            if (j % 2 == 1) {
                System.out.println(j);
            }
        }

        System.out.println();

        String str = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";
        String[] arrStr = str.split(" ");
        System.out.println(Arrays.toString(arrStr));

        arrStr = str.split("\\.");
        System.out.println(Arrays.toString(arrStr));

    }
}
