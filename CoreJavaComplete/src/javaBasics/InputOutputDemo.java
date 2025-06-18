package javaBasics;

import java.util.Scanner;

public class InputOutputDemo {
    public static void main(String[] args) {
        // Output Examples
        System.out.println("=== Output Examples ===");
        
        // Different print methods
        System.out.print("This is print() - no newline");
        System.out.print(" - continues on same line\n");
        System.out.println("This is println() - adds newline");
        
        // Formatted output with printf
        String name = "John";
        int age = 25;
        double salary = 50000.75;
        
        System.out.printf("Name: %s\n", name);
        System.out.printf("Age: %d\n", age);
        System.out.printf("Salary: $%.2f\n", salary);
        System.out.printf("Complete: %s is %d years old and earns $%.2f\n", 
                         name, age, salary);
        
        // Input Examples
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\n=== Input Examples ===");
        
        // Reading different data types
        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();
        
        System.out.print("Enter your age: ");
        int userAge = scanner.nextInt();
        
        System.out.print("Enter your height (in feet): ");
        double userHeight = scanner.nextDouble();
        
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();
        
        // Clear the buffer after nextBoolean()
        scanner.nextLine();
        
        System.out.print("Enter your favorite quote: ");
        String quote = scanner.nextLine();
        
        // Display collected information
        System.out.println("\n=== Your Information ===");
        System.out.println("Name: " + userName);
        System.out.println("Age: " + userAge);
        System.out.println("Height: " + userHeight + " feet");
        System.out.println("Student: " + isStudent);
        System.out.println("Quote: \"" + quote + "\"");
        
        // Input validation example
        System.out.println("\n=== Input Validation Example ===");
        System.out.print("Enter a number between 1-10: ");
        
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input! Please enter a number: ");
            scanner.next(); // consume invalid input
        }
        
        int number = scanner.nextInt();
        
        while (number < 1 || number > 10) {
            System.out.print("Number must be between 1-10. Try again: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input! Please enter a number: ");
                scanner.next();
            }
            number = scanner.nextInt();
        }
        
        System.out.println("You entered: " + number);
        
        // Calculator example
        System.out.println("\n=== Simple Calculator ===");
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        double result = 0;
        boolean validOperation = true;
        
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero!");
                    validOperation = false;
                }
                break;
            default:
                System.out.println("Error: Invalid operator!");
                validOperation = false;
        }
        
        if (validOperation) {
            System.out.printf("%.2f %c %.2f = %.2f\n", num1, operator, num2, result);
        }
        
        scanner.close(); // Always close Scanner
    }
}