package com.lcwd.test.ScalerQuestions.sixfeb.Q2;

public class Student extends User{
    private int studentId;
    private String course;

    public Student(String username, String email, int studentId, String course) {
        super(username, email);
        this.studentId = studentId;
        this.course = course;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getCourse() {
        return course;
    }

    @Override
    public void displayInfo() {
            super.displayInfo();
            System.out.println("Student ID: " + studentId);
            System.out.println("Course: " + course);
    }
}
