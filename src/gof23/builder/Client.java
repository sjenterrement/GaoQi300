package gof23.builder;

public class Client {
	public static void main(String[] args) {

		AirShipDerector director = new MyAirShipDirector(new MyAirShipBuilder());

		AirShip ship = director.directAirship();

		System.out.println(ship.getEngine().getName());
		ship.launch();
	}
}
