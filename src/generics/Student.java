package generics;

/**
 * ?���Ͳ�����ʹ��ʱȷ������
 * ��ʹ�ã���������
 * �� extends��<=���ޣ�ָ����������ͱ���
 * ��super����=���ޣ��������
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
