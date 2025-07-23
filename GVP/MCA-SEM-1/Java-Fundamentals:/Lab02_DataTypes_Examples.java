/**
 * Lab Session 2: Data Types and Variables - Examples
 * Course: MCA-SEM-3 Java Fundamentals
 * 
 * This file demonstrates various data types and variable usage in Java
 */

// Example 1: Basic Data Types Demonstration
class DataTypesDemo {
    public static void main(String[] args) {
        // Integer types
        byte smallNumber = 127;
        short mediumNumber = 32000;
        int regularNumber = 2147483647;
        long bigNumber = 9223372036854775807L;
        
        // Floating point types
        float price = 99.99f;
        double salary = 75000.50;
        
        // Character and boolean
        char grade = 'A';
        boolean isPassed = true;
        
        // String (non-primitive)
        String studentName = "Alice Johnson";
        
        System.out.println("=== Data Types Demonstration ===");
        System.out.println("Byte value: " + smallNumber);
        System.out.println("Short value: " + mediumNumber);
        System.out.println("Int value: " + regularNumber);
        System.out.println("Long value: " + bigNumber);
        System.out.println("Float value: " + price);
        System.out.println("Double value: " + salary);
        System.out.println("Char value: " + grade);
        System.out.println("Boolean value: " + isPassed);
        System.out.println("String value: " + studentName);
        System.out.println("================================");
    }
}

// Example 2: Variable Scope and Initialization
class VariableScopeDemo {
    // Class-level variables (fields)
    static String collegeName = "GVP College";
    static int totalStudents = 500;
    
    public static void main(String[] args) {
        // Local variables
        String courseName = "MCA";
        int semester = 3;
        
        System.out.println("=== Variable Scope Demo ===");
        System.out.println("College: " + collegeName);
        System.out.println("Total Students: " + totalStudents);
        System.out.println("Course: " + courseName);
        System.out.println("Semester: " + semester);
        
        // Block scope
        if (semester > 2) {
            String message = "Advanced level course";
            System.out.println("Message: " + message);
            // 'message' is only accessible within this block
        }
        
        System.out.println("===========================");
    }
}

// Example 3: Constants and Final Variables
class ConstantsDemo {
    // Constants (final variables)
    static final double PI = 3.14159;
    static final int MAX_MARKS = 100;
    static final String UNIVERSITY = "Andhra University";
    
    public static void main(String[] args) {
        final int PASSING_MARKS = 40;
        
        int studentMarks = 85;
        double circleRadius = 5.0;
        double circleArea = PI * circleRadius * circleRadius;
        
        System.out.println("=== Constants Demonstration ===");
        System.out.println("University: " + UNIVERSITY);
        System.out.println("Maximum Marks: " + MAX_MARKS);
        System.out.println("Passing Marks: " + PASSING_MARKS);
        System.out.println("Student Marks: " + studentMarks);
        System.out.println("Circle Radius: " + circleRadius);
        System.out.println("Circle Area: " + circleArea);
        
        // Check if student passed
        if (studentMarks >= PASSING_MARKS) {
            System.out.println("Result: PASSED");
        } else {
            System.out.println("Result: FAILED");
        }
        System.out.println("===============================");
    }
}

// Example 4: Type Casting and Conversion
class TypeCastingDemo {
    public static void main(String[] args) {
        System.out.println("=== Type Casting Demonstration ===");
        
        // Implicit casting (widening)
        int intValue = 100;
        long longValue = intValue;          // int to long
        float floatValue = longValue;       // long to float
        double doubleValue = floatValue;    // float to double
        
        System.out.println("Implicit Casting:");
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);
        
        // Explicit casting (narrowing)
        double originalDouble = 99.99;
        float castToFloat = (float) originalDouble;
        int castToInt = (int) originalDouble;
        
        System.out.println("\nExplicit Casting:");
        System.out.println("Original double: " + originalDouble);
        System.out.println("Cast to float: " + castToFloat);
        System.out.println("Cast to int: " + castToInt + " (decimal part lost)");
        
        // String to number conversion
        String numberString = "123";
        int convertedInt = Integer.parseInt(numberString);
        double convertedDouble = Double.parseDouble("456.78");
        
        System.out.println("\nString Conversion:");
        System.out.println("String: " + numberString);
        System.out.println("Converted to int: " + convertedInt);
        System.out.println("String to double: " + convertedDouble);
        
        System.out.println("==================================");
    }
}

// Example 5: Student Information System
class StudentInfoSystem {
    public static void main(String[] args) {
        // Student details using various data types
        final String COLLEGE_CODE = "GVP";
        
        String studentName = "Rajesh Kumar";
        int rollNumber = 2023001;
        char section = 'A';
        boolean isHostelStudent = true;
        float cgpa = 8.75f;
        double feesPaid = 45000.00;
        
        // Calculate remaining fees
        final double TOTAL_FEES = 50000.00;
        double remainingFees = TOTAL_FEES - feesPaid;
        
        // Display student information
        System.out.println("=== Student Information System ===");
        System.out.println("College Code: " + COLLEGE_CODE);
        System.out.println("Student Name: " + studentName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Section: " + section);
        System.out.println("Hostel Student: " + (isHostelStudent ? "Yes" : "No"));
        System.out.println("CGPA: " + cgpa);
        System.out.println("Fees Paid: ₹" + feesPaid);
        System.out.println("Remaining Fees: ₹" + remainingFees);
        
        // Grade calculation based on CGPA
        char letterGrade;
        if (cgpa >= 9.0) {
            letterGrade = 'A';
        } else if (cgpa >= 8.0) {
            letterGrade = 'B';
        } else if (cgpa >= 7.0) {
            letterGrade = 'C';
        } else {
            letterGrade = 'D';
        }
        
        System.out.println("Letter Grade: " + letterGrade);
        System.out.println("==================================");
    }
}

// Example 6: Data Type Limits and Overflow
class DataTypeLimitsDemo {
    public static void main(String[] args) {
        System.out.println("=== Data Type Limits ===");
        
        // Display limits of different data types
        System.out.println("Byte range: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("Short range: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("Int range: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("Long range: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        
        // Demonstrate overflow
        System.out.println("\n=== Overflow Demonstration ===");
        int maxInt = Integer.MAX_VALUE;
        System.out.println("Max int value: " + maxInt);
        System.out.println("Max int + 1: " + (maxInt + 1)); // This will overflow
        
        // Safe way to handle large numbers
        long safeLargeNumber = (long) maxInt + 1;
        System.out.println("Safe large number: " + safeLargeNumber);
        
        System.out.println("=============================");
    }
}
