import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    public void testAddPositive() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void testAddNegative() {
        assertEquals(-1, calculator.add(-2, 1));
    }

    @Test
    public void testSubtractPositive() {
        assertEquals(3, calculator.subtract(5, 2));
    }

    @Test
    public void testSubtractNegative() {
        assertEquals(-5, calculator.subtract(-3, 2));
    }

    @Test
    public void testMultiplyPositive() {
        assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    public void testMultiplyNegative() {
        assertEquals(-6, calculator.multiply(-2, 3));
    }

    @Test
    public void testDividePositive() {
        assertEquals(2, calculator.divide(6, 3));
    }

    @Test
    public void testDivideNegative() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(6, 0));
    }
}
