package com.company.inheritance;

public class GradStudent extends Student {
    private String faculty;

    public GradStudent() {
        super();
    }


    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {

        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return "faculty of student::: " + getFaculty() + super.toString();
    }

}
