package generics;

/**
 * 多态的两种形式
 * @author savrina
 *
 */

public class FruitApp {
	public static void main(String[] args) {
		Fruit f=new Apple();
		
	}
	//形参使用多态
	public static void test(Fruit f) {

	}
	
	public static Fruit test2() {
		return new Apple();
	}
}
