package com.improve10x.tdd.templerun;

public class SpikePit extends Obstacle{
    private int width;

    public SpikePit(int width) {
        super("Spike Pit",50);
        this.width = width;
    }
    public void trap(Character character) {
        System.out.println(name + "trapped" + character.getName() + "inside ! . it is" + width + "meter wide");
        character.reduceHealth(damage);
    }
}
