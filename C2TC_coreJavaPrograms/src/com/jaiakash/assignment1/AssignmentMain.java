package com.jaiakash.assignment1;
import com.jaiakash.assignment1.employees.*;
import com.jaiakash.assignment1.utilities.EmployeeUtilities;

public class AssignmentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/**
		 * Main class to demonstrate employee operations.
		 */
		
		        Manager mgr = new Manager("Alice", 101, 50000, 5);
		        Developer dev = new Developer("Bob", 102, 45000, "Java");

		        System.out.println("Manager Details:");
		        EmployeeUtilities.printEmployeeDetails(mgr);
		        System.out.println("Team Size: " + mgr.getTeamSize());
		        System.out.println("Annual Salary: " + EmployeeUtilities.calculateAnnualSalary(mgr));

		        System.out.println("\nDeveloper Details:");
		        EmployeeUtilities.printEmployeeDetails(dev);
		        System.out.println("Role: " + dev.getrole());
		        System.out.println("Annual Salary: " + EmployeeUtilities.calculateAnnualSalary(dev));
		    }
		

	}


