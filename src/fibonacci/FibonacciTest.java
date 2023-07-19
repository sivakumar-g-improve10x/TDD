package fibonacci;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest {
    Fibonacci fibonacci;

    @BeforeEach
    public void setup(){
        fibonacci = new Fibonacci();
    }
    @Test
    public void nothing(){

    }
    @Test
    public void givenAnyNegativeInteger_returnNegativeOne() {
        int negativeFibonacci = fibonacci.findFibonacci(-15);
        assertEquals(-1,negativeFibonacci);
        }
    @Test
    public void givenZero_returnNegativeOne() {
        int negativeFibonacci = fibonacci.findFibonacci(0);
        assertEquals(-1,negativeFibonacci);
    }
    @Test
    public void givenOne_returnZero() {
        int firstFibonacci = fibonacci.findFibonacci(1);
        assertEquals(0,firstFibonacci);
    }
    @Test
    public void givenTwo_returnOne() {
        int secondFibonacci = fibonacci.findFibonacci(2);
        assertEquals(1,secondFibonacci);
    }
    @Test
    public void givenThree_returnOne() {
        int thirdFibonacci = fibonacci.findFibonacci(3);
        assertEquals(1,thirdFibonacci);
    }
    @Test
    public void givenFour_returnTwo() {
        int thirdFibonacci = fibonacci.findFibonacci(4);
        assertEquals(2,thirdFibonacci);
    }
    @Test
    public void givenFive_returnTwo() {
        int thirdFibonacci = fibonacci.findFibonacci(5);
        assertEquals(3,thirdFibonacci);
    }
    }

