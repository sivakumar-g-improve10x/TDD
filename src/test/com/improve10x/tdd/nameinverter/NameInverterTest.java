package com.improve10x.tdd.nameinverter;

import com.improve10x.tdd.nameinverter.NameInverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NameInverterTest {
    private NameInverter nameInverter;

    @BeforeEach
    public void setup() {
        nameInverter = new NameInverter();
    }

    @Test
    public void nothing() {

    }

    @Test
    public void givenEmpty_returnEmpty() {
        String invertedName = nameInverter.invertName("");
        assertEquals("", invertedName);
    }

    @Test
    public void givenSingleWord_returnSingleWord() {
        String invertedName = nameInverter.invertName("siv");
        assertEquals("siv", invertedName);
    }
    @Test
    public void givenSingleWordWithTrailingSpaces_returnSingleWord() {
        String invertedName = nameInverter.invertName("siv  ");
        assertEquals("siv", invertedName);
    }
    @Test
    public void givenSingleWordWithBeginningSpaces_returnSingleWord() {
        String invertedName = nameInverter.invertName("  siv  ");
        assertEquals("siv", invertedName);
    }
    @Test
    public void givenFirstLast_returnInvertedName() {
        String invertedName = nameInverter.invertName("first last");
        assertEquals("last, first",invertedName);
    }
    @Test
    public void givenHonorifics_returnHonorifics() {
        String invertedName = nameInverter.invertName("Miss. first last");
        assertEquals("last, first",invertedName);
    }
    @Test
    public void givenPostNominals_stayAndEnd() {
        String invertName = nameInverter.invertName("first last MSc.");
        assertEquals("last, first MSc.",invertName);
    }
    @Test
    public void givenMultiPostNominals_stayAndEnd() {
        String invertName = nameInverter.invertName("first last MSc. PhD");
        assertEquals("last, first MSc. PhD",invertName);
    }
    @Test
    public void givenIntegrationTest() {
        String invertName = nameInverter.invertName("Mr. Bob Martins MTech. PhD.");
        assertEquals("Martins, Bob MTech. PhD.", invertName);
    }
}
