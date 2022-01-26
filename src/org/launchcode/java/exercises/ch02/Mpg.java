package org.launchcode.java.exercises.ch02;

import java.util.Scanner;

public class Mpg {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many miles have you driven: ");
        int miles = input.nextInt();
        System.out.print("How many gallons of gas have you've consumed: ");
        int gas = input.nextInt();
        input.close();

        double mpg = miles / (double)gas;
        System.out.printf("Your miles-per-gallon is: %s%n", mpg);
    }
}
