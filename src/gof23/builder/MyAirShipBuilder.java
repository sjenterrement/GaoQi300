package gof23.builder;

public class MyAirShipBuilder implements AirShipBuilder{

	@Override
	public Engine buildEngine() {
		System.out.println("SJ������");
		return new Engine("SJ������");
	}

	@Override
	public OrbitalModule buildOrbitalModule() {
		System.out.println("SJ�����");
		return new OrbitalModule("SJ�����");
	}

	@Override
	public EscapeTower buildEscapeTower() {
		System.out.println("SJ������");
		return new EscapeTower("SJ������");
	}

}
