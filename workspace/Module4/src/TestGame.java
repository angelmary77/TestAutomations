
public class TestGame {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FootBall fb = new FootBall();
		fb.name = "Football";
		fb.duration = 1;
		fb.start(); //Football class
		fb.end();
		//Feature of football
		fb.scoreGoal();
		fb.goals = 1;
		
		System.out.println("**********************");
		
		Game g = new Game();
		g.name = "coco";
		g.duration = 2;
		g.start(); //Game class
		g.end();
		
		System.out.println("**********************");
		
		//parent      child
		// all functions in game class
		// oveeriden in child class are called
		
		Game g1 = new FootBall();
		
		g1.name = "Vallyball";
		g1.duration = 1;
		g1.start(); //football
		g1.end();
		

	}

}
