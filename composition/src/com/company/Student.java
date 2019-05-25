package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
    private String name;
    private String address;
    private int rollNumber;
    private StudentParent studentParent;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public StudentParent getStudentParent() {
        return studentParent;
    }

    public void setStudentParent(StudentParent studentParent) {
        this.studentParent = studentParent;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return "Student name ::" + getName() + "   Address of student::" + getAddress() + "   student parent name ::"
                + getStudentParent().toString();
    }

    public Student readStudnetInformation() {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        System.out.println("Enter name of student::");
        student.setName(scanner.next());
        System.out.println("Enter Address::");
        student.setAddress(scanner.next());
        System.out.println("Enter Roll Number::");
        student.setRollNumber(scanner.nextInt());
        StudentParent studentParent = new StudentParent();
        student.setStudentParent(studentParent.readParentInformation());
        return student;
    }

    public List<Student> readAllStudent(int size) {
        Scanner scanner = new Scanner(System.in);
        List<Student> studentList = new ArrayList<>();
        for (int i = 1; i < size; i++) {
            Student student = new Student();
            studentList.add(readStudnetInformation());

        }
        return studentList;
    }


    public void showAllStudents(List<Student> studentList) {
        for(Student student: studentList){
            System.out.println(student.toString());
        }
    }



    // public list of studnet methodname(size) { arraylist for () {arrlist.add(readStudentInformation())} return list }
}
