
# TDD Calculator

This is a simple calculator program built using Java and Test-Driven Development (TDD). It uses JUNIT 5 to verify the results. Try it out!

## Features

- **Addition**: Supports adding two numbers, a string of numbers, and an array of numbers
- **Subtraction**: Subtracts one number from another.
- **Multiplication**: Multiplies two numbers.
- **Division**: Divides one number by another, with a check to prevent division by zero.

## Eksample Usage

```java
Calculator calculator = new Calculator();

// Add two numbers
int sum = calculator.add(2, 3);  // 5

// Add numbers from a string
int sumFromString = calculator.add("1,2,3");  // 6

// Add numbers from an array
int[] numbers = {1, 2, 3};
int sumFromArray = calculator.add(numbers);  // 6
