# Lab Session 2: Data Types and Variables

## Learning Objectives
By the end of this lab, students will be able to:
1. Understand different data types in Java
2. Declare and initialize variables
3. Understand variable scope and naming conventions
4. Work with constants using `final` keyword
5. Perform type casting and conversion

## Theory: Java Data Types

### Primitive Data Types

#### 1. Integer Types
```java
byte    // 8-bit, range: -128 to 127
short   // 16-bit, range: -32,768 to 32,767
int     // 32-bit, range: -2,147,483,648 to 2,147,483,647
long    // 64-bit, range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
```

#### 2. Floating Point Types
```java
float   // 32-bit, single precision
double  // 64-bit, double precision (default for decimal numbers)
```

#### 3. Character Type
```java
char    // 16-bit Unicode character
```

#### 4. Boolean Type
```java
boolean // true or false
```

### Non-Primitive Data Types
- **String**: Sequence of characters
- **Arrays**: Collection of similar data types
- **Classes**: User-defined data types
- **Interfaces**: Contract for classes

## Variable Declaration and Initialization

### Syntax
```java
dataType variableName;              // Declaration
dataType variableName = value;      // Declaration with initialization
```

### Examples
```java
// Integer variables
int age = 25;
long population = 1000000L;        // L suffix for long

// Floating point variables
float price = 99.99f;              // f suffix for float
double salary = 50000.50;

// Character and String
char grade = 'A';
String name = "John Doe";

// Boolean
boolean isStudent = true;
```

## Variable Naming Conventions

### Rules (Must Follow)
1. Must start with letter, underscore (_), or dollar sign ($)
2. Cannot start with a digit
3. Cannot use Java keywords
4. Case-sensitive

### Conventions (Best Practices)
1. Use camelCase for variable names
2. Use meaningful names
3. Constants in UPPER_CASE with underscores
4. Class names start with uppercase

### Examples
```java
// Good naming
int studentAge;
String firstName;
final double PI = 3.14159;

// Poor naming
int a;
String s1;
double x;
```

## Constants
```java
final int MAX_STUDENTS = 50;
final double PI = 3.14159;
final String COLLEGE_NAME = "GVP College";
```

## Type Casting

### Implicit Casting (Widening)
```java
int num = 100;
long bigNum = num;      // int to long
double decimal = bigNum; // long to double
```

### Explicit Casting (Narrowing)
```java
double decimal = 99.99;
int whole = (int) decimal;  // 99 (loses decimal part)

long bigNum = 1000L;
int smallNum = (int) bigNum;
```

## Common Mistakes to Avoid
1. **Uninitialized variables**: Always initialize before use
2. **Integer overflow**: Be aware of data type limits
3. **Precision loss**: When casting from larger to smaller types
4. **Case sensitivity**: `age` and `Age` are different variables
