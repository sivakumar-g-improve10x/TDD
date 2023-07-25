package templerun;

import com.improve10x.tdd.templerun.Coin;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CoinTest {
    @Test
    public void nothing() {

    }
    @Test
    public  void giveMinusOne_throwsInvalidException() {
        assertThrows(Coin.InvalidValueException.class,
                () -> new Coin(-1),"Coin value should be between 0 to 100");
    }
    @Test
    public void given10_WhenGetValueCalled_thenReturn() {
        assertEquals(10,new Coin(10).getValue());
    }
}
