package thread;
/**
 * sleepģ�������ӳ� �Ŵ����ⷢ���Ŀ�����
 * @author SJ
 *
 */
public class BlockedSleep1 {
	public static void main(String[] args) {
		//һ����Դ
		Web123061 web=new Web123061();
		System.out.println(Thread.currentThread().getName());
		//�������
		new Thread(web,"����").start();
		new Thread(web,"��ũ").start();
		new Thread(web,"���").start();
	}
}
class Web123061 implements Runnable {
	// Ʊ��
	private int ticketNum = 99;

	@Override
	public void run() {
		while (true) {
			if (ticketNum < 0)
				break;
			//ģ����ʱ
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "-->" + ticketNum--);
		}
	}
}
