
public class TestCar {

	public static void main(String args[]) {
		
		Car car1 = new Car();
		car1.name = "Maruti";
		car1.price = 850000;
		
		car1.increasePrice(1000);
		
		Engine e = new Engine();
		e.mdNumber = "ENG9706";
		e.milage = 19;
		
		car1.eng = e;
		System.out.println(car1.eng.mdNumber);
		System.out.println(car1.eng.milage);
		
		Car car2 = new Car();
		car2.name = "Hundai";
		car2.price = 900000;
		car2.eng = new Engine();
		
		car2.eng.mdNumber = "B class engine";
		car2.eng.milage = 20;
		
		Engine en = car2.getEngine();
		
		en.start();
		en.stop();
		
		car2.getEngine().start();
		car2.getEngine().stop();
		
	}

}
