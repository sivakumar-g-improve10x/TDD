package com.improve10x.tdd.bowling;

import bowling.Game;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameTest {
   private Game game;

   @BeforeEach
   public void setup(){
       game = new Game();
   }
    @Test
    public void nothing() {

    }
    @Test
    public void canRol(){
        game.roll(1);
    }
    @Test
    public void gutterGame() {
        rollMany(20,0);
        assertEquals(0,game.score());
    }

    private void rollMany(int noOfRolls, int pins) {
        for (int i = 0; i< noOfRolls; i++){
            game.roll(pins);
        }
    }

    @Test
    public void allOne() {
        rollMany(20, 1);
        assertEquals(20,game.score());
    }
    @Test
    public void oneSpare() {
        game.roll(5);
        game.roll(5);
        game.roll(4);
        rollMany(17,0);
        assertEquals(18,game.score());
    }
    @Test
    public void oneStrike() {
       game.roll(10);
       game.roll(4);
       game.roll(2);
       rollMany(16,0);
       assertEquals(22,game.score());
    }
}
