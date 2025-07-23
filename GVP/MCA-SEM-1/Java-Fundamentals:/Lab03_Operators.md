# Lab Session 3: Operators in Java

## Learning Objectives
By the end of this lab, students will be able to:
1. Understand different types of operators in Java
2. Use arithmetic, relational, and logical operators
3. Apply assignment and unary operators
4. Understand operator precedence and associativity
5. Work with bitwise operators (basic understanding)

## Types of Operators

### 1. Arithmetic Operators
Used for mathematical calculations.

| Operator | Description | Example | Result |
|----------|-------------|---------|---------|
| `+` | Addition | `5 + 3` | `8` |
| `-` | Subtraction | `5 - 3` | `2` |
| `*` | Multiplication | `5 * 3` | `15` |
| `/` | Division | `10 / 3` | `3` (integer division) |
| `%` | Modulus (remainder) | `10 % 3` | `1` |

#### Important Notes:
- Integer division truncates decimal part
- Use `double` or `float` for decimal results
- Modulus operator gives remainder of division

### 2. Relational (Comparison) Operators
Used to compare two values. Return `boolean` result.

| Operator | Description | Example | Result |
|----------|-------------|---------|---------|
| `==` | Equal to | `5 == 5` | `true` |
| `!=` | Not equal to | `5 != 3` | `true` |
| `>` | Greater than | `5 > 3` | `true` |
| `<` | Less than | `5 < 3` | `false` |
| `>=` | Greater than or equal | `5 >= 5` | `true` |
| `<=` | Less than or equal | `5 <= 3` | `false` |

### 3. Logical Operators
Used to combine boolean expressions.

| Operator | Description | Example | Result |
|----------|-------------|---------|---------|
| `&&` | Logical AND | `true && false` | `false` |
| `\|\|` | Logical OR | `true \|\| false` | `true` |
| `!` | Logical NOT | `!true` | `false` |

#### Short-Circuit Evaluation:
- `&&`: If first operand is false, second is not evaluated
- `||`: If first operand is true, second is not evaluated

### 4. Assignment Operators
Used to assign values to variables.

| Operator | Description | Example | Equivalent |
|----------|-------------|---------|------------|
| `=` | Simple assignment | `x = 5` | `x = 5` |
| `+=` | Add and assign | `x += 3` | `x = x + 3` |
| `-=` | Subtract and assign | `x -= 3` | `x = x - 3` |
| `*=` | Multiply and assign | `x *= 3` | `x = x * 3` |
| `/=` | Divide and assign | `x /= 3` | `x = x / 3` |
| `%=` | Modulus and assign | `x %= 3` | `x = x % 3` |

### 5. Unary Operators
Operate on single operand.

| Operator | Description | Example | Result |
|----------|-------------|---------|---------|
| `+` | Unary plus | `+5` | `5` |
| `-` | Unary minus | `-5` | `-5` |
| `++` | Increment | `++x` or `x++` | Increases by 1 |
| `--` | Decrement | `--x` or `x--` | Decreases by 1 |
| `!` | Logical NOT | `!true` | `false` |

#### Pre vs Post Increment/Decrement:
```java
int x = 5;
int a = ++x;  // Pre-increment: x becomes 6, then a = 6
int b = x++;  // Post-increment: b = 6, then x becomes 7
```

### 6. Ternary Operator (Conditional)
Shorthand for if-else statement.

**Syntax**: `condition ? value_if_true : value_if_false`

```java
int age = 18;
String status = (age >= 18) ? "Adult" : "Minor";
```

## Operator Precedence (High to Low)
1. Postfix: `expr++`, `expr--`
2. Unary: `++expr`, `--expr`, `+expr`, `-expr`, `!`
3. Multiplicative: `*`, `/`, `%`
4. Additive: `+`, `-`
5. Relational: `<`, `>`, `<=`, `>=`
6. Equality: `==`, `!=`
7. Logical AND: `&&`
8. Logical OR: `||`
9. Ternary: `? :`
10. Assignment: `=`, `+=`, `-=`, etc.

## Best Practices
1. Use parentheses to make precedence clear
2. Avoid complex expressions with multiple operators
3. Be careful with increment/decrement operators
4. Use meaningful variable names
5. Consider readability over brevity

## Common Mistakes
1. **Assignment vs Equality**: Using `=` instead of `==` in conditions
2. **Integer Division**: Expecting decimal result from integer division
3. **Precedence Confusion**: Not understanding operator precedence
4. **Short-Circuit Logic**: Not understanding when expressions are evaluated
