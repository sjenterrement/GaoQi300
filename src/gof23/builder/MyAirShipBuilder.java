package gof23.builder;

public class MyAirShipBuilder implements AirShipBuilder{

	@Override
	public Engine buildEngine() {
		System.out.println("SJ发动机");
		return new Engine("SJ发动机");
	}

	@Override
	public OrbitalModule buildOrbitalModule() {
		System.out.println("SJ轨道舱");
		return new OrbitalModule("SJ轨道舱");
	}

	@Override
	public EscapeTower buildEscapeTower() {
		System.out.println("SJ逃生塔");
		return new EscapeTower("SJ逃生塔");
	}

}
