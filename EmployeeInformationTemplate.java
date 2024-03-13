import java.util.Arrays;
import java.util.Scanner;

public class EmployeeInformationTemplate  
{
   static Scanner in = new Scanner(System.in);
   
   public static void main(String[] args)
   {
     
      //Display message "This program is for ACO101 Homework-04. Developed by: <your complete name here>"

      System.out.println("This program is for ACO101 Homework-04. Developed by: Jacob Edwards");
      System.out.println();
      
      //Prompt user, "Enter your first name: "
      //Get the value entered by user and assign it to a variable of type String to store first name

      System.out.println("Enter your first name: ");

      String name = in.next();
      
      //Prompt user, "Enter your last name: "
      //Get the value entered by user and assign it to a variable of type String to store the last name

      System.out.println("Enter your last name: ");

      String lastName = in.next();
      
      //Prompt user, "Enter your years in college: "
      //Get the value entered by user and assign it to a variable of type int to store the years in college

      System.out.println("Enter your years in college: ");

      int yearsInCollege = in.nextInt();
      
      //Prompt user, "Enter your start salary: "
      //Get the value entered by user and assign it to a variable of type double to store the start salary

      System.out.println("Enter your start salary: ");

      double startSalary = in.nextDouble();

      //Display the employee information using variables the four variables representing the employee information

      System.out.println("The employee " + name + " " + lastName + " has studied " + yearsInCollege + " years in college.");
      System.out.println("The employee is starting work for the company with the salary of " + startSalary);
      System.out.println();

      EmployeeInformationTemplate.displayEmpInfo(name, lastName, yearsInCollege, startSalary);
   }
   
   public static String readFirstName(String prompt) {
   
      //Display the prompt, get user input and return the value entered.

      String name = readFirstName("Enter your First name: ");

      return name;

   }

   public static String readLastName(String prompt) {

      String lastName = readLastName("Enter your Last name: ");

      return lastName;

   }
   
   public static double readStartSalary(String prompt) {
   
      //Display the prompt, get user input and return the value entered.

      double startSalary = readStartSalary("Enter your starting salary: ");

      return startSalary;

   }
     
   public static int readYearsInCollege(String prompt) {
   
      //Display the prompt, get user input and return the value entered.

      int yearsInCollege = readYearsInCollege("Enter your years in college: ");

      return yearsInCollege;

   }
     
   public static void displayEmpInfo(String name, String lastName, int yearsInCollege, double startSalary) {
   
         //Display the employee information.

      System.out.println("The employee " + name + " " + lastName + " has studied " + yearsInCollege + " years in college.");
      System.out.println("The employee is starting work for the company with the salary of " + startSalary);

   }

}