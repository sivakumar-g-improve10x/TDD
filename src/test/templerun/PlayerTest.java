package templerun;

import com.improve10x.tdd.templerun.Coin;
import com.improve10x.tdd.templerun.Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PlayerTest {
    private ByteArrayOutputStream outputStream;
    @BeforeEach
    public void setup() {
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }
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
    @Test
    public void givenHealth100_whenNameGetCalled_thenReturn100() {
        Player player = new Player("Name",100);
        assertEquals(100,player.getHealth());
    }
    @Test
    public void givenHealth90_whenNameGetCalled_thenReturn90() throws Player.InvalidHealthException{
        Player player = new Player("Name",90);
        assertEquals(90,player.getHealth());
    }
    @Test
    public void whenRunCalled_displayRunningMessage() throws Player.InvalidHealthException{
        Player player = new Player("Name",100);
        Player.run();
        assertEquals("Running...!",outputStream.toString().trim());
    }
    @Test
    public void whenGetScoreCalled_Return0() throws Player.InvalidHealthException{
        Player player = new Player("Name");
        assertEquals(0,player.getScore());
    }
    @Test
    public void givenCoin10_whenGetScoreCalled_thenReturn10() throws Player.InvalidHealthException{
        Player player = new Player("Name");
        player.collectCoin(new Coin(10));
        assertEquals(10,player.getScore());
    }
    @Test
    public void givenCoin10and20_whenGetScoreCalled_thenReturn30() throws Player.InvalidHealthException{
        Player player = new Player("Name");
        player.collectCoin(new Coin(30));
        player.run();
        assertEquals(30,player.getScore());
    }
    @Test
    public void whenGetJumpCalled_displaysJumpingMessage() throws Player.InvalidHealthException{
        Player player = new Player("Name");
        player.jump();
        assertEquals("Name jumped to avoid obstacle!",outputStream.toString().trim());
    }
    @Test
    public void givenHealth100_whenJumpCalled_displaysJumpingMessage() throws Player.InvalidHealthException{
        Player player = new Player("Name",100);
        player.jump();
        assertEquals("Name jumped to avoid obstacle!",outputStream.toString().trim());
    }
}
