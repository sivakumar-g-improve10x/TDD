package scoring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScoringTest {
    @Test
    public void nothing(){

    }
    @Test
    public void givenNull_returnsAllZeros(){
        Scoring scoring = new Scoring();
       int[] allZeros = scoring.calculateScore(null);
       assertArrayEquals(new int[3],allZeros);
    }
    @Test
    public void givenEmpty_returnsAllZeros(){
        Scoring scoring = new Scoring();
        int[] allZeros = scoring.calculateScore("");
        assertArrayEquals(new int[3],allZeros);
    }
    @Test
    public void givenA_returnsOneZeroZero(){
        Scoring scoring = new Scoring();
        int[] onlyAScore = scoring.calculateScore("A");
        assertArrayEquals(new int[]{1,0,0},onlyAScore);
    }
}
