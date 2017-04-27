package cl.ubb.testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestGame {

	@Test
	public void rollThreeAndrollFiveShouldPointEight(){
		Game g = new Game();
		int result;
		g.roll(3);
		g.roll(5);
		result = g.score();
		
		assertEquals(8,result);
	}

}
