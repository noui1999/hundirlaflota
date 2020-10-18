package view;

import static org.junit.Assert.*;
import org.junit.Test;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PlayerViewTest {

	@Test
	public void testPrintPlayerDetails() {
		  
		PlayerView view = new PlayerView();
		
		ByteArrayOutputStream outContent = new ByteArrayOutputStream(); //WE SAVE THE THE PRINT AS A VALUE
	    System.setOut(new PrintStream(outContent));
	    
	    view.printPlayerDetails("Dani");

	    String expectedOutput  = "Player name: Dani";

	    assertEquals(expectedOutput.trim(), outContent.toString().trim());
	}

}
