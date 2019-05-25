package com.company.employees;

public class SalaryEmployee extends Employee {
    private int earning;

    public SalaryEmployee(){
        super();
    }


        public int getEarning() {
        return earning;
    }

    public void setEarning(int earning) {
        this.earning = earning;
    }

    @Override
    public String toString(){
        return "  earning of employee " +getEarning()   + super.toString();
    }
}


