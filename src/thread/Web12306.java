package thread;

/**
 * ģ���ţ��Ʊ
 * ������Դ
 * �������̰߳�ȫ��
 * 
 * @author SJ
 *
 */
public class Web12306 implements Runnable {
	// Ʊ��
	private int ticketNum = 99;

	@Override
	public void run() {
		while (true) {
			if (ticketNum < 0)
				break;
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "-->" + ticketNum--);
		}
	}
	public static void main(String[] args) {
		//һ����Դ
		Web12306 web=new Web12306();
		System.out.println(Thread.currentThread().getName());
		//�������
		new Thread(web,"����").start();
		new Thread(web,"��ũ").start();
		new Thread(web,"���").start();
	}
}
