package gof23.sinleton;
/**
 * ���Զ���ʽ����ģʽ
 * @author SJ
 *
 */
public class SingletonDemo3 {
	//���ʼ��ʱ�����������������û���ӳټ��ص����ƣ���������ʱ����Ȼ�����̰߳�ȫ�ģ�
	private static SingletonDemo3 instance=null;
	
	private SingletonDemo3() {
		
	}
	
	//����û��ͬ��������Ч�ʸߣ�
	public static SingletonDemo3 getInstance() {
		if (instance==null) {
			SingletonDemo3 sc;
			synchronized (SingletonDemo3.class) {
				sc=instance;
				if (sc==null) {
					sc=new SingletonDemo3();
				}
			}
			instance=sc;
		}
		return instance;
	}
	
}
