package thread;

/**
 * �̰߳�ȫ��ȡǮ
 * 
 * @author SJ
 *
 */
public class SynTest02 {
	public static void main(String[] args) {
		// �˻�
		Account account = new Account(100, "������");
		SafeDrawing you = new SafeDrawing(account, 80, "�ɱ�����");
		SafeDrawing wife = new SafeDrawing(account, 90, "happy����");
		you.start();
		wife.start();
	}
}


// ģ��ȡ��
class SafeDrawing extends Thread {
	Account account;// ȡǮ���˻�
	int drawingMoney;// ȡ��Ǯ��
	int packetTotal;// ȡ������

	public SafeDrawing(Account account, int drawingMoney, String name) {
		super(name);
		this.account = account;
		this.drawingMoney = drawingMoney;
	}

	@Override
	public void run() {
		test();
	}
	
	public synchronized void test() {
		if (account.money - drawingMoney < 0) {
			return;
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		account.money -= drawingMoney;
		packetTotal += drawingMoney;
		System.out.println(this.getName() + "-->�˻����Ϊ��" + account.money);
		System.out.println(this.getName() + "-->�ڴ�ǮΪ��" + packetTotal);
	}
}