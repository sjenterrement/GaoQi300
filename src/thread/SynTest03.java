package thread;

/**
 * �̰߳�ȫ��ȡǮ
 * 
 * @author SJ
 *
 */
public class SynTest03 {
	public static void main(String[] args) {
		// �˻�
		Account account = new Account(1000, "������");
		SynDrawing you = new SynDrawing(account, 80, "�ɱ�����");
		SynDrawing wife = new SynDrawing(account, 90, "happy����");
		you.start();
		wife.start();
	}
}

// ģ��ȡ��
class SynDrawing extends Thread {
	Account account;// ȡǮ���˻�
	int drawingMoney;// ȡ��Ǯ��
	int packetTotal;// ȡ������

	public SynDrawing(Account account, int drawingMoney, String name) {
		super(name);
		this.account = account;
		this.drawingMoney = drawingMoney;
	}

	@Override
	public void run() {
		test();
	}

	public void test() {
		synchronized(account) {
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
}