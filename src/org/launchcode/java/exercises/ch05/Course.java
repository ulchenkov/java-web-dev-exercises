package org.launchcode.java.exercises.ch05;

import java.util.ArrayList;
import java.util.Objects;

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

    @Override
    public String toString() {
        StringBuilder studentsStr = new StringBuilder();
        for(Student student : students) {
            studentsStr.append(student + "\n");
        }
        return "Course{\n" +
                "Title: " + title + "\n" +
                "Teacher: " + teacher + "\n" +
                "Students list:\n" + studentsStr +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return students.equals(course.students) && title.equals(course.title) && teacher.equals(course.teacher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(students, title, teacher);
    }
}
