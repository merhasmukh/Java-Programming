# Lab 1 Exercises - Main Method Practice

## Exercise Set 1: Basic Main Method Programs

### Exercise 1.1: Personal Introduction
**Objective**: Create a Java program that displays your personal information.

**Instructions**:
1. Create a class named `PersonalInfo`
2. Write a main method that displays:
   - Your name
   - Your student ID
   - Your favorite programming language
   - Your career goal

**Expected Output**:
```
=== Personal Information ===
Name: [Your Name]
Student ID: [Your ID]
Favorite Language: Java
Career Goal: Software Developer
============================
```

### Exercise 1.2: Simple Math Operations
**Objective**: Practice variable declarations and basic arithmetic operations.

**Instructions**:
1. Create a class named `MathOperations`
2. In the main method:
   - Declare two integer variables with values 25 and 7
   - Calculate and display: addition, subtraction, multiplication, division, and modulus
   - Format the output neatly

**Expected Output**:
```
=== Math Operations ===
Number 1: 25
Number 2: 7
Addition: 25 + 7 = 32
Subtraction: 25 - 7 = 18
Multiplication: 25 * 7 = 175
Division: 25 / 7 = 3
Modulus: 25 % 7 = 4
=======================
```

### Exercise 1.3: Area Calculator
**Objective**: Create a program to calculate areas of different shapes.

**Instructions**:
1. Create a class named `AreaCalculator`
2. Calculate and display the area of:
   - Rectangle (length = 15, width = 10)
   - Circle (radius = 7, use π = 3.14159)
   - Triangle (base = 12, height = 8)

**Expected Output**:
```
=== Area Calculator ===
Rectangle (Length=15, Width=10): 150 sq units
Circle (Radius=7): 153.94 sq units
Triangle (Base=12, Height=8): 48.0 sq units
=======================
```

## Exercise Set 2: Command Line Arguments

### Exercise 2.1: Name Greeter
**Objective**: Create a program that greets users by name using command line arguments.

**Instructions**:
1. Create a class named `NameGreeter`
2. If a name is provided as argument, greet the user
3. If no argument is provided, ask for the name
4. Handle multiple names (greet each one)

**Test Cases**:
- `java NameGreeter John` → "Hello, John!"
- `java NameGreeter John Mary` → "Hello, John!" and "Hello, Mary!"
- `java NameGreeter` → "Please provide your name as an argument"

### Exercise 2.2: Grade Calculator
**Objective**: Calculate grade based on marks passed as command line argument.

**Instructions**:
1. Create a class named `GradeCalculator`
2. Accept marks as command line argument
3. Display grade based on:
   - 90-100: A+
   - 80-89: A
   - 70-79: B
   - 60-69: C
   - 50-59: D
   - Below 50: F

**Test Cases**:
- `java GradeCalculator 85` → "Marks: 85, Grade: A"
- `java GradeCalculator 45` → "Marks: 45, Grade: F"

### Exercise 2.3: Temperature Converter
**Objective**: Convert temperature between Celsius and Fahrenheit.

**Instructions**:
1. Create a class named `TempConverter`
2. Accept three arguments: temperature value, source unit (C/F), target unit (C/F)
3. Perform conversion and display result
4. Handle invalid inputs gracefully

**Example Usage**:
- `java TempConverter 100 C F` → "100°C = 212°F"
- `java TempConverter 32 F C` → "32°F = 0°C"

**Formulas**:
- Celsius to Fahrenheit: F = (C × 9/5) + 32
- Fahrenheit to Celsius: C = (F - 32) × 5/9

## Exercise Set 3: Advanced Challenges

### Exercise 3.1: Number Pattern Generator
**Objective**: Generate number patterns based on command line input.

**Instructions**:
1. Create a class named `PatternGenerator`
2. Accept a number as argument
3. Generate patterns like:
```
For input 5:
1
12
123
1234
12345
```

### Exercise 3.2: Simple Interest Calculator
**Objective**: Calculate simple interest with error handling.

**Instructions**:
1. Create a class named `InterestCalculator`
2. Accept principal, rate, and time as command line arguments
3. Calculate and display simple interest
4. Validate inputs (positive numbers only)
5. Formula: SI = (P × R × T) / 100

**Expected Output**:
```
=== Simple Interest Calculator ===
Principal Amount: ₹10000
Rate of Interest: 5%
Time Period: 2 years
Simple Interest: ₹1000.00
Total Amount: ₹11000.00
==================================
```

### Exercise 3.3: Word Counter
**Objective**: Count words in a sentence passed as command line arguments.

**Instructions**:
1. Create a class named `WordCounter`
2. Accept a sentence as multiple command line arguments
3. Count and display:
   - Total number of words
   - Number of characters (excluding spaces)
   - Longest word
   - Shortest word

**Example**:
- `java WordCounter Hello World Java Programming`
- Output: Total words: 4, Characters: 23, Longest: Programming, Shortest: Java

## Exercise Set 4: Creative Projects

### Exercise 4.1: Student Report Card
**Objective**: Create a comprehensive student report card system.

**Instructions**:
1. Create a class named `ReportCard`
2. Accept student name and 5 subject marks as command line arguments
3. Calculate and display:
   - Total marks
   - Percentage
   - Grade (A+/A/B/C/D/F)
   - Result (Pass/Fail)
   - Subject-wise performance

### Exercise 4.2: Number System Converter
**Objective**: Convert numbers between different number systems.

**Instructions**:
1. Create a class named `NumberConverter`
2. Accept number, source base, and target base as arguments
3. Support conversion between:
   - Decimal (base 10)
   - Binary (base 2)
   - Octal (base 8)
   - Hexadecimal (base 16)

### Exercise 4.3: Text Statistics Analyzer
**Objective**: Analyze text statistics from command line input.

**Instructions**:
1. Create a class named `TextAnalyzer`
2. Accept text as command line arguments
3. Calculate and display:
   - Total characters
   - Total words
   - Total sentences (count periods)
   - Average word length
   - Most frequent character

## Submission Guidelines

### File Naming Convention
- Use exact class names mentioned in exercises
- Save each class in a separate `.java` file
- Example: `PersonalInfo.java`, `MathOperations.java`

### Code Requirements
1. **Comments**: Add meaningful comments explaining your logic
2. **Error Handling**: Include basic error handling for invalid inputs
3. **Output Format**: Follow the expected output format closely
4. **Variable Names**: Use descriptive variable names

### Testing Instructions
1. **Compile**: `javac ClassName.java`
2. **Run**: `java ClassName [arguments if needed]`
3. **Test Cases**: Try different inputs including edge cases
4. **Documentation**: Document any assumptions made

## Evaluation Criteria

| Criteria | Weight | Description |
|----------|---------|-------------|
| **Correctness** | 40% | Program works as expected with correct output |
| **Code Quality** | 25% | Clean, readable code with proper indentation |
| **Error Handling** | 20% | Handles invalid inputs gracefully |
| **Documentation** | 15% | Proper comments and code documentation |

## Tips for Success

### Before You Start
1. **Read carefully**: Understand the problem statement completely
2. **Plan first**: Think about the logic before coding
3. **Start simple**: Begin with basic functionality, then add features

### While Coding
1. **Test frequently**: Compile and test after each major change
2. **Use meaningful names**: Choose descriptive variable and method names
3. **Add comments**: Explain complex logic with comments
4. **Handle errors**: Check for invalid inputs and edge cases

### After Completion
1. **Test thoroughly**: Try different inputs including boundary cases
2. **Review code**: Check for any improvements or optimizations
3. **Verify output**: Ensure output matches expected format
4. **Clean up**: Remove any debug statements or unnecessary code

## Common Mistakes to Avoid

### Compilation Errors
1. **Class name mismatch**: Ensure class name matches filename exactly
2. **Missing semicolons**: Check for proper statement termination
3. **Incorrect syntax**: Follow Java syntax rules strictly

### Runtime Errors
1. **Array bounds**: Check `args.length` before accessing array elements
2. **Number format**: Use try-catch when parsing strings to numbers
3. **Division by zero**: Check denominator before division operations

### Logic Errors
1. **Off-by-one errors**: Be careful with loop boundaries and array indices
2. **Wrong operators**: Use `==` for comparison, not `=`
3. **Type mismatches**: Ensure compatible data types in operations

## Additional Resources

### Documentation
- [Oracle Java Documentation](https://docs.oracle.com/javase/)
- [Java Tutorials - Getting Started](https://docs.oracle.com/javase/tutorial/getStarted/)

### Practice Platforms
- [HackerRank Java Domain](https://www.hackerrank.com/domains/java)
- [Codingbat Java](https://codingbat.com/java)
- [LeetCode Easy Problems](https://leetcode.com/problemset/all/?difficulty=Easy)

### Help and Support
- Ask questions during lab sessions
- Form study groups with classmates
- Use online Java communities for additional help
- Refer to course materials and examples

---
**Remember**: The goal is to learn and understand Java programming concepts. Focus on understanding the logic rather than just getting the right output. Good luck with your exercises!
