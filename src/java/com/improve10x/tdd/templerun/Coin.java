package com.improve10x.tdd.templerun;

public class Coin extends Obstacle{
    public int value;

    public Coin(int value) {
        super("Coin", 0);
        if (value < 0 || value > 100) {
            throw new InvalidValueException();
        }
            this.value = value;
        }

    public int getValue() {

        return value;
    }

    public class InvalidValueException extends RuntimeException{
    }
}
