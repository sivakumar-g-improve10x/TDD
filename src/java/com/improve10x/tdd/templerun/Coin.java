package com.improve10x.tdd.templerun;

public class Coin extends Obstacle{
    public int value;

    public Coin(int value) {
        super("Coin",0);
        this.value = value;
    }
    public int getValue() {

        return value;
    }
}
