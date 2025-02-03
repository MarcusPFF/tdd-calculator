package tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

        Calculator calculator = new Calculator();

        int result = calculator.subtract(5, 3);

        assertEquals(2, result);
    }

    @Test
    void testMultiplication() {

        Calculator calculator = new Calculator();

        int result = calculator.multiply(2, 3);

        assertEquals(6, result);
    }

    @Test
    void testDivision() {

        Calculator calculator = new Calculator();

        int result = calculator.divide(6, 3);

        assertEquals(2, result);
    }

    @Test
    void testDivisionByZero() {

        Calculator calculator = new Calculator();

        int result = calculator.divide(5, 0);

        assertEquals(0, result);
    }

    @Test
    void testDivideNull(){

        Calculator calculator = new Calculator();
        assertThrows(ArithmeticException.class,()->{
            calculator.divide(3,0);
        });

    }


    /* ------------ Calculator 2 ---------------- */
    @Test
    void testAddWithStringInput() {
        Calculator calculator = new Calculator();

        int result = calculator.add("1,2,3");

        assertEquals(6, result);
    }

    @Test
    void testAddWithEmptyString() {
        Calculator calculator = new Calculator();

        int result = calculator.add("");

        assertEquals(0, result);
    }

    @Test
    void testAddWithArrayInput() {
        Calculator calculator = new Calculator();

        int result = calculator.add(new int[]{1, 2, 3});

        assertEquals(6, result);
    }

    @Test
    void testAddWithEmptyArray() {
        Calculator calculator = new Calculator();

        int result = calculator.add(new int[]{});

        assertEquals(0, result);
    }
}