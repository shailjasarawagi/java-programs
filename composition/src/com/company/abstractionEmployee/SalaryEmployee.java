package com.company.abstractionEmployee;

public class SalaryEmployee extends Employee {
    @Override
    public void earning(){
        System.out.println("Salary Employee");
        SalaryEmployee salaryEmployee = new SalaryEmployee();
        salaryEmployee.setName("shailja");
        salaryEmployee.setAddress("Sanepa" );
        salaryEmployee.setId(3);
        salaryEmployee.setSalary(45000);
        System.out.println(salaryEmployee.toString());

    }

}
