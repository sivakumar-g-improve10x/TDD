package templerun;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {
    @Test
    public void nothing() {

    }
    @Test
    public void givenNameNull_whenNameGetCalled_thenReturnEmpty(){
        Player player = new Player(null);
        assertEquals("",player.getName());
    }
    @Test
    public void givenNameEmpty_whenNameGetCalled_thenReturnEmpty(){
        Player player = new Player("");
        assertEquals("",player.getName());
    }

}