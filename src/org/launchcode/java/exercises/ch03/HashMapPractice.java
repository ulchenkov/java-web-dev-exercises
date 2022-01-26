package org.launchcode.java.exercises.ch03;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] a) {

        HashMap<Integer, String> students = new HashMap<>();
        String studentName;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your students (or ENTER to finish):");
        do {
            System.out.print("Student name: ");
            studentName = scanner.nextLine();
            if (!studentName.isEmpty()) {
                System.out.print("Student ID: ");
                int studentId = scanner.nextInt();
                students.put(studentId, studentName);
                String tmp = scanner.nextLine();
            }
        } while (!studentName.isEmpty());

        System.out.println("\nClass roster:");
        for(int id : students.keySet()) {
            System.out.printf("%s [%s]%n", students.get(id), id);
        }

    }
}
