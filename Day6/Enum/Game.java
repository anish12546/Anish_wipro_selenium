//Q7
package assignment6_enum_package;

public class Game {
	
	
	enum Difficulty {EASY ,MEDIUM,HARD};
	
	public Game(Difficulty difficulty) {
		int bulletes=0;
		
		switch(difficulty) {
		case EASY:
			bulletes=3000;
			break;
		case MEDIUM: bulletes=2000;
		break;
		
		case HARD:
			bulletes=1000;
			break;
		}
		System.out.println("game started with difficulty :"+difficulty);
		System.out.println("player get "+bulletes+" bulletes");
	}
	
	public static void main(String args[]) {
		
		Game g=new Game(Difficulty.MEDIUM);
		
	}

}
