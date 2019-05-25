package com.company.abstractionEmployee;

public class CommissionEmployee extends Employee{
    private int TotalSales;
    private int Commission;

    @Override
    public   void earning(){
        System.out.println(" Commission Employee");
        CommissionEmployee commissionEmployee = new CommissionEmployee();
        commissionEmployee.setName("AAshish");
        commissionEmployee.setAddress("kupondole");
        commissionEmployee.setId(2);
        commissionEmployee.setSalary(4590);
        commissionEmployee.setCommission(450);
        commissionEmployee.setTotalSales(4500);
        commissionEmployee.TotalEarning();
        System.out.println(commissionEmployee.toString());
        System.out.println(commissionEmployee.TotalEarning());

    }

    private String TotalEarning() {
        return " total earning of commisiion employee:::" +getCommission()*getTotalSales();
    }


    public int getTotalSales() {
        return TotalSales;
    }

    public void setTotalSales(int totalSales) {
        TotalSales = totalSales;
    }

    public int getCommission() {
        return Commission;
    }

    public void setCommission(int commission) {
        Commission = commission;
    }


    @Override
    public String toString(){
        return  super.toString() +  "  total sales::: " +getTotalSales() +   "commission of employee::: " +getCommission() ;
    }
}
