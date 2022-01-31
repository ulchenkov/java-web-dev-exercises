package org.launchcode.java.exercises.ch04;

public class LaunchCodePractice {
    public static void main(String[] args) {

        Teacher chris = new Teacher("Chris", "Bay", "Software Development", 5);

        Course charlotteCodeCamp = new Course("CodeCamp Charlotte (November 2021)", chris);
        Student mySelf = new Student("Vitaly", 1975, 1, 4.0);
        charlotteCodeCamp.addStudent(mySelf);

    }
}
