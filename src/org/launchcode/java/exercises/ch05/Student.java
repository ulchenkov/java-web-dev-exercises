package org.launchcode.java.exercises.ch05;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

import java.util.Objects;

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public  String getGradeLevel() {
        if (this.numberOfCredits < 30) {
            return "Freshman";
        } else if (this.numberOfCredits < 60) {
            return "Sophomore";
        } else if (this.numberOfCredits < 90) {
            return "Junior";
        } else {
            return "Senior";
        }
    }

    public void addGrade(int credits, double grade) {
        double currentScore = this.gpa * this.numberOfCredits;
        double newScrore = grade * credits;
        this.numberOfCredits = this.numberOfCredits + credits;
        this.gpa = (newScrore + currentScore) / this.numberOfCredits;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentId=" + studentId +
                ", numberOfCredits=" + numberOfCredits +
                ", gpa=" + gpa +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }
}