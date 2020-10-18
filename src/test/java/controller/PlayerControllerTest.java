package controller;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

import model.Player;
import view.PlayerView;

public class PlayerControllerTest {

	@Test
	public void testSetPlayerName() {
		
		Player player = new Player("Dani");
		PlayerView pw = new PlayerView();
		PlayerController pc = new PlayerController(player,pw);
		pc.setPlayerName("Pablo");
		assertEquals("Pablo",pc.getPlayerName());
	}

	@Test
	public void testGetPlayerName() {
		Player player = new Player("Dani");
		PlayerView pw = new PlayerView();
		PlayerController pc = new PlayerController(player,pw);
		assertEquals("Dani",pc.getPlayerName());
	}

	@Test
	public void testUpdateView() {
		Player player = new Player("Dani");
		PlayerView pw = new PlayerView();
		PlayerController pc = new PlayerController(player,pw);
		pc.setPlayerName("Pablo");
		pc.updateView();
		
		ByteArrayOutputStream outContent = new ByteArrayOutputStream(); //WE SAVE THE THE PRINT AS A VALUE
	    System.setOut(new PrintStream(outContent));
	    
	    pc.updateView();
	    
	    String expectedOutput  = "Player name: Pablo";

	    assertEquals(expectedOutput.trim(), outContent.toString().trim());
	}

}
