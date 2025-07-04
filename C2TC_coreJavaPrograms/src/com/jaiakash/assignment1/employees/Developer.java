package com.jaiakash.assignment1.employees;


	/**
	 * Represents a developer who is an employee.
	 */
	public class Developer extends Employee {
	    private String role;

	    public Developer(String name, int employeeId, double salary, String role) {
	        super(name, employeeId, salary);
	        this.role = role;
	    }

	    public String getrole() { return role; }
	    public void setrole(String programmingLanguage) { this.role = role; }
	}


