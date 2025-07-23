/**
 * Lab Session 1: Main Method - Sample Solutions
 * Course: MCA-SEM-3 Java Fundamentals
 * 
 * These are reference implementations for Lab01 exercises
 * Use these to verify student solutions and for demonstration
 */

// Solution for Exercise 1.1: Personal Introduction
class PersonalInfo {
    public static void main(String[] args) {
        System.out.println("=== Personal Information ===");
        System.out.println("Name: Dr. Hasmukh Patel");
        System.out.println("Employee ID: PROF001");
        System.out.println("Favorite Language: Java");
        System.out.println("Career Goal: Assistant Professor");
        System.out.println("Department: Computer Applications");
        System.out.println("============================");
    }
}

// Solution for Exercise 1.2: Simple Math Operations
class MathOperations {
    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 7;
        
        System.out.println("=== Math Operations ===");
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
        System.out.println("Addition: " + num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println("Division: " + num1 + " / " + num2 + " = " + (num1 / num2));
        System.out.println("Modulus: " + num1 + " % " + num2 + " = " + (num1 % num2));
        System.out.println("=======================");
    }
}

// Solution for Exercise 1.3: Area Calculator
class AreaCalculator {
    public static void main(String[] args) {
        // Rectangle
        int length = 15;
        int width = 10;
        int rectangleArea = length * width;
        
        // Circle
        int radius = 7;
        double pi = 3.14159;
        double circleArea = pi * radius * radius;
        
        // Triangle
        int base = 12;
        int height = 8;
        double triangleArea = 0.5 * base * height;
        
        System.out.println("=== Area Calculator ===");
        System.out.println("Rectangle (Length=" + length + ", Width=" + width + "): " + rectangleArea + " sq units");
        System.out.println("Circle (Radius=" + radius + "): " + String.format("%.2f", circleArea) + " sq units");
        System.out.println("Triangle (Base=" + base + ", Height=" + height + "): " + triangleArea + " sq units");
        System.out.println("=======================");
    }
}
