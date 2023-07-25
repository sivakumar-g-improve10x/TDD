package templerun;

import com.improve10x.tdd.templerun.Player;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PlayerTest {
    @Test
    public void nothing() {

    }
    @Test
    public void givenNameNull_whenNameGetCalled_thenReturnEmpty() {
        Player player = new Player(null);
        assertEquals("",player.getName());
    }
    @Test
    public void givenNameEmpty_whenNameGetCalled_thenReturnEmpty() {
        Player player = new Player("");
        assertEquals("",player.getName());
    }
    @Test
    public void givenNameExplorer_whenNameGetCalled_thenReturnExplorer() {
        Player player = new Player("Explorer");
        assertEquals("Explorer",player.getName());
    }
    @Test
    public void givenNameExplorerWithSpaces_whenNameGetCalled_thenReturnExplorerTrimmed() {
        Player player = new Player(" Explorer  ");
        assertEquals("Explorer",player.getName());
    }
    @Test
    public void givenNoHealth_whenNameGetCalled_thenReturn100() {
        Player player = new Player("Name");
        assertEquals(100,player.getHealth());
    }
    @Test
    public void givenNoHealthMinusOne_thenThrowsInvalidException() {
        assertThrows(Player.InvalidHealthException.class,
                () -> new Player("Name",-1),
                "Health should be between 0 and 100");

    }
}
