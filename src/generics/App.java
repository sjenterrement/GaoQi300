package generics;

/**
 * ����û�ж�̬
 * @author savrina
 *
 */

public class App {
	public static void main(String[] args) {
		A<Fruit> f= new A<Fruit>();
//		A<Fruit> f1 = new A<Apple>();
	}
	//�β�ʹ�ö�̬
	
		public static void test(A<Fruit> f) {

		}
	//��������ʹ�ö�̬	
		public static A<Fruit> test2() {
//			return new (A<Fruit>)(A<Apple>());
			return null;
		}
}
