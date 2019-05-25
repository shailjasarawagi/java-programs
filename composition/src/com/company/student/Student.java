package com.company.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
    private String name;
    private String address;

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

    public Student addStudnet() {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        System.out.println("Read Student");
        System.out.println("Enter the name::");
        student.setName(scanner.next());
        System.out.println("enter the address");
        student.setAddress(scanner.next());
        return student;
    }


    public List<Student> addNNumberOfStudnet(int size) {

        List<Student> studentList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            studentList.add(addStudnet());
        }
        return studentList;
    }

    public void showAllStudents(List<Student> studentList) {
        for (Student student : studentList) {
            System.out.println(student.toString());
        }
    }

    @Override
    public String toString() {
        return "Student name::" + getName() + "   Address of student::" + getAddress() ;
    }


    public void removeStudent(List<Student> studentList) {

    }
}
