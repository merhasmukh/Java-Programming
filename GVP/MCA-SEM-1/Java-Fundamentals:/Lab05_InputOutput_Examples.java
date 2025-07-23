/**
 * Lab Session 5: Basic Input/Output - Examples
 * Course: MCA-SEM-3 Java Fundamentals
 * 
 * This file demonstrates various input/output operations in Java
 */

import java.util.Scanner;
import java.util.InputMismatchException;

// Example 1: Basic Output Operations
class OutputDemo {
    public static void main(String[] args) {
        System.out.println("=== Basic Output Demo ===");
        
        // println vs print
        System.out.println("This line ends with a newline");
        System.out.print("This line ");
        System.out.print("continues ");
        System.out.println("on the same line");
        
        // Printing variables
        String studentName = "Alice Johnson";
        int rollNumber = 2023001;
        double cgpa = 8.75;
        char grade = 'A';
        boolean isScholarshipHolder = true;
        
        System.out.println("\n=== Student Information ===");
        System.out.println("Name: " + studentName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Grade: " + grade);
        System.out.println("Scholarship Holder: " + isScholarshipHolder);
        
        // Formatted output using printf
        System.out.println("\n=== Formatted Output ===");
        System.out.printf("Student: %s (Roll: %d)%n", studentName, rollNumber);
        System.out.printf("CGPA: %.2f, Grade: %c%n", cgpa, grade);
        System.out.printf("Scholarship: %s%n", isScholarshipHolder ? "Yes" : "No");
        
        System.out.println("=============================");
    }
}

// Example 2: Basic Input Operations
class InputDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Basic Input Demo ===");
        
        try {
            // Reading different data types
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            
            System.out.print("Enter your height (in meters): ");
            double height = scanner.nextDouble();
            
            System.out.print("Enter your grade: ");
            char grade = scanner.next().charAt(0);
            
            System.out.print("Are you a day scholar? (true/false): ");
            boolean isDayScholar = scanner.nextBoolean();
            
            // Display collected information
            System.out.println("\n=== Information Collected ===");
            System.out.printf("Name: %s%n", name);
            System.out.printf("Age: %d years%n", age);
            System.out.printf("Height: %.2f meters%n", height);
            System.out.printf("Grade: %c%n", grade);
            System.out.printf("Day Scholar: %s%n", isDayScholar ? "Yes" : "No");
            
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input format!");
        } finally {
            scanner.close();
        }
        
        System.out.println("============================");
    }
}

// Example 3: Input Validation
class InputValidationDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Input Validation Demo ===");
        
        // Validate positive integer
        int age = 0;
        boolean validInput = false;
        
        while (!validInput) {
            System.out.print("Enter your age (positive integer): ");
            try {
                age = scanner.nextInt();
                if (age > 0 && age < 150) {
                    validInput = true;
                } else {
                    System.out.println("Age must be between 1 and 149!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid integer!");
                scanner.next(); // Clear invalid input
            }
        }
        
        // Validate marks (0-100)
        double marks = 0;
        validInput = false;
        
        while (!validInput) {
            System.out.print("Enter your marks (0-100): ");
            try {
                marks = scanner.nextDouble();
                if (marks >= 0 && marks <= 100) {
                    validInput = true;
                } else {
                    System.out.println("Marks must be between 0 and 100!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid number!");
                scanner.next(); // Clear invalid input
            }
        }
        
        System.out.printf("Valid input received - Age: %d, Marks: %.2f%n", age, marks);
        scanner.close();
        System.out.println("==============================");
    }
}

// Example 4: Interactive Calculator
class InteractiveCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Interactive Calculator ===");
        System.out.println("Available operations: +, -, *, /, %");
        
        try {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            
            System.out.print("Enter operator (+, -, *, /, %): ");
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
                case '%':
                    if (num2 != 0) {
                        result = num1 % num2;
                    } else {
                        System.out.println("Error: Modulus by zero!");
                        validOperation = false;
                    }
                    break;
                default:
                    System.out.println("Error: Invalid operator!");
                    validOperation = false;
            }
            
            if (validOperation) {
                System.out.printf("Result: %.2f %c %.2f = %.2f%n", num1, operator, num2, result);
            }
            
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid numbers!");
        } finally {
            scanner.close();
        }
        
        System.out.println("===============================");
    }
}

// Example 5: Student Grade System
class StudentGradeSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Student Grade System ===");
        
        try {
            // Get student information
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            
            System.out.print("Enter roll number: ");
            int rollNumber = scanner.nextInt();
            
            // Get marks for 5 subjects
            String[] subjects = {"Mathematics", "Physics", "Chemistry", "English", "Computer Science"};
            double[] marks = new double[5];
            double total = 0;
            
            System.out.println("\nEnter marks for each subject (out of 100):");
            for (int i = 0; i < subjects.length; i++) {
                boolean validMarks = false;
                while (!validMarks) {
                    System.out.printf("%s: ", subjects[i]);
                    try {
                        marks[i] = scanner.nextDouble();
                        if (marks[i] >= 0 && marks[i] <= 100) {
                            total += marks[i];
                            validMarks = true;
                        } else {
                            System.out.println("Marks must be between 0 and 100!");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Please enter a valid number!");
                        scanner.next();
                    }
                }
            }
            
            // Calculate results
            double average = total / subjects.length;
            char grade = calculateGrade(average);
            String result = (average >= 40) ? "PASS" : "FAIL";
            
            // Display results
            System.out.println("\n=== RESULT CARD ===");
            System.out.printf("Name: %s%n", name);
            System.out.printf("Roll Number: %d%n", rollNumber);
            System.out.println("Subject-wise Marks:");
            
            for (int i = 0; i < subjects.length; i++) {
                System.out.printf("%-20s: %6.2f%n", subjects[i], marks[i]);
            }
            
            System.out.println("-------------------");
            System.out.printf("Total Marks: %6.2f/500%n", total);
            System.out.printf("Percentage: %7.2f%%%n", average);
            System.out.printf("Grade: %13c%n", grade);
            System.out.printf("Result: %12s%n", result);
            System.out.println("===================");
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
    
    private static char calculateGrade(double percentage) {
        if (percentage >= 90) return 'A';
        else if (percentage >= 80) return 'B';
        else if (percentage >= 70) return 'C';
        else if (percentage >= 60) return 'D';
        else if (percentage >= 40) return 'E';
        else return 'F';
    }
}

// Example 6: Menu-Driven Program
class MenuDrivenProgram {
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("=== Student Information System ===");
        
        int choice;
        do {
            displayMenu();
            choice = getChoice();
            
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    calculateAverage();
                    break;
                case 4:
                    searchStudent();
                    break;
                case 0:
                    System.out.println("Thank you for using the system!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
            
            if (choice != 0) {
                System.out.println("\nPress Enter to continue...");
                scanner.nextLine();
            }
            
        } while (choice != 0);
        
        scanner.close();
    }
    
    private static void displayMenu() {
        System.out.println("\n=== MENU ===");
        System.out.println("1. Add Student");
        System.out.println("2. View All Students");
        System.out.println("3. Calculate Class Average");
        System.out.println("4. Search Student");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }
    
    private static int getChoice() {
        try {
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            return choice;
        } catch (InputMismatchException e) {
            scanner.nextLine(); // Clear invalid input
            return -1; // Invalid choice
        }
    }
    
    private static void addStudent() {
        System.out.println("\n--- Add Student ---");
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter roll number: ");
        int rollNumber = scanner.nextInt();
        
        System.out.print("Enter marks: ");
        double marks = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        
        System.out.printf("Student added: %s (Roll: %d, Marks: %.2f)%n", name, rollNumber, marks);
    }
    
    private static void viewStudents() {
        System.out.println("\n--- All Students ---");
        System.out.println("1. John Doe (Roll: 101, Marks: 85.5)");
        System.out.println("2. Jane Smith (Roll: 102, Marks: 92.0)");
        System.out.println("3. Bob Johnson (Roll: 103, Marks: 78.5)");
    }
    
    private static void calculateAverage() {
        System.out.println("\n--- Class Average ---");
        double average = (85.5 + 92.0 + 78.5) / 3;
        System.out.printf("Class Average: %.2f%%%n", average);
    }
    
    private static void searchStudent() {
        System.out.println("\n--- Search Student ---");
        System.out.print("Enter roll number to search: ");
        int rollNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        System.out.printf("Student found: Roll %d - John Doe (Marks: 85.5)%n", rollNumber);
    }
}

// Example 7: Format Specifiers Demo
class FormatSpecifiersDemo {
    public static void main(String[] args) {
        System.out.println("=== Format Specifiers Demo ===");
        
        String name = "Alice";
        int age = 20;
        double height = 5.6;
        char grade = 'A';
        boolean isActive = true;
        
        // Basic format specifiers
        System.out.printf("String: %s%n", name);
        System.out.printf("Integer: %d%n", age);
        System.out.printf("Float: %f%n", height);
        System.out.printf("Float (2 decimals): %.2f%n", height);
        System.out.printf("Character: %c%n", grade);
        System.out.printf("Boolean: %b%n", isActive);
        
        // Width and alignment
        System.out.println("\n--- Width and Alignment ---");
        System.out.printf("Right aligned (10 chars): '%10s'%n", name);
        System.out.printf("Left aligned (10 chars): '%-10s'%n", name);
        System.out.printf("Zero padded number: %05d%n", age);
        
        // Multiple values
        System.out.println("\n--- Multiple Values ---");
        System.out.printf("Name: %s, Age: %d, Height: %.1f%n", name, age, height);
        
        // Using String.format
        String formatted = String.format("Student: %s (%d years old)", name, age);
        System.out.println("Using String.format: " + formatted);
        
        System.out.println("===============================");
    }
}
