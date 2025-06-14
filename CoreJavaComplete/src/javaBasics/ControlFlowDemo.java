package javaBasics;
import java.util.Scanner;

public class ControlFlowDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // === IF-ELSE STATEMENTS ===
        System.out.println("=== IF-ELSE Examples ===");

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Simple if-else
        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }

        // Nested if-else
        if (age >= 0 && age <= 12) {
            System.out.println("Category: Child");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Category: Teenager");
        } else if (age >= 20 && age <= 59) {
            System.out.println("Category: Adult");
        } else if (age >= 60) {
            System.out.println("Category: Senior");
        } else {
            System.out.println("Invalid age entered.");
        }

        // === SWITCH STATEMENTS ===
        System.out.println("\n=== SWITCH Examples ===");

        System.out.print("Enter day number (1-7): ");
        int dayNumber = scanner.nextInt();

        String dayName;
        switch (dayNumber) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
        }
        System.out.println("Day: " + dayName);

        // Switch with fall-through example
        System.out.print("Enter month number (1-12): ");
        int month = scanner.nextInt();

        String season;
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Fall";
                break;
            default:
                season = "Invalid month";
        }
        System.out.println("Season: " + season);

        // === FOR LOOPS ===
        System.out.println("\n=== FOR LOOP Examples ===");

        // Basic for loop
        System.out.println("Numbers 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " ");
        }
        System.out.println();

        // Reverse for loop
        System.out.println("Numbers 5 to 1:");
        for (int i = 5; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        // For loop with step
        System.out.println("Even numbers 2 to 10:");
        for (int i = 2; i <= 10; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();


        // Nested for loops - Multiplication table
        System.out.println("\nMultiplication table (2x2):");
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 2; j++) {
                System.out.print(i * j + "\t");
            }

            System.out.println();
        }

        // === WHILE LOOPS ===
        System.out.println("\n=== WHILE LOOP Examples ===");

        // Basic while loop
        System.out.println("Countdown from 5:");
        int count = 5;
        while (count > 0) {
            System.out.print(count + " ");
            count--;
        }
        System.out.println("Blast off!");

        // While loop for input validation
        System.out.print("\nEnter a positive number: ");
        int positiveNum = scanner.nextInt();
        while (positiveNum <= 0) {
            System.out.print("Invalid! Enter a positive number: ");
            positiveNum = scanner.nextInt();
        }
        System.out.println("You entered: " + positiveNum);

        // === DO-WHILE LOOPS ===
        System.out.println("\n=== DO-WHILE LOOP Examples ===");

        // Basic do-while
        System.out.println("Numbers using do-while:");
        int num = 1;
        do {
            System.out.print(num + " ");
            num++;
        } while (num <= 3);
        System.out.println();

        // Menu system with do-while
        int choice;
        do {
            System.out.println("\n--- Simple Menu ---");
            System.out.println("1. Option A");
            System.out.println("2. Option B");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("You selected Option A");
                    break;
                case 2:
                    System.out.println("You selected Option B");
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 3);

        // === BREAK and CONTINUE ===
        System.out.println("\n=== BREAK and CONTINUE Examples ===");

        // Break example
        System.out.println("Break example - Stop at 5:");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break; // Exit loop when i equals 5
            }
            System.out.print(i + " ");
        }
        System.out.println("\nLoop ended at 5");

        // Continue example
        System.out.println("Continue example - Skip even numbers:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // Skip even numbers
            }
            System.out.print(i + " ");
        }
        System.out.println();

        // Nested loops with labeled break
        System.out.println("Nested loops with labeled break:");
        outerLoop: for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    break outerLoop; // Break from outer loop
                }
                System.out.print("(" + i + "," + j + ") ");
            }
            System.out.println();
        }

        // === PRACTICAL EXAMPLES ===
        System.out.println("\n=== Practical Examples ===");

        // Prime number checker
        System.out.print("Enter a number to check if prime: ");
        int checkNum = scanner.nextInt();
        boolean isPrime = true;

        if (checkNum <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(checkNum); i++) {
                if (checkNum % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(checkNum + " is a prime number.");
        } else {
            System.out.println(checkNum + " is not a prime number.");
        }

        // Factorial calculation
        System.out.print("Enter a number for factorial: ");
        int factNum = scanner.nextInt();
        long factorial = 1;

        for (int i = 1; i <= factNum; i++) {
            factorial *= i;
        }
        System.out.println(factNum + "! = " + factorial);

        // Pattern printing
        System.out.println("Star pattern:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        scanner.close();
    }
}