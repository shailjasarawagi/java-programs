package com.company.employee;

public class SalaryPlusCommissionEmployee extends SalaryEmployee {
    private  int totalSales;
    private int commission;
    public SalaryPlusCommissionEmployee(){
        super();
    }

    public int getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(int totalSales) {
        this.totalSales = totalSales;
    }

    public int getCommission() {
        return commission;
    }

    public void setCommission(int commission) {
        this.commission = commission;
    }

    @Override
    public int totalEarning() {
        return super.totalEarning() + getTotalSales()*getCommission();
    }

    @Override
    public String toString(){
        return " commission of employee " +getCommission() + super.toString();
    }
}
