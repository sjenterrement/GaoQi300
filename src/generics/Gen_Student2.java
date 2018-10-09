package generics;

/**
 * 泛型；类：声明时使用泛型 字母： T Type表示类型 K V表示键值中的key和我value E 代表element 使用时注意类型：
 * 1。泛型只能使用引用类型，不能使用基本类型 2.泛型声明时字母不能使用静态属性/静态方法上
 * 
 * @author savrina
 *
 */

public class Gen_Student2<T1> {
	private T1 javaScore;
	private T1 oracleScore;

	public T1 getJavaScore() {
		return javaScore;
	}

	public void setJavaScore(T1 javaScore) {
		this.javaScore = javaScore;
	}

	public T1 getOracleScore() {
		return oracleScore;
	}

	public void setOracleScore(T1 oracleScore) {
		this.oracleScore = oracleScore;
	}

	// 反省生命是不能使用静态属性
	// private static T1 test;
	public static void main(String[] args) {
		
		Gen_Student2 s=new Gen_Student2<>();//报黄色警告
		Gen_Student2<Object> s1=new Gen_Student2<>();
		
		test(s);
		//test(s1);s1相当于object，但不完全等同object
		//擦除不会类型检查
		test1(s);
		test1(s1);
	}
	
	public static void test(Gen_Student2<Integer> a) {
		
	}
	
	public static void test1(Gen_Student2<?> a) {
		
	}
}

