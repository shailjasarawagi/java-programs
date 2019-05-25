package com.company;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Student student = new Student();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size");
        int size = scanner.nextInt();
        List<Student> studentList = student.readAllStudent(size);


        // int size read size
        // list<Studnet> list = stuent.readlAllstd(size)
        Student readStudent = student.readStudnetInformation();
        System.out.println("student details");
        System.out.println(readStudent.toString());
        student.showAllStudents(studentList);








    }
}
