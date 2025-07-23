# Lab Session 5: Basic Input/Output in Java

## Learning Objectives
By the end of this lab, students will be able to:
1. Use System.out for various output operations
2. Use Scanner class for user input
3. Format output using printf and String.format
4. Handle basic input validation
5. Create interactive console programs

## Output Operations

### 1. System.out.println()
Prints text and moves to next line.

```java
System.out.println("Hello, World!");
System.out.println("This is on a new line");
```

### 2. System.out.print()
Prints text without moving to next line.

```java
System.out.print("Hello, ");
System.out.print("World!");
// Output: Hello, World!
```

### 3. System.out.printf()
Formatted output similar to C's printf.

```java
String name = "John";
int age = 25;
double salary = 50000.50;

System.out.printf("Name: %s, Age: %d, Salary: %.2f%n", name, age, salary);
```

#### Common Format Specifiers:
- `%s` - String
- `%d` - Integer
- `%f` - Float/Double
- `%.2f` - Float with 2 decimal places
- `%c` - Character
- `%b` - Boolean
- `%n` - New line (platform independent)

## Input Operations

### 1. Scanner Class
Primary class for reading user input.

```java
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);
```

### 2. Reading Different Data Types

```java
// Reading String
System.out.print("Enter your name: ");
String name = scanner.nextLine();

// Reading integers
System.out.print("Enter your age: ");
int age = scanner.nextInt();

// Reading floating point numbers
System.out.print("Enter your salary: ");
double salary = scanner.nextDouble();

// Reading single character
System.out.print("Enter grade: ");
char grade = scanner.next().charAt(0);

// Reading boolean
System.out.print("Are you a student (true/false): ");
boolean isStudent = scanner.nextBoolean();
```

### 3. Important Scanner Methods

| Method | Description | Example |
|--------|-------------|---------|
| `nextLine()` | Reads entire line including spaces | `"John Doe"` |
| `next()` | Reads single word (until space) | `"John"` |
| `nextInt()` | Reads integer | `25` |
| `nextDouble()` | Reads double | `99.99` |
| `nextFloat()` | Reads float | `99.99f` |
| `nextBoolean()` | Reads boolean | `true/false` |
| `hasNext()` | Checks if input available | `true/false` |
| `hasNextInt()` | Checks if next input is integer | `true/false` |

## Input Validation

### 1. Basic Validation
```java
Scanner scanner = new Scanner(System.in);

System.out.print("Enter a positive number: ");
while (!scanner.hasNextInt()) {
    System.out.print("Invalid input! Enter a positive number: ");
    scanner.next(); // Clear invalid input
}
int number = scanner.nextInt();

if (number <= 0) {
    System.out.println("Number must be positive!");
}
```

### 2. Try-Catch for Input Validation
```java
import java.util.InputMismatchException;

try {
    System.out.print("Enter an integer: ");
    int number = scanner.nextInt();
    System.out.println("You entered: " + number);
} catch (InputMismatchException e) {
    System.out.println("Invalid input! Please enter an integer.");
    scanner.next(); // Clear invalid input
}
```

## Common Issues and Solutions

### 1. Scanner Buffer Problem
When mixing `nextInt()` with `nextLine()`:

```java
// Problem
int age = scanner.nextInt();
String name = scanner.nextLine(); // This will be empty!

// Solution
int age = scanner.nextInt();
scanner.nextLine(); // Consume the newline
String name = scanner.nextLine();
```

### 2. Resource Management
Always close Scanner when done:

```java
Scanner scanner = new Scanner(System.in);
// ... use scanner
scanner.close();
```

## String Formatting

### 1. String.format()
```java
String name = "Alice";
int marks = 85;
String formatted = String.format("Student %s scored %d marks", name, marks);
System.out.println(formatted);
```

### 2. StringBuilder for Multiple Concatenations
```java
StringBuilder sb = new StringBuilder();
sb.append("Name: ").append(name);
sb.append(", Age: ").append(age);
String result = sb.toString();
```

## Best Practices

1. **Always validate input** - Check for correct data types and ranges
2. **Handle exceptions** - Use try-catch for robust input handling
3. **Clear prompts** - Tell users exactly what input is expected
4. **Close resources** - Close Scanner when finished
5. **Use appropriate methods** - Choose right Scanner method for data type
6. **Format output nicely** - Use printf or String.format for better presentation

## Interactive Program Pattern

```java
import java.util.Scanner;

public class InteractiveProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Get user input
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            
            // Process and display
            System.out.printf("Hello %s, you are %d years old.%n", name, age);
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
```
