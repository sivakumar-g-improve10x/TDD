package com.improve10x.tdd;

public class Player extends Character{
    private int score;

    public Player(String name, int health) {
        super(name, health);
        this.score = 0;
    }
    public void run () {
        System.out.println("Running....");
    }
    public void jump() {
        System.out.println(getName() + "jumped to void obstacle !");
    }

    public int getScore() {
        return score;
    }
    public void collectCoin(Coin coin) {
        this.score += coin.getValue();
    }
}
