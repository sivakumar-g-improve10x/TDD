package com.improve10x.tdd.scoring;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ScoringTest {
    private Scoring scoring;

    @BeforeEach
    public void setup(){
            scoring = new Scoring();
    }
    @Test
    public void nothing(){

    }
    @Test
    public void givenNull_returnsAllZeros(){
       int[] allZeros = scoring.calculateScore(null);
       assertArrayEquals(new int[3],allZeros);
    }
    @Test
    public void givenEmpty_returnsAllZeros(){
        int[] allZeros = scoring.calculateScore("");
        assertArrayEquals(new int[3],allZeros);
    }
    @Test
    public void givenA_returnsOneZeroZero(){
        int[] onlyAScore = scoring.calculateScore("A");
        assertArrayEquals(new int[]{1,0,0},onlyAScore);
    }
    @Test
    public void givenB_returnsZeroOneZero(){
        int[] onlyBScore = scoring.calculateScore("B");
        assertArrayEquals(new int[]{0,1,0},onlyBScore);
    }
    @Test
    public void givenC_returnsZeroZeroOne(){
        int[] onlyCScore = scoring.calculateScore("C");
        assertArrayEquals(new int[]{0,0,1},onlyCScore);
    }
    @Test
    public void givenAB_returnsZeroZeroOne(){
        int[] abScore = scoring.calculateScore("AB");
        assertArrayEquals(new int[]{1,1,0},abScore);
    }
    @Test
    public void givenABC_returnsAllOne(){
        int[] abcScore = scoring.calculateScore("ABC");
        assertArrayEquals(new int[]{1,1,1},abcScore);
    }
    @Test
    public void givenAABC_returnsAllOne(){
        int[] aabcScore = scoring.calculateScore("AABC");
        assertArrayEquals(new int[]{2,1,1},aabcScore);
    }
    @Test
    public void givenABBC_returnsAllOne(){
        int[] abbcScore = scoring.calculateScore("ABBC");
        assertArrayEquals(new int[]{1,2,1},abbcScore);
    }
    @Test
    public void givenABCC_returnsAllOne(){
        int[] abccScore = scoring.calculateScore("ABCC");
        assertArrayEquals(new int[]{1,1,2},abccScore);
    }
    @Test
    public void givenABBACCCCAC_returnsThreeTwoFive(){
        int[] abbaccccacScore = scoring.calculateScore("ABBACCCCAC");
        assertArrayEquals(new int[]{1,2,1},abbaccccacScore);
    }
}
