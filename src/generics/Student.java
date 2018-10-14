package generics;

/**
 * ?类型不定，使用时确定类型
 * ？使用：申明类型
 * ？ extends：<=上限，指定类型子类和本身
 * ？super：》=下限，自身或父类
 * 
 * @author savrina
 *
 * @param <T>
 */

public class Student<T> {
	T score;
	public static void main(String[] args) {
		Student<?> stu = new Student<String>();
		
		test(stu);
		test(new Student<Integer>());
//		test2(stu);
//		test3(stu);
	}
	
	public static void test(Student<?> stu){
		
	}
	public static void test1(Student<Fruit> stu) {

	}
	public static void test2(Student<? extends Fruit> stu) {

	}
	public static void test3(Student<? super Fruit> stu) {
		
	}
}
