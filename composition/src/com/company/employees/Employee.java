package com.company.employees;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employee {

    private int id;
    private String name;
    private String address;
    private int salary;
    private EnumTypes enumTypes;

    @Override
    public String toString() {
        return "   Employee information:: NAme::" + getName()
                + "   Address of employee::" + getAddress()
                + " id of employee::" + getId()
                + " salary of employee::" + getSalary();
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public List<Employee> addEmployee() {
        Scanner scanner = new Scanner(System.in);
        Employee employee = new Employee();

        List<Employee> employeeList = new ArrayList<>();
        int input;
        do {
            System.out.println("1. Add salary employee");
            System.out.println(" 2. Add hourly employee");
            System.out.println(" 3. Add commission employee");
            System.out.println("4. exit");
            System.out.println("your choice");
            input = scanner.nextInt();

            switch (input) {
                case 1:
                    Employee employee1 = employee.addSalaryEmployee();
                    employeeList.add(employee1);
                    break;
                case 2:
                    Employee employee2 = employee.addCommissionEmployee();
                    employeeList.add(employee2);
                    break;
                case 3:
                    Employee employee3 = employee.addHourlyEmployee();
                    employeeList.add(employee3);
                    break;

                default:
                    System.out.println("enter the valid input");
                    break;

            }
        } while (input != 4);
        return employeeList;
    }

    public Employee addHourlyEmployee() {

        Scanner scanner = new Scanner(System.in);
        Employee employee1 = new Employee();
        System.out.println(" Read hourly  Employee");
        System.out.println("enter the Name");
        employee1.setName(scanner.next());
        System.out.println("enter the address");
        employee1.setAddress(scanner.next());
        System.out.println(" enter the id");
        employee1.setId(scanner.nextInt());
        System.out.println("enter the salary");
        employee1.setSalary(scanner.nextInt());
        employee1.setEnumTypes(EnumTypes.HOURLYEMPLOYEE);

        return employee1;
    }

    public Employee addCommissionEmployee() {
        Scanner scanner = new Scanner(System.in);
        Employee employee2 = new Employee();
        System.out.println(" Read commission Employee");
        System.out.println("enter the name");
        employee2.setName(scanner.next());
        System.out.println("enter the address");
        employee2.setAddress(scanner.next());
        System.out.println("enter THE ID");
        employee2.setId(scanner.nextInt());
        System.out.println("enter the Salaryy");
        employee2.setSalary(scanner.nextInt());
        employee2.setEnumTypes(EnumTypes.COMISSIONEMPLOYEE);

        return employee2;
    }

    public Employee addSalaryEmployee() {
        Scanner scanner = new Scanner(System.in);
        Employee employee3 = new Employee();
        System.out.println("Read salary  employee");
        System.out.println("Enter the name:");
        employee3.setName(scanner.next());
        System.out.println("enter the address");
        employee3.setAddress(scanner.next());
        System.out.println("enter the id");
        employee3.setId(scanner.nextInt());
        System.out.println("enter the Salary::");
        employee3.setSalary(scanner.nextInt());
        employee3.setEnumTypes(EnumTypes.SALARYEMPLOYEE);

        return employee3;
    }

    public List<Employee> showAllEmployee(List<Employee> employeeList) {
        Scanner scanner = new Scanner(System.in);
        Employee employee1 = new Employee();
        int input;
        do {
            System.out.println("1. show salary employee");
            System.out.println(" 2. show commission employee");
            System.out.println(" 3. show hourly employee");
            System.out.println("4. exit");
            System.out.println("your choice");
            input = scanner.nextInt();
            switch (input) {
                case 1:
                    System.out.println("All the Salary employee list ");

                    employee1.showSalaryEmployee(employeeList);
                    break;
                case 2:
                    System.out.println(" All the commission employee List");
                    employee1.showCommissionEmployee(employeeList);
                    break;
                case 3:
                    System.out.println(" All the hourly employee list");
                    employee1.showHourlyEmployee(employeeList);
                    break;
                default:
                    System.out.println(" enter the valid input");
                    break;

            }
        } while (input != 4);
        return employeeList;
    }

    private void showHourlyEmployee(List<Employee> employeeList) {
        //HourlyEmployee hourlyEmployee = new HourlyEmployee();
        for (Employee employee : employeeList) {
            if (employee.getEnumTypes().equals(EnumTypes.HOURLYEMPLOYEE)){
                System.out.println(employee.toString());
        }
        }
    }


    private void showCommissionEmployee(List<Employee> employeeList) {
        //CommissionEmployee commissionEmployee = new CommissionEmployee();
        for (Employee employee : employeeList) {
            if(employee.getEnumTypes().equals(EnumTypes.COMISSIONEMPLOYEE)) {
                System.out.println(employee.toString());
            }
        }
    }


    private void showSalaryEmployee(List<Employee> employeeList) {
        for (Employee employee : employeeList) {
            if (employee.getEnumTypes().equals(EnumTypes.SALARYEMPLOYEE)) {
                System.out.println(employee.toString());
            }
        }
    }

    public EnumTypes getEnumTypes() {
        return enumTypes;
    }

    public void setEnumTypes(EnumTypes enumTypes) {
        this.enumTypes = enumTypes;
    }
}




