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

// Solution for Exercise 2.1: Name Greeter
class NameGreeter {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide your name as an argument");
            System.out.println("Usage: java NameGreeter <name1> <name2> ...");
        } else {
            for (int i = 0; i < args.length; i++) {
                System.out.println("Hello, " + args[i] + "!");
            }
        }
    }
}

// Solution for Exercise 2.2: Grade Calculator
class GradeCalculator {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java GradeCalculator <marks>");
            return;
        }
        
        try {
            int marks = Integer.parseInt(args[0]);
            
            if (marks < 0 || marks > 100) {
                System.out.println("Error: Marks should be between 0 and 100");
                return;
            }
            
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
            
            System.out.println("Marks: " + marks);
            System.out.println("Grade: " + grade);
            
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid number for marks");
        }
    }
}

// Solution for Exercise 2.3: Temperature Converter
class TempConverter {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java TempConverter <temperature> <source_unit> <target_unit>");
            System.out.println("Units: C for Celsius, F for Fahrenheit");
            System.out.println("Example: java TempConverter 100 C F");
            return;
        }
        
        try {
            double temperature = Double.parseDouble(args[0]);
            String sourceUnit = args[1].toUpperCase();
            String targetUnit = args[2].toUpperCase();
            
            if (!sourceUnit.equals("C") && !sourceUnit.equals("F")) {
                System.out.println("Error: Source unit must be C or F");
                return;
            }
            
            if (!targetUnit.equals("C") && !targetUnit.equals("F")) {
                System.out.println("Error: Target unit must be C or F");
                return;
            }
            
            if (sourceUnit.equals(targetUnit)) {
                System.out.println(temperature + "°" + sourceUnit + " = " + temperature + "°" + targetUnit);
                return;
            }
            
            double result;
            if (sourceUnit.equals("C") && targetUnit.equals("F")) {
                // Celsius to Fahrenheit: F = (C * 9/5) + 32
                result = (temperature * 9.0 / 5.0) + 32;
            } else {
                // Fahrenheit to Celsius: C = (F - 32) * 5/9
                result = (temperature - 32) * 5.0 / 9.0;
            }
            
            System.out.println(temperature + "°" + sourceUnit + " = " + String.format("%.2f", result) + "°" + targetUnit);
            
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid number for temperature");
        }
    }
}

// Solution for Exercise 3.1: Number Pattern Generator
class PatternGenerator {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java PatternGenerator <number>");
            return;
        }
        
        try {
            int n = Integer.parseInt(args[0]);
            
            if (n <= 0) {
                System.out.println("Error: Please enter a positive number");
                return;
            }
            
            System.out.println("Number Pattern for " + n + ":");
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }
            
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid number");
        }
    }
}

// Solution for Exercise 3.2: Simple Interest Calculator
class InterestCalculator {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java InterestCalculator <principal> <rate> <time>");
            System.out.println("Example: java InterestCalculator 10000 5 2");
            return;
        }
        
        try {
            double principal = Double.parseDouble(args[0]);
            double rate = Double.parseDouble(args[1]);
            double time = Double.parseDouble(args[2]);
            
            if (principal <= 0 || rate <= 0 || time <= 0) {
                System.out.println("Error: All values must be positive numbers");
                return;
            }
            
            double simpleInterest = (principal * rate * time) / 100;
            double totalAmount = principal + simpleInterest;
            
            System.out.println("=== Simple Interest Calculator ===");
            System.out.println("Principal Amount: ₹" + principal);
            System.out.println("Rate of Interest: " + rate + "%");
            System.out.println("Time Period: " + time + " years");
            System.out.println("Simple Interest: ₹" + String.format("%.2f", simpleInterest));
            System.out.println("Total Amount: ₹" + String.format("%.2f", totalAmount));
            System.out.println("==================================");
            
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid numbers for all parameters");
        }
    }
}

// Solution for Exercise 3.3: Word Counter
class WordCounter {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java WordCounter <word1> <word2> ... <wordN>");
            System.out.println("Example: java WordCounter Hello World Java Programming");
            return;
        }
        
        int totalWords = args.length;
        int totalCharacters = 0;
        String longestWord = args[0];
        String shortestWord = args[0];
        
        // Analyze each word
        for (String word : args) {
            totalCharacters += word.length();
            
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
            
            if (word.length() < shortestWord.length()) {
                shortestWord = word;
            }
        }
        
        System.out.println("=== Word Analysis ===");
        System.out.println("Sentence: " + String.join(" ", args));
        System.out.println("Total Words: " + totalWords);
        System.out.println("Total Characters (excluding spaces): " + totalCharacters);
        System.out.println("Longest Word: " + longestWord + " (" + longestWord.length() + " characters)");
        System.out.println("Shortest Word: " + shortestWord + " (" + shortestWord.length() + " characters)");
        System.out.println("====================");
    }
}

// Solution for Exercise 4.1: Student Report Card
class ReportCard {
    public static void main(String[] args) {
        if (args.length != 6) {
            System.out.println("Usage: java ReportCard <name> <math> <physics> <chemistry> <english> <computer>");
            System.out.println("Example: java ReportCard John 85 90 78 88 92");
            return;
        }
        
        try {
            String studentName = args[0];
            String[] subjects = {"Mathematics", "Physics", "Chemistry", "English", "Computer Science"};
            double[] marks = new double[5];
            double total = 0;
            
            // Parse and validate marks
            for (int i = 0; i < 5; i++) {
                marks[i] = Double.parseDouble(args[i + 1]);
                if (marks[i] < 0 || marks[i] > 100) {
                    System.out.println("Error: Marks should be between 0 and 100");
                    return;
                }
                total += marks[i];
            }
            
            double percentage = total / 5;
            
            // Calculate grade
            char grade;
            if (percentage >= 90) {
                grade = 'A';
            } else if (percentage >= 80) {
                grade = 'B';
            } else if (percentage >= 70) {
                grade = 'C';
            } else if (percentage >= 60) {
                grade = 'D';
            } else if (percentage >= 40) {
                grade = 'E';
            } else {
                grade = 'F';
            }
            
            String result = (percentage >= 40) ? "PASS" : "FAIL";
            
            // Display report card
            System.out.println("=== STUDENT REPORT CARD ===");
            System.out.println("Student Name: " + studentName);
            System.out.println("Subject-wise Marks:");
            
            for (int i = 0; i < 5; i++) {
                System.out.printf("%-20s: %6.2f%n", subjects[i], marks[i]);
            }
            
            System.out.println("---------------------------");
            System.out.printf("Total Marks: %6.2f/500%n", total);
            System.out.printf("Percentage: %7.2f%%%n", percentage);
            System.out.printf("Grade: %13c%n", grade);
            System.out.printf("Result: %12s%n", result);
            System.out.println("===========================");
            
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid numbers for marks");
        }
    }
}

// Solution for Exercise 4.2: Number System Converter
class NumberConverter {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java NumberConverter <number> <source_base> <target_base>");
            System.out.println("Supported bases: 2 (binary), 8 (octal), 10 (decimal), 16 (hexadecimal)");
            System.out.println("Example: java NumberConverter 255 10 16");
            return;
        }
        
        try {
            String number = args[0];
            int sourceBase = Integer.parseInt(args[1]);
            int targetBase = Integer.parseInt(args[2]);
            
            // Validate bases
            if (!isValidBase(sourceBase) || !isValidBase(targetBase)) {
                System.out.println("Error: Supported bases are 2, 8, 10, and 16");
                return;
            }
            
            // Convert source number to decimal first
            int decimalValue = Integer.parseInt(number, sourceBase);
            
            // Convert decimal to target base
            String result = Integer.toString(decimalValue, targetBase).toUpperCase();
            
            System.out.println("Number Conversion:");
            System.out.println("Source: " + number + " (base " + sourceBase + ")");
            System.out.println("Target: " + result + " (base " + targetBase + ")");
            System.out.println("Decimal equivalent: " + decimalValue);
            
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format for the specified base");
        }
    }
    
    private static boolean isValidBase(int base) {
        return base == 2 || base == 8 || base == 10 || base == 16;
    }
}

// Solution for Exercise 4.3: Text Statistics Analyzer
class TextAnalyzer {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java TextAnalyzer <word1> <word2> ... <wordN>");
            System.out.println("Example: java TextAnalyzer Hello world. This is Java programming.");
            return;
        }
        
        // Join all arguments to form the text
        String text = String.join(" ", args);
        
        int totalCharacters = text.length();
        int totalWords = args.length;
        int totalSentences = 0;
        int totalLetters = 0;
        
        // Count sentences (periods) and letters
        for (char c : text.toCharArray()) {
            if (c == '.') {
                totalSentences++;
            }
            if (Character.isLetter(c)) {
                totalLetters++;
            }
        }
        
        // Calculate average word length
        double averageWordLength = (double) totalLetters / totalWords;
        
        // Find most frequent character
        int[] charCount = new int[256];
        for (char c : text.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                charCount[c]++;
            }
        }
        
        char mostFrequentChar = 'a';
        int maxCount = 0;
        for (int i = 0; i < 256; i++) {
            if (charCount[i] > maxCount) {
                maxCount = charCount[i];
                mostFrequentChar = (char) i;
            }
        }
        
        // Display results
        System.out.println("=== Text Statistics ===");
        System.out.println("Text: " + text);
        System.out.println("Total Characters: " + totalCharacters);
        System.out.println("Total Words: " + totalWords);
        System.out.println("Total Sentences: " + totalSentences);
        System.out.println("Average Word Length: " + String.format("%.2f", averageWordLength));
        System.out.println("Most Frequent Character: '" + mostFrequentChar + "' (appears " + maxCount + " times)");
        System.out.println("======================");
    }
}
