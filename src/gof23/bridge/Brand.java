package gof23.bridge;

public interface Brand {
	void sale();
}

class Asua implements Brand{

	@Override
	public void sale() {
		System.out.println("���ۻ�˶����");
	}
	
}

class Hp implements Brand{

	@Override
	public void sale() {
		System.out.println("���ۻ��յ���");
	}
	
}