package com.company.interfaceemployee;

public class EmployeeMain {
    public static void main(String[] args) {
        SalaryEmployee salaryEmployee = new SalaryEmployee();
        salaryEmployee.earning();
        HourlyEmployee hourlyEmployee= new HourlyEmployee();
        hourlyEmployee.earning();
        CommissionEmployee commissionEmployee = new CommissionEmployee();
        commissionEmployee.earning();
        Invoice invoice = new Invoice();
        invoice.setPrice(4);
        invoice.setQuantity(5);
        System.out.println(invoice.payment());

        Payable payable = new Invoice();
        payable.payment();
        Payable payable1 = new SalaryEmployee();
        payable1.payment();




    }
}
