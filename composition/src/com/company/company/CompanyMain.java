package com.company.company;

import java.util.List;
import java.util.Scanner;

public class CompanyMain {

    public static void main(String[] args) {

        Company company = new Company();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size");
        int size = scanner.nextInt();
        List<Company> companyList = company.readAllCompany(size);
        Company readCompany = company.readCompanyInformation();
        System.out.println("company details");
        System.out.println(readCompany.toString());
        company.showAllCompanys(companyList);

    }
}
