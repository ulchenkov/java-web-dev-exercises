package org.launchcode.java.demos;

import java.util.Scanner;

import static java.lang.System.*;

/**
 * From "Java Web Development"
 */
public class Hello {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);
        out.println("Hello, World");
        out.print("Enter first string: ");
        String strA = input.next();
        out.print("Enter second string: ");
        String strB = input.next();
        boolean result = strA.equals(strB);
        out.println(result);

        out.print("Enter integer: ");
        int myInt = input.nextInt();
        if (input.hasNextInt()) {
            out.println("You entered " + myInt);
        }
        else  {
            out.println("You entered incorrect data");
        }
        input.close();

    }
}
