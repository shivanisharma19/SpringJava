package org.example;

public class Department {

    String deptName;

    public Department() {
        System.out.println("no arg constructor - Department");
    }

    public Department(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
