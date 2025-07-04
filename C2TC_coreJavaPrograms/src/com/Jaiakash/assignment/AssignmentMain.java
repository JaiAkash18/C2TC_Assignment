package com.Jaiakash.assignment;



import com.Jaiakash.assignment.employees.*;
import com.Jaiakash.assignment.utilities.EmployeeUtilities;

/**
 * Main class to demonstrate employee operations.
 */
public class AssignmentMain {
    public static void main(String[] args) {
        Manager mgr = new Manager("Alice", 101, 50000, 5);
        Developer dev = new Developer("Bob", 102, 45000, "Java");

        System.out.println("Manager Details:");
        EmployeeUtilities.printEmployeeDetails(mgr);
        System.out.println("Team Size: " + mgr.getTeamSize());
        System.out.println("Annual Salary: " + EmployeeUtilities.calculateAnnualSalary(mgr));

        System.out.println("\nDeveloper Details:");
        EmployeeUtilities.printEmployeeDetails(dev);
        System.out.println("Programming Language: " + dev.getProgrammingLanguage());
        System.out.println("Annual Salary: " + EmployeeUtilities.calculateAnnualSalary(dev));
    }
}