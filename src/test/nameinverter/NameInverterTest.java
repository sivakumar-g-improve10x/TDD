package nameinverter;

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
        String invertedName = nameInverter.invertName("Mrs. first last");
        assertEquals("last, first",invertedName);
    }
}
