package gof23.simpleFactory;

public class Client {
	public static void main(String[] args) {
		Car c1 = CarFactory.CreateFactory("�µ�");
		Car c2 = CarFactory.CreateFactory("���ǵ�");

		c1.run();
		c2.run();
	}

}
