package generics;

/**
 * ���ͣ��ࣺ����ʱʹ�÷��� ��ĸ�� T Type��ʾ���� K V��ʾ��ֵ�е�key����value E ����element ʹ��ʱע�����ͣ�
 * 1������ֻ��ʹ���������ͣ�����ʹ�û������� 2.��������ʱ��ĸ����ʹ�þ�̬����/��̬������
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

	// ��ʡ�����ǲ���ʹ�þ�̬����
	// private static T1 test;
	public static void main(String[] args) {
		
		Gen_Student2 s=new Gen_Student2<>();//����ɫ����
		Gen_Student2<Object> s1=new Gen_Student2<>();
		
		test(s);
		//test(s1);s1�൱��object��������ȫ��ͬobject
		//�����������ͼ��
		test1(s);
		test1(s1);
	}
	
	public static void test(Gen_Student2<Integer> a) {
		
	}
	
	public static void test1(Gen_Student2<?> a) {
		
	}
}

