package com.company.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        System.out.println("student menu");
        int input = 0;
        List<Student> studentList = new ArrayList<>();
        do {
            System.out.println("1. Add student");
            System.out.println("2.Edit student");
            System.out.println("3.Remove student");
            System.out.println("4.view all ");
            System.out.println("5. Find Student by name");
            System.out.println("6. add N number of student");
            System.out.println("7. exit");
            System.out.println("Your choice..");
            input = scanner.nextInt();

            switch (input) {
                case 1:
                    Student student1 = student.addStudnet();
                    studentList.add(student1);
                    break;
                case 2:

                   student.removeStudent(studentList);

                case 4:
                    System.out.println("all the student details");
                    student.showAllStudents(studentList);
                    break;
                case 6:
                    System.out.println("enter the size of student");
                    int size = scanner.nextInt();
                    studentList.addAll(student.addNNumberOfStudnet(size));
                    break;

                default:
                    System.out.println("enter the valid input");
                    break;

            }
        } while (input != 7);


    }

}
