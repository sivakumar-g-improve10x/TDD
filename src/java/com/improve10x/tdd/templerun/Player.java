package com.improve10x.tdd.templerun;

public class Player {
    private String name;
    private int health;
    private int score;
    public Player(String name) {
        this.name = name == null ? "" : name.trim();
        this.health = 100;
        this.score = 0;
    }

    public Player(String name, int health) {
        if (health<0||health>100) {
            throw new InvalidHealthException();
        }else {
            this.health = health;
        }
        }

    public static void run() {
        System.out.println("Running...!");
    }


    public String getName() {
        return name;
    }

    public int getHealth() {

        return health;
    }

    public int getScore() {

        return 10;
    }

    public void collectCoin(Coin coin) {
        this.score = coin.getValue();
    }

    public class InvalidHealthException extends RuntimeException{

    }
}
