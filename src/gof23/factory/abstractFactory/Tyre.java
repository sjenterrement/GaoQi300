package gof23.factory.abstractFactory;

public interface Tyre {
	void revolve();
}

class LuxuryTyre implements Tyre{

	@Override
	public void revolve() {
		System.out.println("Ðý×ª²»Ä¥Ëð");
		
	}
	
}

class LowTyre implements Tyre{

	@Override
	public void revolve() {
		System.out.println("Ðý×ªÄ¥Ëð");
		
	}
	
}