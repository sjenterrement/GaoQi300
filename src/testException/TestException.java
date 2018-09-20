package testException;

/**
 * 测试了解异常机制
 * 
 * @author savrina
 *
 */

public class TestException {

	void test() {
	};

	public static void main(String[] args) {
		
		//ArithmeticException...异常，unchecked异常，加一个判断即可
//		int a = 1 / 0;
		
		
		/*
		 * NullPointerException。。。当程序访问访问一个空对象的成员变量或方法，访问一个空数组的成员时，应先判断对象或数组是否为空
		 */
		man man1 = null;
//		man1.getMan();
		
		/*
		 * NumberFormatException数字格式异常
		 */
		String s="123ddd";
		Integer i=new Integer(s);
	}

	
	public class man {
		void getMan(){
			
		}
	}
}
