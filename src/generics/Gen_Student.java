package generics;

/**
 * 泛型；类：声明时使用泛型 字母： T Type表示类型 K V表示键值中的key和我value E 代表element 使用时注意类型：
 * 1。泛型只能使用引用类型，不能使用基本类型 2.泛型声明时字母不能使用静态属性/静态方法上
 * 
 * @author savrina
 *
 */

public class Gen_Student<T1, T2> {
	private T1 javaScore;
	private T2 oracleScore;

	public T1 getJavaScore() {
		return javaScore;
	}

	public void setJavaScore(T1 javaScore) {
		this.javaScore = javaScore;
	}

	public T2 getOracleScore() {
		return oracleScore;
	}

	public void setOracleScore(T2 oracleScore) {
		this.oracleScore = oracleScore;
	}

	// 反省生命是不能使用静态属性
	// private static T1 test;
	public static void main(String[] args) {
		//使用指定类型
		Gen_Student<String, Integer> stu =new Gen_Student<String,Integer>();
		//安全：类型检查
		stu.setJavaScore("优秀");
		//省心：类型转化
		int it=stu.getOracleScore();//Integer自动拆箱
		
	}
}
