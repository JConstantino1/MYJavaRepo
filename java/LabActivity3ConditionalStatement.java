
package LabActivity3ConditionalStatement;
import java.util.Scanner;
public class LabActivity3ConditionalStatement {
        public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
  String FirstName;
  String LastName;
  int Age;
  int NumberOfHoursWorked; 
  Double HourlyWage;
  String roleCode;
  Double GOVERNMENTBENEFITS =  1500.00;
  Double NetYearlySalary = 0.0;
  
  
//  For Getting input and Outputting Firstname
  System.out.print("Enter your First name : ");
  FirstName = scan.nextLine();
 
  
  //  For Getting input and Outputting Lastname
  System.out.print("Enter your Last name : ");
  LastName = scan.nextLine();
  
 //  For Getting input and Outputting Age
  System.out.print("Enter your Age : ");
  Age = scan.nextInt();
  
    if (Age < 18){
        
        System.out.println("Minors are not allowed");
        
    } else if(Age >=65){
        
        System.out.println("Seniors are not allowed"); 

        
    } else{
        //  For getting hours work input and output 
         System.out.print("Enter your hours worked  : ");
         NumberOfHoursWorked = scan.nextInt();

  
        //Conditional for Number of Hours work if it exceeded 24 or 0
         if (NumberOfHoursWorked > 24){
             
            System.out.println("Number of hours Worked cannot exceed 24 hours");
            
         }else if ( NumberOfHoursWorked <=0 ){
             
            System.out.println("Wrong input on daily work hours");
            
         }else{
             
         //  For getting input for hourly wage
            System.out.print("Enter your Hourly Wage  : ");
            HourlyWage = scan.nextDouble();

            System.out.print("Enter your role Code: ");
            roleCode = scan.next();
  
            //Switch Statement for Position  
            switch (roleCode){
  
             case "1":
                roleCode = "Manager";
                break;       
             case "2":
                roleCode = "SuperVisor";
                break; 
            case "3":
                roleCode = "Staff";
                break;       
            case "4":
                roleCode = "Intern";
                break;       
            default: 
                roleCode = "Undefined";
            }
  
        // Seperated the computation for readability 
            String FullName =("Full name            : " +  LastName + ", " +FirstName ).toUpperCase();
            Double DailySalary = NumberOfHoursWorked * HourlyWage;
            Double GrossYearlySalary = DailySalary * 240; 


            if (GrossYearlySalary > 250000){
                 NetYearlySalary= (GrossYearlySalary - ( GrossYearlySalary * 0.32) - GOVERNMENTBENEFITS);
            }else if(GrossYearlySalary <= 250000){
                 NetYearlySalary= (GrossYearlySalary -  GOVERNMENTBENEFITS);
            }

            //  For Outputting Personal Information and computing Daily Salary
            System.out.println(" ");
            System.out.println("Employee Information");
            System.out.println("--------------------");
            System.out.println(FullName);
            System.out.println("Age                  : " + Age + " years Old");
            System.out.println("Position             : " + roleCode);
            System.out.println("Years to Retirement  : " + Math.abs(65 - Age )  + " years ");
            System.out.printf("Daily Salary         : PHP %.2f%n", DailySalary);
            System.out.printf("Weekly Salary        : PHP %.2f%n", DailySalary * 5);
            System.out.printf("Monthly Salary       : PHP %.2f%n", DailySalary * 20);
            System.out.printf("Gross Yearly Salary  : PHP %.2f%n", GrossYearlySalary);
            System.out.printf("Net Yearly Salary    : PHP %.2f%n", NetYearlySalary);

}
}
    }
         }
 



       
  

    

