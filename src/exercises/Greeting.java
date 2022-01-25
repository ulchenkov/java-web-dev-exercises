package exercises;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] a) {
        Scanner input = new Scanner(System.in);
        System.out.print("Hello, what is your name: ");
        String name = input.next();
        System.out.printf("Hello %s!%n", name);
    }
}
