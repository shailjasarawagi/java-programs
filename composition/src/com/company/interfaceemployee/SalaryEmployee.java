package com.company.interfaceemployee;

public class SalaryEmployee extends Employee {


    @Override
    public void earning(){
        System.out.println("Details of Salary Employee");
        SalaryEmployee salaryEmployee = new SalaryEmployee();
        salaryEmployee.setName("shailjaa");
        salaryEmployee.setAddress("Sanepa" );
        salaryEmployee.setId(3);
        salaryEmployee.setSalary(45000);
        System.out.println(salaryEmployee.toString());
        System.out.println(salaryEmployee.payment());

    }

    @Override
    public String payment() {
        return "total payment of employee::" +getSalary();

    }
}
