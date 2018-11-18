package gof23.sinleton;
/**
 * ��������ʽ����ģʽ
 * @author SJ
 *
 */
public class SingletonDemo2 {
	//���ʼ��ʱ������ʼ�����������ʱ���أ������õ�ʱ���ٴ�����
	private static SingletonDemo2 instance;
	
	private SingletonDemo2() {//˽�л�������
		
	}
	
	//����ͬ��������Ч�ʵͣ�
	public static synchronized SingletonDemo2 getInstance() {
		if (instance==null) {
			instance=new SingletonDemo2();
		}
		return instance;
	}
}
