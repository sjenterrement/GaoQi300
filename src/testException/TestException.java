package testException;

/**
 * �����˽��쳣����
 * 
 * @author savrina
 *
 */

public class TestException {

	void test() {
	};

	public static void main(String[] args) {
		
		//ArithmeticException...�쳣��unchecked�쳣����һ���жϼ���
//		int a = 1 / 0;
		
		
		/*
		 * NullPointerException��������������ʷ���һ���ն���ĳ�Ա�����򷽷�������һ��������ĳ�Աʱ��Ӧ���ж϶���������Ƿ�Ϊ��
		 */
		man man1 = null;
//		man1.getMan();
		
		/*
		 * NumberFormatException���ָ�ʽ�쳣
		 */
		String s="123ddd";
		Integer i=new Integer(s);
	}

	
	public class man {
		void getMan(){
			
		}
	}
}
