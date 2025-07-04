package com.jaiakash.assignment1.employees;

public class Employee {
	

	/**
	 * Represents a generic employee.
	 */
	
	    private String names;
	    private int employeeId;
	    private double salary;

	    // Constructor
	    public Employee(String name, int employeeId, double salary) {
	        this.names = name;
	        this.employeeId = employeeId;
	        this.salary = salary;
	    }

	    // Getters and Setters
	    public String getName() { return names; }
	    public void setName(String name) { this.names = name; }

	    public int getEmployeeId() { return employeeId; }
	    public void setEmployeeId(int employeeId) { this.employeeId = employeeId; }

	    public double getSalary() { return salary; }
	    public void setSalary(double salary) { this.salary = salary; }
	}


