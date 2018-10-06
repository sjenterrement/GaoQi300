package generics;

/**
 * 泛型方法<>在返回类型前面
 * 只能访问对象不能修改信息
 * @author savrina
 *
 */

public class TestMethod {
	public static void main(String[] args) {
		test("a");
	}
	
	//泛型方法
	public static <T>void test(T a){
		System.out.println(a);
	}
}

