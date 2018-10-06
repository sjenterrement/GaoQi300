package generics;

/**
 * ���ͣ��ࣺ����ʱʹ�÷��� ��ĸ�� T Type��ʾ���� K V��ʾ��ֵ�е�key����value E ����element ʹ��ʱע�����ͣ�
 * 1������ֻ��ʹ���������ͣ�����ʹ�û������� 2.��������ʱ��ĸ����ʹ�þ�̬����/��̬������
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

	// ��ʡ�����ǲ���ʹ�þ�̬����
	// private static T1 test;
	public static void main(String[] args) {
		//ʹ��ָ������
		Gen_Student<String, Integer> stu =new Gen_Student<String,Integer>();
		//��ȫ�����ͼ��
		stu.setJavaScore("����");
		//ʡ�ģ�����ת��
		int it=stu.getOracleScore();//Integer�Զ�����
		
	}
}
