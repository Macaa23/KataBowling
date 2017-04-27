package cl.ubb.testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestGame {
	
	Game g;
	int result;
	
	@Before
	public void setUp(){
		g = new Game();
	}

	@Test
	public void rollThreeAndrollFiveShouldPointEight(){
		g.roll(3);
		g.roll(5);
		result = g.score();
		
		assertEquals(8,result);
	}
	
	@Test
	public void rollThreeFiveSevenTwoShouldPointSeventeen(){
		g.roll(3);
		g.roll(5);
		g.roll(7);
		g.roll(2);
		
		result = g.score();
		
		assertEquals(17,result);
	}
	
	@Test
	public void ThreeRollsThreeStrikesShouldScoreSixty(){
		g.roll(10);
		g.roll(10);
		g.roll(10);
		
		result = g.score();
		
		assertEquals(60,result);
		
	}
	
	
	@Test
	public void realGame(){
		//2 rolls = 8
		g.roll(3);
		g.roll(5);
		
		//Strike, 1 roll = 28
		g.roll(10);
		//Spare = 38
		g.roll(3);
		g.roll(7);
		//2 rolls= 47 
		g.roll(8);
		g.roll(1);
		//Strike
		g.roll(10);
		//Strike
		g.roll(10);
		//2 rolls
		g.roll(6);
		g.roll(2);
		//2 rolls
		g.roll(5);
		g.roll(4);
		//Spare
		g.roll(7);
		g.roll(3);
		//Strike
		g.roll(10);
		//2 rolls extra
		g.roll(6);
		g.roll(3);
		
		result = g.score();
		
		assertEquals(155, result);
		
	}

}
