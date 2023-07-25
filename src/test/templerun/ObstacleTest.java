package templerun;

import com.improve10x.tdd.templerun.Fireball;
import com.improve10x.tdd.templerun.Obstacle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ObstacleTest {
    @Test
    public void nothing() {

    }
    @Test
    public  void giveMinusOne_throwsDamageInvalidException() {
        assertThrows(Obstacle.InvalidDamageException.class,
                () -> new Obstacle("",-1),"Obstacle damage should be between 0 to 100");
    }
    @Test
    public void given0_WhenGetValueCalled_thenReturn0()
    {
        assertEquals(0,new Fireball(0).getValue());
    }
    @Test
    public void given10_WhenGetValueCalled_thenReturn10()
    {
        assertEquals(10,new Fireball(10).getValue());
    }
    @Test
    public  void giveNegativity_throwsDamageInvalidException() {
        assertThrows(Obstacle.InvalidDamageException.class,
                () -> new Obstacle("",-115),"Obstacle damage should be between 0 to 100");
    }
    @Test
    public void given54_WhenGetValueCalled_thenReturn54() {
        assertEquals(54,new Fireball(54).getValue());
    }

    @Test
    public  void give134_throwsInvalidException() {
        assertThrows(Fireball.InvalidValueException.class,
                () -> new Fireball(134),"Obstacle should be between 0 to 134");
    }
}
