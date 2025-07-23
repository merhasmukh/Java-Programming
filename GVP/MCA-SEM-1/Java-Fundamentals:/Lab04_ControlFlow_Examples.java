/**
 * Lab Session 4: Control Flow Statements - Examples
 * Course: MCA-SEM-3 Java Fundamentals
 * 
 * This file demonstrates various control flow statements in Java
 */

import java.util.Scanner;

// Example 1: if-else Statements
class ConditionalStatementsDemo {
    public static void main(String[] args) {
        int marks = 75;
        int attendance = 80;
        
        System.out.println("=== Conditional Statements Demo ===");
        System.out.println("Marks: " + marks + ", Attendance: " + attendance + "%");
        
        // Simple if statement
        if (marks >= 90) {
            System.out.println("Excellent performance!");
        }
        
        // if-else statement
        if (marks >= 60) {
            System.out.println("Result: PASSED");
        } else {
            System.out.println("Result: FAILED");
        }
        
        // if-else if-else statement
        String grade;
        if (marks >= 90) {
            grade = "A+";
        } else if (marks >= 80) {
            grade = "A";
        } else if (marks >= 70) {
            grade = "B";
        } else if (marks >= 60) {
            grade = "C";
        } else if (marks >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("Grade: " + grade);
        
        // Nested if statements
        if (marks >= 60) {
            if (attendance >= 75) {
                System.out.println("Eligible for next semester");
            } else {
                System.out.println("Passed but low attendance warning");
            }
        } else {
            System.out.println("Must repeat the semester");
        }
        System.out.println("===================================");
    }
}

// Example 2: Switch Statement
class SwitchStatementDemo {
    public static void main(String[] args) {
        int dayNumber = 3;
        char grade = 'B';
        String month = "January";
        
        System.out.println("=== Switch Statement Demo ===");
        
        // Switch with int
        System.out.print("Day " + dayNumber + " is: ");
        switch (dayNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number");
        }
        
        // Switch with char
        System.out.print("Grade " + grade + " means: ");
        switch (grade) {
            case 'A':
                System.out.println("Excellent (90-100)");
                break;
            case 'B':
                System.out.println("Good (80-89)");
                break;
            case 'C':
                System.out.println("Average (70-79)");
                break;
            case 'D':
                System.out.println("Below Average (60-69)");
                break;
            case 'F':
                System.out.println("Fail (Below 60)");
                break;
            default:
                System.out.println("Invalid grade");
        }
        
        // Switch with String
        System.out.print(month + " has: ");
        switch (month) {
            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "December":
                System.out.println("31 days");
                break;
            case "April":
            case "June":
            case "September":
            case "November":
                System.out.println("30 days");
                break;
            case "February":
                System.out.println("28 or 29 days");
                break;
            default:
                System.out.println("Invalid month");
        }
        System.out.println("==============================");
    }
}

// Example 3: for Loop
class ForLoopDemo {
    public static void main(String[] args) {
        System.out.println("=== for Loop Demo ===");
        
        // Basic for loop
        System.out.println("Counting from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }
        
        // for loop with different increment
        System.out.println("\nEven numbers from 2 to 10:");
        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i);
        }
        
        // Reverse for loop
        System.out.println("\nCountdown from 5 to 1:");
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }
        
        // for loop with multiple variables
        System.out.println("\nMultiple variables in for loop:");
        for (int i = 0, j = 10; i < 5; i++, j--) {
            System.out.println("i = " + i + ", j = " + j);
        }
        
        // Multiplication table
        int number = 7;
        System.out.println("\nMultiplication table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        System.out.println("======================");
    }
}

// Example 4: while Loop
class WhileLoopDemo {
    public static void main(String[] args) {
        System.out.println("=== while Loop Demo ===");
        
        // Basic while loop
        System.out.println("Counting with while loop:");
        int count = 1;
        while (count <= 5) {
            System.out.println("Count: " + count);
            count++;
        }
        
        // Finding factorial
        int number = 5;
        int factorial = 1;
        int temp = number;
        while (temp > 0) {
            factorial *= temp;
            temp--;
        }
        System.out.println("\nFactorial of " + number + " = " + factorial);
        
        // Sum of digits
        int num = 12345;
        int sum = 0;
        int originalNum = num;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("Sum of digits of " + originalNum + " = " + sum);
        
        // Reverse a number
        int original = 12345;
        int reversed = 0;
        int temp2 = original;
        while (temp2 > 0) {
            reversed = reversed * 10 + temp2 % 10;
            temp2 /= 10;
        }
        System.out.println("Reverse of " + original + " = " + reversed);
        System.out.println("========================");
    }
}

// Example 5: do-while Loop
class DoWhileLoopDemo {
    public static void main(String[] args) {
        System.out.println("=== do-while Loop Demo ===");
        
        // Basic do-while loop
        System.out.println("do-while loop (executes at least once):");
        int i = 1;
        do {
            System.out.println("Iteration: " + i);
            i++;
        } while (i <= 3);
        
        // Menu simulation (without actual input for demo)
        System.out.println("\nMenu simulation:");
        int choice = 0;
        int menuCount = 0;
        do {
            menuCount++;
            System.out.println("=== Menu (Iteration " + menuCount + ") ===");
            System.out.println("1. View Profile");
            System.out.println("2. Edit Profile");
            System.out.println("3. Settings");
            System.out.println("0. Exit");
            
            // Simulate user choice (in real program, get from Scanner)
            if (menuCount == 1) choice = 1;
            else if (menuCount == 2) choice = 2;
            else choice = 0;
            
            System.out.println("Selected choice: " + choice);
            
            switch (choice) {
                case 1:
                    System.out.println("Viewing profile...");
                    break;
                case 2:
                    System.out.println("Editing profile...");
                    break;
                case 3:
                    System.out.println("Opening settings...");
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
            System.out.println();
        } while (choice != 0 && menuCount < 3); // Limit for demo
        System.out.println("===========================");
    }
}

// Example 6: break and continue Statements
class BreakContinueDemo {
    public static void main(String[] args) {
        System.out.println("=== break and continue Demo ===");
        
        // break statement
        System.out.println("Using break to exit loop early:");
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                System.out.println("Breaking at i = " + i);
                break;
            }
            System.out.println("i = " + i);
        }
        
        // continue statement
        System.out.println("\nUsing continue to skip iterations:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // Skip even numbers
            }
            System.out.println("Odd number: " + i);
        }
        
        // Finding first prime number after 10
        System.out.println("\nFinding first prime number after 10:");
        int num = 11;
        while (true) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("First prime after 10: " + num);
                break;
            }
            num++;
        }
        System.out.println("===============================");
    }
}

// Example 7: Nested Loops
class NestedLoopsDemo {
    public static void main(String[] args) {
        System.out.println("=== Nested Loops Demo ===");
        
        // Pattern printing
        System.out.println("Right triangle pattern:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        // Number pattern
        System.out.println("\nNumber pattern:");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
        // Multiplication table (multiple numbers)
        System.out.println("\nMultiplication tables (1-3):");
        for (int table = 1; table <= 3; table++) {
            System.out.println("Table of " + table + ":");
            for (int i = 1; i <= 5; i++) {
                System.out.println(table + " x " + i + " = " + (table * i));
            }
            System.out.println();
        }
        
        // Matrix-like structure
        System.out.println("Matrix pattern:");
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 4; col++) {
                System.out.print("(" + row + "," + col + ") ");
            }
            System.out.println();
        }
        System.out.println("==========================");
    }
}

// Example 8: Practical Applications
class PracticalExamples {
    public static void main(String[] args) {
        System.out.println("=== Practical Applications ===");
        
        // Grade statistics
        int[] marks = {85, 92, 78, 96, 88, 73, 91, 84, 79, 87};
        int total = 0;
        int highest = marks[0];
        int lowest = marks[0];
        int passCount = 0;
        
        System.out.println("Student marks analysis:");
        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
            
            if (marks[i] > highest) {
                highest = marks[i];
            }
            
            if (marks[i] < lowest) {
                lowest = marks[i];
            }
            
            if (marks[i] >= 60) {
                passCount++;
            }
            
            System.out.println("Student " + (i + 1) + ": " + marks[i]);
        }
        
        double average = (double) total / marks.length;
        System.out.println("\nStatistics:");
        System.out.println("Total students: " + marks.length);
        System.out.println("Average marks: " + String.format("%.2f", average));
        System.out.println("Highest marks: " + highest);
        System.out.println("Lowest marks: " + lowest);
        System.out.println("Students passed: " + passCount);
        System.out.println("Pass percentage: " + String.format("%.1f", (double) passCount / marks.length * 100) + "%");
        
        // Prime numbers in a range
        System.out.println("\nPrime numbers between 10 and 30:");
        for (int num = 10; num <= 30; num++) {
            boolean isPrime = true;
            
            if (num < 2) {
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
        System.out.println("==============================");
    }
}

// Example 9: Interactive Program Template (without actual input for demo)
class InteractiveProgramTemplate {
    public static void main(String[] args) {
        System.out.println("=== Interactive Program Template ===");
        System.out.println("(This is a template - in real program, use Scanner for input)");
        
        // Simulate menu-driven program
        boolean running = true;
        int simulatedChoice = 1;
        int iterations = 0;
        
        while (running && iterations < 3) {
            iterations++;
            System.out.println("\n=== Student Management System ===");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Calculate Average");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            // Simulate different choices
            if (iterations == 1) simulatedChoice = 1;
            else if (iterations == 2) simulatedChoice = 2;
            else simulatedChoice = 4;
            
            System.out.println(simulatedChoice);
            
            switch (simulatedChoice) {
                case 1:
                    System.out.println("Adding student...");
                    System.out.println("Student added successfully!");
                    break;
                    
                case 2:
                    System.out.println("Displaying students...");
                    System.out.println("1. John Doe - 85%");
                    System.out.println("2. Jane Smith - 92%");
                    break;
                    
                case 3:
                    System.out.println("Calculating average...");
                    System.out.println("Class average: 88.5%");
                    break;
                    
                case 4:
                    System.out.println("Thank you for using the system!");
                    running = false;
                    break;
                    
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
        System.out.println("=====================================");
    }
}
