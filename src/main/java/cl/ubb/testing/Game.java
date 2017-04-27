package cl.ubb.testing;

public class Game {
	int score = 0;
	int STRIKE = 10;
	public void roll(int pins){
		if(pins == 10){
			score+= STRIKE;
		}
		score += pins; 
	}
	
	public int score(){
		return score;
	}

}
