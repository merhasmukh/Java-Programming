# Lab Session 1: Java Main Method

## Learning Objectives
By the end of this lab, students will be able to:
1. Understand the structure and syntax of the main method
2. Explain each component of the main method signature
3. Write and execute basic Java programs using the main method
4. Handle command-line arguments

## Theory

### What is the Main Method?
The `main` method is the entry point of any Java application. When you run a Java program, the JVM (Java Virtual Machine) looks for the main method to start program execution.

### Main Method Signature
```java
public static void main(String[] args)
```

Let's break down each component:

#### 1. `public`
- **Access Modifier**: Makes the method accessible from anywhere
- **Why public?**: The JVM needs to access this method from outside the class to start execution

#### 2. `static`
- **Static Modifier**: Method belongs to the class, not to any instance
- **Why static?**: JVM can call this method without creating an object of the class

#### 3. `void`
- **Return Type**: The method doesn't return any value
- **Why void?**: The main method is the starting point, it doesn't need to return anything to the caller

#### 4. `main`
- **Method Name**: Fixed name that JVM looks for
- **Case Sensitive**: Must be exactly "main" (lowercase)

#### 5. `String[] args`
- **Parameter**: Array of String objects
- **Purpose**: Receives command-line arguments passed to the program
- **Alternative forms**: `String args[]` or `String... args`

## Key Points to Remember
1. There must be exactly one main method per executable class
2. The main method signature must be exact - any deviation will cause runtime error
3. The parameter name `args` can be changed, but the type must be `String[]`
4. The main method is where program execution begins and typically ends

## Command Line Arguments
- Arguments passed when running the program: `java ClassName arg1 arg2 arg3`
- Accessed through the `args` array: `args[0]`, `args[1]`, `args[2]`
- `args.length` gives the number of arguments
- Always check array bounds before accessing elements

### Example:
```java
public class ArgumentDemo {
    public static void main(String[] args) {
        System.out.println("Number of arguments: " + args.length);
        
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + i + ": " + args[i]);
        }
    }
}
```

## Common Mistakes to Avoid
1. **Missing public**: `static void main(String[] args)` - Won't be accessible to JVM
2. **Missing static**: `public void main(String[] args)` - JVM can't call without object
3. **Wrong return type**: `public static int main(String[] args)` - JVM expects void
4. **Wrong parameter**: `public static void main(int[] args)` - JVM passes String array
5. **Case sensitivity**: `public static void Main(String[] args)` - JVM looks for "main"
