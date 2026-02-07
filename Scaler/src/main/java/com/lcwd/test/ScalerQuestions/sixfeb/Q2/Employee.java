package com.lcwd.test.ScalerQuestions.sixfeb.Q2;

public class Employee extends User{
    private int employeeId;
    private String department;

    public Employee(String username, String email, int employeeId, String department) {
        super(username, email);
        this.employeeId = employeeId;
        this.department = department;
    }

    @Override
    public void displayInfo() {
            super.displayInfo();
            System.out.println("Employee ID: " + employeeId);
            System.out.println("Department: " + department);
    }

     public int getEmployeeId() {
        return employeeId;
    }

    public String getDepartment() {
        return department;
    }
}
