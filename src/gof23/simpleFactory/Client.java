package gof23.simpleFactory;

public class Client {
	public static void main(String[] args) {
		Car c1 = CarFactory.CreateFactory("°ÂµÏ");
		Car c2 = CarFactory.CreateFactory("±ÈÑÇµÏ");

		c1.run();
		c2.run();
	}

}
