package generics;

/**
 * ���ͷ���<>�ڷ�������ǰ��
 * ֻ�ܷ��ʶ������޸���Ϣ
 * @author savrina
 *
 */

public class TestMethod {
	public static void main(String[] args) {
		test("a");
	}
	
	//���ͷ���
	public static <T>void test(T a){
		System.out.println(a);
	}
}

