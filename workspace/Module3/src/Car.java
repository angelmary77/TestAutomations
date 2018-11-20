
public class Car {
	
	String name;
	int price;
	Engine eng;
	
	public int increasePrice(int increment){
		price = price + increment;
		return price;
	}
	
	public Engine getEngine(){
		return eng;
	}

	

}
