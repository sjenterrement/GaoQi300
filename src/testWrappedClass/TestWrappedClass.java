package testWrappedClass;

/**
 * �����Զ�װ��Ͳ���
 * @author savrina
 *
 */

public class TestWrappedClass {
	public static void main(String[] args) {
		Integer a=new Integer(1000);
		Integer a1=1000;//jdk5.0,�Զ�װ�䣬�����������Ǹı����
		
		int c=new Integer(1111);
		
		System.out.println(c);//�������Ľ���new Integer��1111��.intValue()
		
		Integer d1=1234;
		Integer d2=1234;
		System.out.println(d1==d2);
		System.out.println(d1.equals(d2));
		
		System.out.println("##################");
		
		Integer s1=100;//[-128,127]֮�ڵ�������Ȼ���������������ʹ���
		Integer s2=100;
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
	}
}
