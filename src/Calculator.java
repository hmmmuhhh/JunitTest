public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        long result = (long) a * b;
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            throw new ArithmeticException("Error: Result exceeds int range.");
        }
        return (int) result;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Error: Cannot divide by zero.");
        }
        return a / b;
    }
}
