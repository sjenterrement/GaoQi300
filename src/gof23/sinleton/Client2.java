package gof23.sinleton;

import java.lang.reflect.Constructor;
/**
 * 测试反射和反序列化破解单例模式
 * @author SJ
 *
 */
public class Client2 {
	public static void main(String[] args) throws Exception {
		SingletonDemo6 s1=SingletonDemo6.getInstance();
		SingletonDemo6 s2=SingletonDemo6.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
		
		Class<SingletonDemo6> clazz=(Class<SingletonDemo6>) Class.forName("gof23.SingletonDemo6");
		Constructor<SingletonDemo6> c=clazz.getDeclaredConstructor(null);
		c.setAccessible(true);
		SingletonDemo6 s3=c.newInstance();
		SingletonDemo6 s4=c.newInstance();
		
		System.out.println(s3);
		System.out.println(s4);
		
	}
}
