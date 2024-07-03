package com.tehreem.calculator;

import java.util.Scanner;

public class Application {
	
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       String operation = "";
       if (args.length > 0) {
        // If the user enters add, subtract, multiply, divide or factorial as the
       	// CLI argument then they are processed, any other input results in an
       	// invalid operation message
           operation = args[0];
       }
      
       else {
           // User enters no CLI arguments, ask for user input
           System.out.println("Enter operation: add, subtract, multiply, divide, factorial");
           operation = scanner.next();
       }
       double num1 = 0, num2 = 0;
      
       // Perform required operation based on user input
       switch (operation.toLowerCase()) {
           case "add":
               System.out.println("Enter the first operand:");
               num1 = scanner.nextDouble();
               System.out.println("Enter the second operand:");
               num2 = scanner.nextDouble();
               System.out.println("Result: " + add(num1, num2));
               break;
           case "factorial":
               System.out.println("Enter a number:");
               num1 = scanner.nextDouble();
               System.out.println("Result: " + factorial(num1));
               break;
           case "multiply":
               System.out.println("Enter the first operand:");
               num1 = scanner.nextDouble();
               System.out.println("Enter the second operand:");
               num2 = scanner.nextDouble();
               System.out.println("Result: " + multiply(num1, num2));
               break;
           case "subtract":
               System.out.println("Enter the first operand:");
               num1 = scanner.nextDouble();
               System.out.println("Enter the second operand:");
               num2 = scanner.nextDouble();
               System.out.println("Result: " + subtract(num1, num2));
               break;
           case "divide":
               System.out.println("Enter the first operand:");
               num1 = scanner.nextDouble();
               System.out.println("Enter the second operand:");
               num2 = scanner.nextDouble();
               double result = divide(num1, num2);
               if (result != Double.NaN) {
                   System.out.println("Result: " + result);
               }
               break;
           default:
               System.out.println("Invalid operation.");
               break;
       }
       scanner.close();
   }
  
   // Method to add, parameters: doubles a and b, returns: sum of a and b
   public static double add(double a, double b) {
       return a + b;
   }
  
   // Method to find the factorial, parameter: double n, returns: factorial of n
   public static double factorial(double n) {
       if (n <= 1) {
           return 1;
       } else {
           return n * factorial(n - 1);
       }
   }
  
   // Method to multiply, parameters: doubles a and b, returns: product of a and b
   public static double multiply(double a, double b) {
       return a * b;
   }
   // Method to subtract, parameters: doubles a and b, returns: difference of a and b
   public static double subtract(double a, double b) {
       return a - b;
   }
   // Method to divide, parameters: doubles a and b, makes sure there is no division by 0
   // Returns NaN and prints an error message if b = 0, returns quotient of a / b if b != 0
   public static double divide(double a, double b) {
       if (b == 0) {
           System.out.println("Cannot divide by 0");
           return Double.NaN;
       } else {
           return a / b;
       }
   }
}

