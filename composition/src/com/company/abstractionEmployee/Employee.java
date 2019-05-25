package com.company.abstractionEmployee;

import com.company.employees.EnumTypes;

public  abstract class Employee {

        private int id;
        private String name;
        private String address;
        private int salary;
        private EnumTypes enumTypes;

        @Override
        public String toString() {
            return "   Employee information:: NAme::" + getName()
                    + "   Address of employee::" + getAddress()
                    + " id of employee::" + getId()
                    + " salary of employee::" + getSalary();
        }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public EnumTypes getEnumTypes() {
        return enumTypes;
    }

    public void setEnumTypes(EnumTypes enumTypes) {
        this.enumTypes = enumTypes;
    }

    public abstract void earning();
}
