package com.company.employee;

public class EmployeeMain {
    public static void main(String[] args) {
        SalaryPlusCommissionEmployee  salaryPlusCommissionEmployee = new SalaryPlusCommissionEmployee();
        salaryPlusCommissionEmployee.setName("ss");
        salaryPlusCommissionEmployee.setSalary(23000);
        salaryPlusCommissionEmployee.setTotalSales(45000);
        salaryPlusCommissionEmployee.setCommission(4500);
        salaryPlusCommissionEmployee.totalEarning();
        System.out.println(salaryPlusCommissionEmployee.totalEarning());
        System.out.println(salaryPlusCommissionEmployee.toString());


    }
}
