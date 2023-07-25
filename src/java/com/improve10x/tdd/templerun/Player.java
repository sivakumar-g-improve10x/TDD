package com.improve10x.tdd.templerun;

public class Player {
    private String name;
    public Player(String name) {
        this.name = name == null ? "" : name.trim();
    }

    public Player(String name, int health) {
        if (health<0||health>100) {
            throw new InvalidHealthException();
        }
    }

    public String getName() {
        return name;
    }

    public int getHealth() {

        return 100;
    }

    public class InvalidHealthException extends RuntimeException{

    }
}
