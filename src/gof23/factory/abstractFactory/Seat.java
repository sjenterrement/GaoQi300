package gof23.factory.abstractFactory;

public interface Seat {
	void massage();
}

class LuxurySeat implements Seat{

	@Override
	public void massage() {
		System.out.println("���԰�Ħ");
		
	}
	
}

class LowSeat implements Seat{

	@Override
	public void massage() {
		System.out.println("�����԰�Ħ");
		
	}
	
}