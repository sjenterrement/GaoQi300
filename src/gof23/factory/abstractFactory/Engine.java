package gof23.factory.abstractFactory;

public interface Engine {
	void run();
	void start();
}

class LuxuryEngine implements Engine{

	@Override
	public void run() {
		System.out.println("ת�Ŀ죡");
		
	}

	@Override
	public void start() {
		System.out.println("�����죡");
		
	}
	
}

class LowEngine implements Engine{

	@Override
	public void run() {
		System.out.println("ת������");
		
	}

	@Override
	public void start() {
		System.out.println("��������");
		
	}
	
}
