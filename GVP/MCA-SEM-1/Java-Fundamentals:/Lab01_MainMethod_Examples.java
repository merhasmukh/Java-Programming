/**
 * Lab Session 1: Main Method Examples
 * Course: MCA-SEM-3 Java Fundamentals
 * 
 * This file contains comprehensive examples demonstrating the main method
 */

// Example 1: Simple Hello World Program
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Welcome to Java Programming Lab");
        System.out.println("This is our first Java program!");
    }
}

// Example 2: Program with Variables and Basic Operations
class BasicOperations {
    public static void main(String[] args) {
        // Variable declarations
        int num1 = 10;
        int num2 = 20;
        String courseName = "Java Programming";
        
        // Basic operations
        int sum = num1 + num2;
        int difference = num2 - num1;
        int product = num1 * num2;
        double average = (double)(num1 + num2) / 2;
        
        // Output results
        System.out.println("=== Basic Operations Demo ===");
        System.out.println("Course: " + courseName);
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Average: " + average);
        System.out.println("=============================");
    }
}

// Example 3: Using Command Line Arguments
class CommandLineDemo {
    public static void main(String[] args) {
        System.out.println("=== Command Line Arguments Demo ===");
        System.out.println("Number of arguments passed: " + args.length);
        
        // Check if arguments are provided
        if (args.length > 0) {
            System.out.println("Arguments received:");
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argument " + (i + 1) + ": " + args[i]);
            }
        } else {
            System.out.println("No command line arguments provided.");
            System.out.println("Try running: java CommandLineDemo Hello World 123");
        }
        System.out.println("===================================");
    }
}

// Example 4: Simple Calculator using Command Line Arguments
class SimpleCalculator {
    public static void main(String[] args) {
        System.out.println("=== Simple Calculator ===");
        
        if (args.length != 3) {
            System.out.println("Usage: java SimpleCalculator <number1> <operator> <number2>");
            System.out.println("Example: java SimpleCalculator 10 + 5");
            System.out.println("Supported operators: +, -, *, /, %");
            return;
        }
        
        try {
            double num1 = Double.parseDouble(args[0]);
            String operator = args[1];
            double num2 = Double.parseDouble(args[2]);
            double result = 0;
            
            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero!");
                        return;
                    }
                    break;
                case "%":
                    if (num2 != 0) {
                        result = num1 % num2;
                    } else {
                        System.out.println("Error: Modulus by zero!");
                        return;
                    }
                    break;
                default:
                    System.out.println("Error: Invalid operator. Use +, -, *, /, or %");
                    return;
            }
            
            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
            
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid numbers.");
        }
        System.out.println("=========================");
    }
}

// Example 5: Student Information Display
class StudentInfo {
    public static void main(String[] args) {
        // Student details
        String studentName = "Rajesh Kumar";
        int rollNumber = 2023001;
        String course = "MCA";
        int semester = 3;
        double cgpa = 8.75;
        char grade = 'A';
        boolean isScholarshipHolder = true;
        
        // Display student information
        System.out.println("=== Student Information System ===");
        System.out.println("Name: " + studentName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Course: " + course);
        System.out.println("Semester: " + semester);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Grade: " + grade);
        System.out.println("Scholarship Holder: " + (isScholarshipHolder ? "Yes" : "No"));
        
        // Calculate and display additional information
        double percentage = cgpa * 10;
        System.out.println("Percentage: " + percentage + "%");
        
        if (cgpa >= 8.0) {
            System.out.println("Status: Excellent Performance");
        } else if (cgpa >= 7.0) {
            System.out.println("Status: Good Performance");
        } else {
            System.out.println("Status: Average Performance");
        }
        System.out.println("==================================");
    }
}

// Example 6: Interactive Greeting Program
class GreetingProgram {
    public static void main(String[] args) {
        System.out.println("=== Greeting Program ===");
        
        if (args.length == 0) {
            System.out.println("Hello, Anonymous User!");
            System.out.println("Welcome to Java Programming!");
        } else if (args.length == 1) {
            System.out.println("Hello, " + args[0] + "!");
            System.out.println("Welcome to Java Programming!");
        } else {
            System.out.print("Hello, ");
            for (int i = 0; i < args.length; i++) {
                if (i == args.length - 1) {
                    System.out.print("and " + args[i] + "!");
                } else if (i == args.length - 2) {
                    System.out.print(args[i] + " ");
                } else {
                    System.out.print(args[i] + ", ");
                }
            }
            System.out.println();
            System.out.println("Welcome to Java Programming!");
        }
        System.out.println("========================");
    }
}

// Example 7: Number Analysis Program
class NumberAnalysis {
    public static void main(String[] args) {
        System.out.println("=== Number Analysis Program ===");
        
        if (args.length == 0) {
            System.out.println("Please provide numbers as command line arguments.");
            System.out.println("Example: java NumberAnalysis 10 25 30 15 40");
            return;
        }
        
        try {
            int sum = 0;
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            int count = 0;
            
            System.out.println("Numbers provided:");
            for (String arg : args) {
                int number = Integer.parseInt(arg);
                System.out.print(number + " ");
                
                sum += number;
                count++;
                
                if (number > max) {
                    max = number;
                }
                
                if (number < min) {
                    min = number;
                }
            }
            
            double average = (double) sum / count;
            
            System.out.println("\n\nAnalysis Results:");
            System.out.println("Count: " + count);
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + String.format("%.2f", average));
            System.out.println("Maximum: " + max);
            System.out.println("Minimum: " + min);
            
        } catch (NumberFormatException e) {
            System.out.println("Error: Please provide valid integers only.");
        }
        System.out.println("===============================");
    }
}

// Example 8: Pattern Generator
class PatternGenerator {
    public static void main(String[] args) {
        System.out.println("=== Pattern Generator ===");
        
        int rows = 5; // Default number of rows
        
        // If argument provided, use it as number of rows
        if (args.length > 0) {
            try {
                rows = Integer.parseInt(args[0]);
                if (rows <= 0) {
                    System.out.println("Please provide a positive number.");
                    return;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format. Using default value: 5");
                rows = 5;
            }
        }
        
        System.out.println("Generating pattern with " + rows + " rows:");
        System.out.println();
        
        // Generate right triangle pattern
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println("Number pattern:");
        
        // Generate number pattern
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("=========================");
    }
}

// Example 9: Grade Calculator
class GradeCalculator {
    public static void main(String[] args) {
        System.out.println("=== Grade Calculator ===");
        
        if (args.length == 0) {
            System.out.println("Please provide marks as command line arguments.");
            System.out.println("Example: java GradeCalculator 85 90 78 92 88");
            return;
        }
        
        try {
            double total = 0;
            int subjects = args.length;
            
            System.out.println("Subject-wise marks:");
            for (int i = 0; i < args.length; i++) {
                double marks = Double.parseDouble(args[i]);
                
                if (marks < 0 || marks > 100) {
                    System.out.println("Error: Marks should be between 0 and 100");
                    return;
                }
                
                total += marks;
                System.out.println("Subject " + (i + 1) + ": " + marks);
            }
            
            double average = total / subjects;
            
            // Determine grade
            char grade;
            if (average >= 90) {
                grade = 'A';
            } else if (average >= 80) {
                grade = 'B';
            } else if (average >= 70) {
                grade = 'C';
            } else if (average >= 60) {
                grade = 'D';
            } else if (average >= 50) {
                grade = 'E';
            } else {
                grade = 'F';
            }
            
            // Determine result
            String result = (average >= 40) ? "PASS" : "FAIL";
            
            System.out.println("\n=== Results ===");
            System.out.println("Total Marks: " + total + "/" + (subjects * 100));
            System.out.println("Percentage: " + String.format("%.2f", average) + "%");
            System.out.println("Grade: " + grade);
            System.out.println("Result: " + result);
            
        } catch (NumberFormatException e) {
            System.out.println("Error: Please provide valid numbers only.");
        }
        System.out.println("========================");
    }
}

// Example 10: System Information Display
class SystemInfo {
    public static void main(String[] args) {
        System.out.println("=== System Information ===");
        
        // Display basic system properties
        System.out.println("Java Version: " + System.getProperty("java.version"));
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
        System.out.println("Operating System: " + System.getProperty("os.name"));
        System.out.println("OS Version: " + System.getProperty("os.version"));
        System.out.println("User Name: " + System.getProperty("user.name"));
        System.out.println("User Home: " + System.getProperty("user.home"));
        System.out.println("Current Directory: " + System.getProperty("user.dir"));
        
        // Display command line arguments if any
        if (args.length > 0) {
            System.out.println("\nCommand Line Arguments:");
            for (int i = 0; i < args.length; i++) {
                System.out.println("  " + (i + 1) + ". " + args[i]);
            }
        }
        
        System.out.println("===========================");
    }
}
