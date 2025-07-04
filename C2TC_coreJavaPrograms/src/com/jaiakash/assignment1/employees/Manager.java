package com.jaiakash.assignment1.employees;


	/**
	 * Represents a manager who is an employee.
	 */
	public class Manager extends Employee {
	    private int teamSizes;

	    public Manager(String name, int employeeId, double salary, int teamSize) {
	        super(name, employeeId, salary);
	        this.teamSizes = teamSize;
	    }

	    public int getTeamSize() { return teamSizes; }
	    public void setTeamSize(int teamSize) { this.teamSizes = teamSize; }
	}


