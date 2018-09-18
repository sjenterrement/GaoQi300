package testWrappedClass;

/**
 * 测试自动装箱和拆箱
 * @author savrina
 *
 */

public class TestWrappedClass {
	public static void main(String[] args) {
		Integer a=new Integer(1000);
		Integer a1=1000;//jdk5.0,自动装箱，编译器帮我们改变代码
		
		int c=new Integer(1111);
		
		System.out.println(c);//编译器改进：new Integer（1111）.intValue()
		
		Integer d1=1234;
		Integer d2=1234;
		System.out.println(d1==d2);
		System.out.println(d1.equals(d2));
		
		System.out.println("##################");
		
		Integer s1=100;//[-128,127]之内的数，任然当作基本数据类型处理
		Integer s2=100;
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
	}
}
