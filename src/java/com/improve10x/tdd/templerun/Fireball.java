package com.improve10x.tdd.templerun;

public class Fireball extends Obstacle{
    public int speed;
    public Fireball(int speed) {
        super("moving Fireball",30);
        this.speed = speed;
    }
    public void roll() {
        System.out.println("The" + name + "is rolling with speed of " + speed + "mph.");
    }
}
