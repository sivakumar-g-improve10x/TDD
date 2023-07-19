package fibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest {
    @Test
    public void nothing(){

    }
    @Test
    public void givenAnyNegativeInteger_returnNegativeOne() {
        Fibonacci fibonacci = new Fibonacci();
        int negativeFibonacci = fibonacci.findFibonacci(-5);
        assertEquals(-1,negativeFibonacci);
        }
    }

