package LabActivity2;
import java.util.Scanner;

 
public class LabActivity2EmployeeInformationSystemPart2 {

    public static void main(String[] args) {
  
        
  Scanner scan = new Scanner(System.in);
  String FirstName;
  String LastName;
  int Age;
  Double NumberOfHoursWorked; 
  Double HourlyWage;
  Double GOVERNMENTBENEFITS =  1500.00;
  
  
//  For Getting input and Outputting Firstname
  System.out.print("Enter your First name    : ");
  FirstName = scan.nextLine();
 
  
  //  For Getting input and Outputting Lastname
  System.out.print("Enter your Last name     : ");
  LastName = scan.nextLine();
  String FullName =("Full name            : " +  LastName + ", " +FirstName ).toUpperCase();
  
 //  For Getting input and Outputting Age
  System.out.print("Enter your Age : ");
  Age = scan.nextInt();

//  For getting hours work input and output 
  System.out.print("Enter your hours worked  : ");
  NumberOfHoursWorked = scan.nextDouble();
  
//  For getting input for hourly wage
  System.out.print("Enter your Hourly Wage  : ");
  HourlyWage = scan.nextDouble();

// Seperated the computation for readability 
Double DailySalary = NumberOfHoursWorked * HourlyWage;
Double GrossYearlySalary = DailySalary * 240; 

//  For Outputting Personal Information and computing Daily Salary
  System.out.println(" ");
  System.out.println("Employee Information");
  System.out.println("--------------------");
  System.out.println(FullName);
  System.out.println("Age                  : " + Age + " years Old");
  System.out.println("Years to Retirement  : " + Math.abs(65 - Age )  + " years ");
  System.out.printf("Daily Salary         : PHP %.2f%n", DailySalary);
  System.out.printf("Weekly Salary        : PHP %.2f%n", DailySalary * 5);
  System.out.printf("Monthly Salary       : PHP %.2f%n", DailySalary * 20);
  System.out.printf("Gross Yearly Salary  : PHP %.2f%n", GrossYearlySalary);
  System.out.printf("Net Yearly Salary    : PHP %.2f%n", ( GrossYearlySalary - ( GrossYearlySalary * 0.32) - GOVERNMENTBENEFITS));
 
}
}