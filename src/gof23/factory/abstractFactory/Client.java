package gof23.factory.abstractFactory;

public class Client {
	public static void main(String[] args) {
		CarFactory LuxCar=new LuxuryCarFactory();
		Engine e=LuxCar.createEngine();
		
		e.run();
		e.start();
		
	}
}
