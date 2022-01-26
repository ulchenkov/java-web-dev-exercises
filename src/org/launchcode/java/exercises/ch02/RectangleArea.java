package org.launchcode.java.exercises.ch02;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int length = input.nextInt();
        System.out.print("Enter the width: ");
        int width = input.nextInt();
        input.close();

        System.out.printf("The area of the rectangle = %s%n", length * width);
    }
}
