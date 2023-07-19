package scoring;

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
}
