public class Factorial {
    public long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Error: Factorial isn't defined for negative numbers.");
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            long nextResult = result * i;
            if (nextResult / i != result) {
                throw new ArithmeticException("Error: Result exceeds long range.");
            }
            result = nextResult;
        }
        return result;
    }
}
