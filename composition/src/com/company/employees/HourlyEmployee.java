package com.company.employees;

public class HourlyEmployee  extends Employee{
    private int hour;

    public HourlyEmployee(){
        super();

    }

        public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public String toString(){
        return " hour of employee " +getHour() + super.toString();
    }
}


