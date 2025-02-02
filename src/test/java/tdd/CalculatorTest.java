package tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testAddition() {
        // Arrange
        Calculator calculator = new Calculator();

        // Act
        int result = calculator.add(2, 3);

        // Assert
        assertEquals(5, result);
    }

    @Test
    void testSubtraction() {
        // Arrange
        Calculator calculator = new Calculator();

        // Act
        int result = calculator.subtract(5, 3);

        // Assert
        assertEquals(2, result);
    }

    @Test
    void testMultiplication() {
        // Arrange
        Calculator calculator = new Calculator();

        // Act
        int result = calculator.multiply(2, 3);

        // Assert
        assertEquals(6, result);
    }

    @Test
    void testDivision() {
        // Arrange
        Calculator calculator = new Calculator();

        // Act
        int result = calculator.divide(6, 3);

        // Assert
        assertEquals(2, result);
    }

    @Test
    void testDivisionByZero() {
        // Arrange
        Calculator calculator = new Calculator();

        // Act & Assert
        assertThrows(ArithmeticException.class, () -> calculator.divide(5, 0));
    }
}