package com.company.employee;

public class SalaryEmployee {

    private String name;
    private String address;
    private int salary;

    @Override
    public String toString() {
        return "   Employee information:: NAme::" + getName()
                + "   Address of employee::" + getAddress()
                + " salary of employee::" + getSalary();
    }

    public int totalEarning() {
        return getSalary();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
