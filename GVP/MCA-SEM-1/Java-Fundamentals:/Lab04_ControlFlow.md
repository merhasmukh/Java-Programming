# Lab Session 4: Control Flow Statements

## Learning Objectives
By the end of this lab, students will be able to:
1. Use conditional statements (if, if-else, switch)
2. Implement various types of loops (for, while, do-while)
3. Control loop execution with break and continue
4. Apply nested control structures
5. Solve problems using appropriate control flow

## Conditional Statements

### 1. if Statement
Executes code block if condition is true.

**Syntax:**
```java
if (condition) {
    // code to execute if condition is true
}
```

**Example:**
```java
int age = 18;
if (age >= 18) {
    System.out.println("You are eligible to vote");
}
```

### 2. if-else Statement
Executes one block if condition is true, another if false.

**Syntax:**
```java
if (condition) {
    // code if condition is true
} else {
    // code if condition is false
}
```

**Example:**
```java
int marks = 75;
if (marks >= 60) {
    System.out.println("Pass");
} else {
    System.out.println("Fail");
}
```

### 3. if-else if-else Statement
Multiple conditions with multiple outcomes.

**Syntax:**
```java
if (condition1) {
    // code for condition1
} else if (condition2) {
    // code for condition2
} else if (condition3) {
    // code for condition3
} else {
    // default code
}
```

### 4. switch Statement
Multiple-choice selection based on variable value.

**Syntax:**
```java
switch (variable) {
    case value1:
        // code for value1
        break;
    case value2:
        // code for value2
        break;
    default:
        // default code
        break;
}
```

**Important Notes:**
- `break` prevents fall-through to next case
- `default` is optional but recommended
- Works with int, char, String, and enum types

## Loop Statements

### 1. for Loop
Used when number of iterations is known.

**Syntax:**
```java
for (initialization; condition; increment/decrement) {
    // loop body
}
```

**Example:**
```java
for (int i = 1; i <= 5; i++) {
    System.out.println("Count: " + i);
}
```

### 2. while Loop
Executes while condition is true. Condition checked before execution.

**Syntax:**
```java
while (condition) {
    // loop body
    // update statement
}
```

**Example:**
```java
int i = 1;
while (i <= 5) {
    System.out.println("Count: " + i);
    i++;
}
```

### 3. do-while Loop
Executes at least once, then checks condition.

**Syntax:**
```java
do {
    // loop body
    // update statement
} while (condition);
```

**Example:**
```java
int i = 1;
do {
    System.out.println("Count: " + i);
    i++;
} while (i <= 5);
```

## Loop Control Statements

### 1. break Statement
- Exits the loop immediately
- Control transfers to statement after loop
- Can be used in loops and switch statements

### 2. continue Statement
- Skips current iteration
- Continues with next iteration
- Only used in loops

## Nested Control Structures

### Nested if Statements
```java
if (condition1) {
    if (condition2) {
        // code when both conditions are true
    }
}
```

### Nested Loops
```java
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 3; j++) {
        System.out.println("i=" + i + ", j=" + j);
    }
}
```

## Best Practices

1. **Use appropriate loop type:**
   - `for`: When iterations are known
   - `while`: When condition-based
   - `do-while`: When at least one execution needed

2. **Avoid infinite loops:**
   - Always ensure loop condition can become false
   - Update loop variables properly

3. **Use meaningful variable names:**
   - `i`, `j`, `k` for simple counters
   - Descriptive names for complex logic

4. **Proper indentation:**
   - Makes code readable
   - Shows structure clearly

5. **Use break and continue judiciously:**
   - Can make code harder to follow
   - Consider restructuring logic instead

## Common Patterns

### 1. Input Validation
```java
Scanner scanner = new Scanner(System.in);
int number;
do {
    System.out.print("Enter a positive number: ");
    number = scanner.nextInt();
} while (number <= 0);
```

### 2. Menu-Driven Programs
```java
int choice;
do {
    System.out.println("1. Option 1");
    System.out.println("2. Option 2");
    System.out.println("0. Exit");
    choice = scanner.nextInt();
    
    switch (choice) {
        case 1: /* handle option 1 */ break;
        case 2: /* handle option 2 */ break;
        case 0: System.out.println("Goodbye!"); break;
        default: System.out.println("Invalid choice");
    }
} while (choice != 0);
```

### 3. Finding Maximum/Minimum
```java
int max = array[0];
for (int i = 1; i < array.length; i++) {
    if (array[i] > max) {
        max = array[i];
    }
}
```

## Common Mistakes

1. **Missing break in switch:** Causes fall-through
2. **Off-by-one errors:** Wrong loop boundaries
3. **Infinite loops:** Condition never becomes false
4. **Wrong loop choice:** Using for when while is better
5. **Nested complexity:** Too many nested levels
