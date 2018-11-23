package gof23.builder;

public interface AirShipBuilder {
	Engine buildEngine();
	OrbitalModule buildOrbitalModule();
	EscapeTower buildEscapeTower();
}
