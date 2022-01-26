package org.launchcode.java.studios.ch02areaofacircle;

import org.launchcode.java.exercises.ch02.Alice;

import java.util.Locale;
import java.util.Scanner;

public class Area {

    public static void main(String[] args){
        double radius = 0;
        boolean isCorrectEnter = false;

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        Alice alice;
        do {
            System.out.print("Enter a radius (non negative number): ");
            if (scanner.hasNextDouble()){
                radius = scanner.nextDouble();
                if (radius>=0) {
                    isCorrectEnter = true;
                }
            } else {
                // String tmp = scanner.next();
                System.out.println("ERROR: radius must be a number!");
                break;
            }
        } while (!isCorrectEnter);
        scanner.close();

        if (isCorrectEnter) {
            System.out.printf("The area of a circle of radius %s is: %s%n", radius,
                    String.format("%.2f", Circle.getArea(radius)));
        }
    }

}
