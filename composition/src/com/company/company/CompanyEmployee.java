package com.company.company;

import java.util.Scanner;

public class CompanyEmployee {
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
    public CompanyEmployee readEmployeeInformation() {
        Scanner scanner = new Scanner(System.in);
        CompanyEmployee companyemployee = new CompanyEmployee();
        System.out.println("Enter Name of employee::");
        companyemployee.setName(scanner.next());
        System.out.println("Enter Address::");
        companyemployee.setAddress(scanner.next());
        return companyemployee;
    }
    @Override
    public String toString() {
        return "Employyee name:: "+getName()+" Address:: "+getAddress();
    }
}
