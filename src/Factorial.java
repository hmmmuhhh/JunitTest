public class Factorial {
    public long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            long nextResult = result * i;
            if (nextResult / i != result) { // Overflow check
                throw new ArithmeticException("Factorial result exceeds the range of long.");
            }
            result = nextResult;
        }
        return result;
    }
}
