package org.launchcode.java.exercises.ch05;

public class LaunchCodePractice {
    public static void main(String[] args) {

        Teacher chris = new Teacher("Chris", "Bay", "Software Development", 5);
        Course charlotteCodeCamp = new Course("CodeCamp Charlotte (November 2021)", chris);

        Student mySelf = new Student("Vitaly", 1975, 3, 4.0);
        mySelf.addGrade(4, 3.0);
        charlotteCodeCamp.addStudent(mySelf);

        Student venky = new Student("Venky", 1144, 4, 4.0);
        charlotteCodeCamp.addStudent(venky);

        System.out.println(charlotteCodeCamp);
    }
}
