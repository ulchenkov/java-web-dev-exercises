package org.launchcode.java.exercises.ch04;

import java.util.ArrayList;

public class Course {
    private final ArrayList<Student> students = new ArrayList<>();
    private String title;
    private Teacher teacher;

    public Course(String title, Teacher teacher) {
        this.title = title;
        this.teacher = teacher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public boolean removeStudent (Student student) {
        return students.remove(student);
    }

    public boolean removeStudent(int studentId) {
        for(Student student : students) {
            if (student.getStudentId() == studentId) {
                return removeStudent(student);
            }
        }
        return false;
    }
}
