package thread;
/**
 * ʵ��runnable+��дrun
 * ����������ʵ�������+thread����+start
 * �Ƽ������ⵥ�̳еľ����ԣ�����ʹ�ýӿ�
 * ���㹲����Դ
 * @author sj
 *
 */
public class StartRun implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<20;i++) {
			System.out.println("music");
		}
	}
	public static void main(String[] args) {
//		//����ʵ�ֶ���
//		StartRun sr=new StartRun();
//		//�������������
//		Thread t=new Thread(sr);
//		//����
//		t.start();
		
		new Thread(new StartRun()).start();
		
		for (int i = 0; i < 20; i++)
			System.out.println("coding");
	}
}
