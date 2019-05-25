package com.company;

import java.util.Scanner;

public class StudentParent {
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

    @Override
    public String toString() {
        return "Parent Name:: "+getName()+" Address:: "+getAddress();
    }

    public StudentParent readParentInformation() {
        Scanner scanner = new Scanner(System.in);
        StudentParent studentParent = new StudentParent();
        System.out.println("Enter Name of parent::");
        studentParent.setName(scanner.next());
        System.out.println("Enter Address::");
        studentParent.setAddress(scanner.next());
        return studentParent;
    }
}
