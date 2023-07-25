package templerun;

import com.improve10x.tdd.templerun.Fireball;
import com.improve10x.tdd.templerun.SpikePit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SpikePitTest {
    @Test
    public void nothing() {

    }
    @Test
    public  void giveMinusOne_throwsInvalidException() {
        assertThrows(SpikePit.InvalidValueException.class,
                () -> new SpikePit(-1),"SpikePit width should be between 0 to 100");
    }
    @Test
    public  void give101_throwsInvalidException() {
        assertThrows(SpikePit.InvalidValueException.class,
                () -> new SpikePit(101),"SpikePit width should be between 0 to 100");
    }
    @Test
    public void given10_WhenGetValueCalled_thenReturn10() throws SpikePit.InvalidValueException {
        assertEquals(10,new SpikePit(10).getValue());
    }
    @Test
    public void given37_WhenGetValueCalled_thenReturn37() {

        assertEquals(37,new Fireball(37).getValue());
    }
}
