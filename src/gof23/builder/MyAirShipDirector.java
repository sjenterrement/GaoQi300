package gof23.builder;

public class MyAirShipDirector implements AirShipDerector{
	
	private AirShipBuilder builder;
	
	

	public MyAirShipDirector(AirShipBuilder builder) {
		super();
		this.builder = builder;
	}



	@Override
	public AirShip directAirship() {
		
		Engine e =builder.buildEngine();
		OrbitalModule om=builder.buildOrbitalModule();
		EscapeTower et=builder.buildEscapeTower();
		
		AirShip myAirShip=new AirShip();
		
		myAirShip.setEngine(e);
		myAirShip.setOrbitalModule(om);
		myAirShip.setEscapeTower(et);
		
		return myAirShip;
	}

}
