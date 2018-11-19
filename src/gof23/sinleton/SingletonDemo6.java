package gof23.sinleton;
/**
 * ��������ʽ����ģʽ����η�ֹ����ͷ�����©����
 * @author SJ
 *
 */
public class SingletonDemo6 {
	//�۳�ʼ��ʱ������ʼ�����������ʱ���������õ���ʱ���ټ��أ�
		private static SingletonDemo6 instance;
		
		private SingletonDemo6(){
			if (instance!=null) {
				throw new RuntimeException();
			}
		}
		
		//����ͬ��������Ч�ʵ�
		public static synchronized SingletonDemo6 getInstance() {
			if (instance==null) {
				instance=new SingletonDemo6();
			}
			return instance;
		}
		
}
