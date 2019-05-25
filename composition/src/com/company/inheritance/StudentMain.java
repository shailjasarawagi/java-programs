package com.company.inheritance;

public class StudentMain {
    public static void main(String[] args) {
        GradStudent gradStudent = new GradStudent();
        gradStudent.setName("ss");
        gradStudent.setAddress("ss");
        gradStudent.setAge(23);
        gradStudent.setFaculty("Bex");
        System.out.println(gradStudent.toString());

    }

}
