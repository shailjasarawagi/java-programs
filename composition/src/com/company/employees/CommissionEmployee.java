package com.company.employees;

public class CommissionEmployee extends Employee {
    private int TotalSales;
    private int commission;

    public CommissionEmployee() {
        super();
    }

    public int getTotalSales() {
        return TotalSales;
    }

    public void setTotalSales(int totalSales) {
        TotalSales = totalSales;
    }

    public int getCommission() {
        return commission;
    }

    public void setCommission(int commission) {
        this.commission = commission;
    }


    @Override
    public String toString() {
        return " commission of employee " + getCommission() + super.toString();
    }

}




