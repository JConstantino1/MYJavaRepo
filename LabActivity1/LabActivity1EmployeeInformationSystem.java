package LabActivity1;
import java.util.Scanner;
 
public class LabActivity1EmployeeInformationSystem {

    public static void main(String[] args) {
        
  Scanner scan = new Scanner(System.in);
  String FirstName;
  String LastName;
  int Age;
  float NumberOfHoursWorked;
  float HourlyWage;
  
//  For Getting input and Outputting Firstname
  System.out.print("Enter your First name    : ");
  FirstName = scan.nextLine();
 
  
  //  For Getting input and Outputting Lastname
  System.out.print("Enter your Last name     : ");
  LastName = scan.nextLine();
   
 //  For Getting input and Outputting Age
  System.out.print("Enter your Age : ");
  Age = scan.nextInt();

//  For getting hours work input and output 
  System.out.print("Enter your hours worked  : ");
  NumberOfHoursWorked = scan.nextFloat();
  
//  For getting input for hourly wage
  System.out.print("Enter your Hourly Wage  : ");
  HourlyWage = scan.nextFloat();
  
//  For Outputting Personal Information and computing Daily Salary
  System.out.println(" ");
  System.out.println("Employee Information");
  System.out.println("--------------------");
  System.out.println("Full name    : " + FirstName + " "+ LastName);
  System.out.println("Age          : " + Age + " Years Old");
  System.out.println("Daily Salary : " + NumberOfHoursWorked * HourlyWage );
  
}
}
