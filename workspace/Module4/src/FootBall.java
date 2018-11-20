
public class FootBall extends Game {
	
	int goals;
	
	public void scoreGoal(){
		System.out.println("Goals Scored");
	}
	
	//Overriding
	
	@Override
	public void start(){
		System.out.println("Starting of Football Game");
	}

}