package com.company.employees;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee employee = new Employee();
        System.out.println(" enter your choice");
        int input=0;
        List<Employee> employeeList = new ArrayList<>();
        do {
            System.out.println("1.Add employee");
            System.out.println("2.view all ");
            System.out.println("3. exit");
            System.out.println("Your choice..");
            input = scanner.nextInt();
            switch (input) {
                case 1:
                    List<Employee> employee1 = employee.addEmployee();

                    employeeList.addAll(employee1);
                    break;

                case 2:
                    System.out.println("all the employee details");
                    employee.showAllEmployee(employeeList);
                   break;

                default:
                    System.out.println("enter the valid input");
                    break;

            }
        } while (input != 3);

        SalaryEmployee salaryEmployee = new SalaryEmployee();
        salaryEmployee.setEarning(45000);
        CommissionEmployee commissionEmployee = new CommissionEmployee();
        commissionEmployee.setCommission(4500);
        commissionEmployee.setTotalSales(45000);
        HourlyEmployee hourlyEmployee = new HourlyEmployee();
        hourlyEmployee.setHour(44);
        //commissionEmployee.totalEarning();
        //System.out.println(commissionEmployee.totalEarning());
        System.out.println(employee.toString());
        System.out.println(salaryEmployee.toString());
        System.out.println(commissionEmployee.toString());
        System.out.println(hourlyEmployee.toString());

    }


}

