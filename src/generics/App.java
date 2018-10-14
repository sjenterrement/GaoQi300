package generics;

/**
 * 泛型没有多态
 * @author savrina
 *
 */

public class App {
	public static void main(String[] args) {
		A<Fruit> f= new A<Fruit>();
//		A<Fruit> f1 = new A<Apple>();
	}
	//形参使用多态
	
		public static void test(A<Fruit> f) {

		}
	//返回类型使用多态	
		public static A<Fruit> test2() {
//			return new (A<Fruit>)(A<Apple>());
			return null;
		}
}
