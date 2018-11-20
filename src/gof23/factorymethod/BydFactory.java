package gof23.factorymethod;

public class BydFactory implements CarFactory{

	@Override
	public Car createCar() {
		return new Byd();
	}

}
