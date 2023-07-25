package com.improve10x.tdd.templerun;

public class SpikePit extends Obstacle{
    private int width;

    public SpikePit(int width) throws InvalidValueException {
        super("Spike Pit",0);
        this.width = width;
        throw new InvalidValueException();

    }
    public void trap(Character character) {
        System.out.println(name + "trapped" + character.getName() + "inside ! . it is" + width + "meter wide");
        character.reduceHealth(damage);
    }

    public class InvalidValueException extends Exception{

    }
}
