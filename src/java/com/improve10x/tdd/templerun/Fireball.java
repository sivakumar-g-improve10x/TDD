package com.improve10x.tdd.templerun;

public class Fireball extends Obstacle{
    public int speed;
    public Fireball(int speed) {
        super("moving Fireball",0);
        if (speed<0||speed>100){
            throw new InvalidValueException();
        }
        this.speed = speed;
    }
    public void roll() {
        System.out.println("The" + name + "is rolling with speed of " + speed + "mph.");
    }

    public int getValue() {

        return speed;
    }

    public class InvalidValueException extends RuntimeException{

    }
}
