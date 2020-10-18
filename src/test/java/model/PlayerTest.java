package model;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlayerTest {

	@Test
	public void testPlayer() { //MIRAR COMO SE HACE TEST DE CONSTRUCTOR <---------------------------------------------
		Player player = new Player("Dani");
	}

	@Test
	public void testSetName() {
		Player player = new Player("Dani");
		player.setName("Pablo");
		assertEquals("Pablo",player.getName());
	}

	@Test
	public void testGetName() {
		Player player = new Player("Dani");
		assertEquals("Dani",player.getName());
	}

}
