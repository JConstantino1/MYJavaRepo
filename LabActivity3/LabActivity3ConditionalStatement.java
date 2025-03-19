package LabActivity3ConditionalStatement;

import java.util.Scanner;

/**
 *
 * @author Juztin
 */
public class LabActivity3ConditionalStatement {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String firstName;
        String lastName;
        int age;
        int numberOfHoursWorked;
        Double hourlyWage;
        int roleCode;
        String position;
        Double GOVERNMENT_BENEFITS = 1500.00;
        Double netYearlySalary;

        // For Getting input and Outputting Firstname
        System.out.print("Enter your First name    : ");
        firstName = scan.nextLine();

        // For Getting input and Outputting Lastname
        System.out.print("Enter your Last name : ");
        lastName = scan.nextLine();

        // For Getting input and Outputting age
        System.out.print("Enter your age : ");
        age = scan.nextInt();

        if (age < 18) {
            System.out.println("Minors are not allowed");
            System.exit(0);
        } else if (age >= 65) {
            System.out.println("Seniors are not allowed");
            System.exit(0);
        }

        // For getting hours work input and output
        System.out.print("Enter your hours worked  : ");
        numberOfHoursWorked = scan.nextInt();

        // Conditional for Number of Hours work if it exceeded 24 or 0
        if (numberOfHoursWorked > 24) {
            System.out.println("Number of hours Worked cannot exceed 24 hours");
            System.exit(0);
        } else if (numberOfHoursWorked <= 0) {
            System.out.println("Wrong input on daily work hours");
            System.exit(0);
        }

        // For getting input for hourly wage
        System.out.print("Enter your Hourly Wage  : ");
        hourlyWage = scan.nextDouble();

        // For getting input for role or position
        System.out.print("Enter your role Code (1-Manager, 2-Supervisor, 3-Staff, 4-Intern): ");
        roleCode = scan.nextInt();

        // Switch Statement for Position
        switch (roleCode) {
            case 1:
                position = "Manager";
                break;
            case 2:
                position = "Supervisor";
                break;
            case 3:
                position = "Staff";
                break;
            case 4:
                position = "Intern";
                break;
            default:
                position = "Undefined";
        }

        // Separated the computation for readability
        String fullName = ("Full name            : " + lastName + ", " + firstName).toUpperCase();
        Double dailySalary = numberOfHoursWorked * hourlyWage;
        Double grossYearlySalary = dailySalary * 240;

        if (grossYearlySalary > 250000) {
            netYearlySalary = (grossYearlySalary - (grossYearlySalary * 0.32) - GOVERNMENT_BENEFITS);
        } else {
            netYearlySalary = (grossYearlySalary - GOVERNMENT_BENEFITS);
        }

        // For Outputting Personal Information and computing Daily Salary
        System.out.println(" ");
        System.out.println("Employee Information");
        System.out.println("--------------------");
        System.out.println(fullName);
        System.out.println("Age                  : " + age + " years Old");
        System.out.println("Position             : " + position);
        System.out.println("Years to Retirement  : " + Math.abs(65 - age) + " years ");
        System.out.printf("Daily Salary         : PHP %.2f%n", dailySalary);
        System.out.printf("Weekly Salary        : PHP %.2f%n", dailySalary * 5);
        System.out.printf("Monthly Salary       : PHP %.2f%n", dailySalary * 20);
        System.out.printf("Gross Yearly Salary  : PHP %.2f%n", grossYearlySalary);
        System.out.printf("Net Yearly Salary    : PHP %.2f%n", netYearlySalary);

        scan.close();
    }
}
