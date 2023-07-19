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
    @Test
    public void givenZero_returnNegativeOne() {
        Fibonacci fibonacci = new Fibonacci();
        int negativeFibonacci = fibonacci.findFibonacci(0);
        assertEquals(-1,negativeFibonacci);
    }
    @Test
    public void givenOne_returnZero() {
        Fibonacci fibonacci = new Fibonacci();
        int firstFibonacci = fibonacci.findFibonacci(1);
        assertEquals(0,firstFibonacci);
    }
    @Test
    public void givenTwo_returnOne() {
        Fibonacci fibonacci = new Fibonacci();
        int secondFibonacci = fibonacci.findFibonacci(2);
        assertEquals(1,secondFibonacci);
    }
    }

