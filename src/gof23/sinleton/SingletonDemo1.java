package gof23.sinleton;
/**
 * ���Զ���ʽ����ģʽ
 * @author SJ
 *
 */
public class SingletonDemo1 {
	//���ʼ��ʱ�����������������û���ӳټ��ص����ƣ���������ʱ����Ȼ�����̰߳�ȫ�ģ�
	private static SingletonDemo1 instance=new SingletonDemo1();
	
	private SingletonDemo1() {
		
	}
	
	//����û��ͬ��������Ч�ʸߣ�
	public static SingletonDemo1 getInstance() {
		return instance;
	}
}
