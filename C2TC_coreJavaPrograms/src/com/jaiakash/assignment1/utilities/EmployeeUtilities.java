package com.jaiakash.assignment1.utilities;



	import com.jaiakash.assignment1.employees.Employee;

	/**
	 * Utility class for Employee operations.
	 */
	public class EmployeeUtilities {

	    public static void printshowDetails(Employee emp) {
	        System.out.println("Name: " + emp.getName());
	        System.out.println("Employee ID: " + emp.getEmployeeId());
	        System.out.println("Salary: " + emp.getSalary());
	    }

	    public static double calculateAnnualSalary(Employee emp) {
	        return emp.getSalary() * 12;
	    }
	}


