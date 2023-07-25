package com.improve10x.tdd.templerun;

public class Obstacle {
    protected String name;
    protected int damage;

    public Obstacle(String name, int damage) throws Obstacle.InvalidDamageException {
        this.name = name == null ? "" : name.trim();
        if (damage<0 || damage>100){
            throw new Obstacle.InvalidDamageException();
        }
        this.name = name;
        this.damage = damage;
    }
    public void collide(Character character) {
      System.out.println(name + "has collided with " + character.getName() + "and cause" + damage);
      character.reduceHealth(damage);
    }

    public class InvalidDamageException extends RuntimeException{
    }
}

