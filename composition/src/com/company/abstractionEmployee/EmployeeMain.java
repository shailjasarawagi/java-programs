package com.company.abstractionEmployee;


import com.company.interfaceemployee.Invoice;
import com.company.interfaceemployee.Payable;


public class EmployeeMain {
    public static void main(String[] args) {
        SalaryEmployee salaryEmployee = new SalaryEmployee();
        salaryEmployee.earning();
        HourlyEmployee hourlyEmployee= new HourlyEmployee();
        hourlyEmployee.earning();
        CommissionEmployee commissionEmployee = new CommissionEmployee();
        commissionEmployee.earning();


    }
}
