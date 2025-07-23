/**
 * Lab Session 1: Main Method Examples
 * Course: MCA-SEM-3 Java Fundamentals
 * 
 * This file demonstrates the main method fundamentals
 */

// Example 1: Simple Hello World Program
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Welcome to Java Programming Lab");
    }
}

// Example 2: Program with Variables
class BasicProgram {
    public static void main(String[] args) {
        // Variable declarations and basic operations
        String studentName = "John Doe";
        int age = 20;
        double marks = 85.5;
        
        // Display information
        System.out.println("=== Student Information ===");
        System.out.println("Name: " + studentName);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
        System.out.println("===========================");
    }
}

// Example 3: Using Command Line Arguments
class CommandLineDemo {
    public static void main(String[] args) {
        System.out.println("=== Command Line Arguments Demo ===");
        System.out.println("Number of arguments: " + args.length);
        
        if (args.length > 0) {
            System.out.println("Arguments received:");
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argument " + (i + 1) + ": " + args[i]);
            }
        } else {
            System.out.println("No arguments provided");
        }
        System.out.println("===================================");
    }
}
