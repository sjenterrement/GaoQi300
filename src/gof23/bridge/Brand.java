package gof23.bridge;

public interface Brand {
	void sale();
}

class Asua implements Brand{

	@Override
	public void sale() {
		System.out.println("销售华硕电脑");
	}
	
}

class Hp implements Brand{

	@Override
	public void sale() {
		System.out.println("销售惠普电脑");
	}
	
}