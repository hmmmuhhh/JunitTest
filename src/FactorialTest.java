import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {
    private final Factorial factorial = new Factorial();

    @Test
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
    public void testFactorialValid() {
        assertEquals(120, factorial.factorial(5));
    }

    @Test
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
    public void testFactorialLargeNumber() {
        assertThrows(ArithmeticException.class, () -> factorial.factorial(30));
    }
}
