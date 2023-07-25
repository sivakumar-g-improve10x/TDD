package templerun;

import com.improve10x.tdd.templerun.Coin;
import com.improve10x.tdd.templerun.Fireball;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FireBallTest {
    @Test
    public void nothing() {

}
    @Test
    public  void giveMinusOne_throwsInvalidException() {
        assertThrows(Fireball.InvalidValueException.class,
                () -> new Fireball(-1),"FireBall speed should be between 0 to 100");
    }
    @Test
    public void given10_WhenGetValueCalled_thenReturn10()
    {
        assertEquals(10,new Fireball(10).getValue());
    }
    @Test
    public void given20_WhenGetValueCalled_thenReturn20() {

        assertEquals(20,new Fireball(20).getValue());
    }
    @Test
    public void given35_WhenGetValueCalled_thenReturn35() {

        assertEquals(35,new Fireball(35).getValue());
    }
    @Test
    public  void give101_throwsInvalidException() {
        assertThrows(Fireball.InvalidValueException.class,
                () -> new Fireball(101),"FireBall should be between 0 to 101");
    }
}

