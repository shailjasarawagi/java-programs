package com.company.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Company {

    private String name;
    private String address;
    private CompanyEmployee companyemployee;


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

    public CompanyEmployee getCompanyemployee() {
        return companyemployee;
    }

    public void setCompanyemployee(CompanyEmployee companyemployee) {
        this.companyemployee = companyemployee;
    }

    @Override
    public String toString() {
        return "Company name ::" + getName() + "   Address of company::" + getAddress() + " company employee name ::"
                + getCompanyemployee().toString();
    }

    public List<Company> readAllCompany(int size) {
        Scanner scanner = new Scanner(System.in);
        List<Company> companyList = new ArrayList<>();
        for (int i = 1; i < size; i++) {
            Company company = new Company();
            companyList.add(readCompanyInformation());

        }
        return companyList;
    }


    public Company readCompanyInformation() {

        Scanner scanner = new Scanner(System.in);
        Company company = new Company();
        System.out.println("Enter name of company::");
        company.setName(scanner.next());
        System.out.println("Enter Address::");
        company.setAddress(scanner.next());

        CompanyEmployee companyemployee = new CompanyEmployee();
        company.setCompanyemployee(companyemployee.readEmployeeInformation());
        return company;

    }


    public void showAllCompanys(List<Company> companyList) {
        for (Company company : companyList) {
            System.out.println(company.toString());

        }

    }
}
