package gof23.factory.simpleFactory;

public class Client {
	public static void main(String[] args) {
		Car c1 = CarFactory.CreateFactory("°ÂµÏ");
		Car c2 = CarFactory.CreateFactory("±ÈÑÇµÏ");

		c1.run();
		c2.run();
	}

}
