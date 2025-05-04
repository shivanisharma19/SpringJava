package org.example;

public class Employee {
    int empId;
    String empName;

    public Employee() {
        System.out.println("no arg constructor - Employee");
    }

    public Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setup(){
        System.out.println("init function");
    }

    public void clear(){
        //will only work before closing the config
        System.out.println("destroy function");
    }
}
