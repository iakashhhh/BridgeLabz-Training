package com.objectmodelling.CompanyAndDepartments;

public class Employee {
	
	private String name;

    public Employee(String name) {
        this.name = name;
    }

    public void showEmployee() {
        System.out.println("Employee: " + name);
    }

}