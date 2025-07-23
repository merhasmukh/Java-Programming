/**
 * Lab Session 3: Operators in Java - Examples
 * Course: MCA-SEM-3 Java Fundamentals
 * 
 * This file demonstrates various operators in Java
 */

// Example 1: Arithmetic Operators
class ArithmeticOperatorsDemo {
    public static void main(String[] args) {
        int a = 15;
        int b = 4;
        
        System.out.println("=== Arithmetic Operators ===");
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Addition (a + b): " + (a + b));
        System.out.println("Subtraction (a - b): " + (a - b));
        System.out.println("Multiplication (a * b): " + (a * b));
        System.out.println("Division (a / b): " + (a / b));           // Integer division
        System.out.println("Modulus (a % b): " + (a % b));
        
        // Floating point division
        double result = (double) a / b;
        System.out.println("Floating division: " + result);
        System.out.println("============================");
    }
}

// Example 2: Relational Operators
class RelationalOperatorsDemo {
    public static void main(String[] args) {
        int score1 = 85;
        int score2 = 78;
        
        System.out.println("=== Relational Operators ===");
        System.out.println("Score 1: " + score1 + ", Score 2: " + score2);
        System.out.println("score1 == score2: " + (score1 == score2));
        System.out.println("score1 != score2: " + (score1 != score2));
        System.out.println("score1 > score2: " + (score1 > score2));
        System.out.println("score1 < score2: " + (score1 < score2));
        System.out.println("score1 >= score2: " + (score1 >= score2));
        System.out.println("score1 <= score2: " + (score1 <= score2));
        System.out.println("=============================");
    }
}

// Example 3: Logical Operators
class LogicalOperatorsDemo {
    public static void main(String[] args) {
        boolean isStudent = true;
        boolean hasValidID = false;
        int age = 20;
        
        System.out.println("=== Logical Operators ===");
        System.out.println("isStudent: " + isStudent);
        System.out.println("hasValidID: " + hasValidID);
        System.out.println("age: " + age);
        
        // Logical AND
        boolean canEnterLibrary = isStudent && hasValidID;
        System.out.println("Can enter library (isStudent && hasValidID): " + canEnterLibrary);
        
        // Logical OR
        boolean canGetDiscount = isStudent || (age < 18);
        System.out.println("Can get discount (isStudent || age < 18): " + canGetDiscount);
        
        // Logical NOT
        boolean isNotStudent = !isStudent;
        System.out.println("Is not student (!isStudent): " + isNotStudent);
        
        // Complex logical expression
        boolean eligibleForScholarship = isStudent && (age >= 18) && !hasValidID;
        System.out.println("Eligible for scholarship: " + eligibleForScholarship);
        System.out.println("==========================");
    }
}

// Example 4: Assignment Operators
class AssignmentOperatorsDemo {
    public static void main(String[] args) {
        int x = 10;
        
        System.out.println("=== Assignment Operators ===");
        System.out.println("Initial value of x: " + x);
        
        x += 5;  // x = x + 5
        System.out.println("After x += 5: " + x);
        
        x -= 3;  // x = x - 3
        System.out.println("After x -= 3: " + x);
        
        x *= 2;  // x = x * 2
        System.out.println("After x *= 2: " + x);
        
        x /= 4;  // x = x / 4
        System.out.println("After x /= 4: " + x);
        
        x %= 3;  // x = x % 3
        System.out.println("After x %= 3: " + x);
        System.out.println("=============================");
    }
}

// Example 5: Unary Operators
class UnaryOperatorsDemo {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        
        System.out.println("=== Unary Operators ===");
        System.out.println("Initial: a = " + a + ", b = " + b);
        
        // Pre-increment and post-increment
        System.out.println("Pre-increment ++a: " + (++a));   // a becomes 6, then prints 6
        System.out.println("Value of a after pre-increment: " + a);
        
        System.out.println("Post-increment b++: " + (b++));  // prints 5, then b becomes 6
        System.out.println("Value of b after post-increment: " + b);
        
        // Pre-decrement and post-decrement
        System.out.println("Pre-decrement --a: " + (--a));   // a becomes 5, then prints 5
        System.out.println("Post-decrement b--: " + (b--));  // prints 6, then b becomes 5
        
        System.out.println("Final: a = " + a + ", b = " + b);
        
        // Unary plus and minus
        int positive = +10;
        int negative = -positive;
        System.out.println("Unary plus: " + positive);
        System.out.println("Unary minus: " + negative);
        System.out.println("=======================");
    }
}

// Example 6: Ternary Operator
class TernaryOperatorDemo {
    public static void main(String[] args) {
        int marks = 75;
        int age = 17;
        
        System.out.println("=== Ternary Operator ===");
        
        // Simple ternary operator
        String result = (marks >= 60) ? "Pass" : "Fail";
        System.out.println("Marks: " + marks + ", Result: " + result);
        
        // Nested ternary operator
        String grade = (marks >= 90) ? "A" : 
                      (marks >= 80) ? "B" : 
                      (marks >= 70) ? "C" : 
                      (marks >= 60) ? "D" : "F";
        System.out.println("Grade: " + grade);
        
        // Ternary with different data types
        String ageCategory = (age >= 18) ? "Adult" : "Minor";
        System.out.println("Age: " + age + ", Category: " + ageCategory);
        
        // Using ternary in method calls
        int maxValue = (10 > 5) ? 10 : 5;
        System.out.println("Maximum value: " + maxValue);
        System.out.println("========================");
    }
}

// Example 7: Operator Precedence
class OperatorPrecedenceDemo {
    public static void main(String[] args) {
        System.out.println("=== Operator Precedence ===");
        
        int a = 10, b = 5, c = 2;
        
        // Without parentheses - follows precedence rules
        int result1 = a + b * c;  // Multiplication first: 5 * 2 = 10, then 10 + 10 = 20
        System.out.println("a + b * c = " + result1);
        
        // With parentheses - changes precedence
        int result2 = (a + b) * c;  // Addition first: 10 + 5 = 15, then 15 * 2 = 30
        System.out.println("(a + b) * c = " + result2);
        
        // Complex expression
        boolean condition = a > b && b > c || a == 10;
        System.out.println("a > b && b > c || a == 10 = " + condition);
        
        // Same expression with parentheses for clarity
        boolean clarifiedCondition = ((a > b) && (b > c)) || (a == 10);
        System.out.println("((a > b) && (b > c)) || (a == 10) = " + clarifiedCondition);
        System.out.println("============================");
    }
}

// Example 8: Practical Calculator
class SimpleCalculator {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java SimpleCalculator <num1> <operator> <num2>");
            System.out.println("Operators: +, -, *, /, %");
            return;
        }
        
        try {
            double num1 = Double.parseDouble(args[0]);
            String operator = args[1];
            double num2 = Double.parseDouble(args[2]);
            double result = 0;
            boolean validOperation = true;
            
            // Use operators based on input
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
                        validOperation = false;
                    }
                    break;
                case "%":
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
                System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
            }
            
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid numbers!");
        }
    }
}

// Example 9: Grade Calculator using Multiple Operators
class GradeCalculator {
    public static void main(String[] args) {
        // Student marks in different subjects
        int math = 85;
        int physics = 78;
        int chemistry = 92;
        int english = 88;
        int computer = 95;
        
        // Calculate total and average using arithmetic operators
        int total = math + physics + chemistry + english + computer;
        double average = (double) total / 5;
        
        System.out.println("=== Grade Calculator ===");
        System.out.println("Math: " + math);
        System.out.println("Physics: " + physics);
        System.out.println("Chemistry: " + chemistry);
        System.out.println("English: " + english);
        System.out.println("Computer: " + computer);
        System.out.println("Total: " + total);
        System.out.println("Average: " + String.format("%.2f", average));
        
        // Determine grade using relational and ternary operators
        String grade = (average >= 90) ? "A+" :
                      (average >= 80) ? "A" :
                      (average >= 70) ? "B" :
                      (average >= 60) ? "C" :
                      (average >= 50) ? "D" : "F";
        
        // Determine pass/fail using logical operators
        boolean isPassed = (average >= 50) && (math >= 40) && (physics >= 40) && 
                          (chemistry >= 40) && (english >= 40) && (computer >= 40);
        
        System.out.println("Grade: " + grade);
        System.out.println("Result: " + (isPassed ? "PASSED" : "FAILED"));
        System.out.println("========================");
    }
}
