package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCalculator {

    private final Calculator calc = new Calculator();


    @Test
    void testAdd() {
        assertEquals(5.0, calc.sum(2.0, 3.0));
    }

    @Test
    void testDiff() {
        assertEquals(1.0, calc.diff(3.0, 2.0));
    }

    @Test
    void testMultiply() {
        assertEquals(6.0, calc.multiply(2.0, 3.0));
    }

    @Test
    void testDivide() {
        assertEquals(2.0, calc.divide(6.0, 3.0));
    }


    @Test
    void testDivideByZero() {

        assertThrows(ArithmeticException.class, () -> calc.divide(10.0, 0.0));
    }


    @Test
    void testNegativeNumbers() {
        assertEquals(-5.0, calc.sum(-2.0, -3.0));
    }

    @Test
    void testMultiplyZero() {
        assertEquals(0.0, calc.multiply(15.0, 0.0));
    }
    @Test
    void testSumFraction() {
        assertEquals(7.5, calc.sum(3.0, 4.5));
    }

    @Test
    void testSubtractNegative() {
        assertEquals(-7.0, calc.diff(3.0, 10.0));
    }
    @Test //Деление 0 на число
    void testZeroDevide() {
        assertEquals(0.0, calc.divide(0.0, 10.0));
    }

    @Test
    void testDivideFraction() {
        assertEquals(0.5, calc.divide(1.0, 2.0));
    }
}
