package thread;

public class UnsafeTest01 {
	public static void main(String[] args) {
		// һ����Դ
		UnsafeWeb12306 web = new UnsafeWeb12306();
		System.out.println(Thread.currentThread().getName());
		// �������
		new Thread(web, "����").start();
		new Thread(web, "��ũ").start();
		new Thread(web, "���").start();
	}
}

class UnsafeWeb12306 implements Runnable {
	// Ʊ��
	private int ticketNum = 10;
	private boolean flag = true;

	@Override
	public void run() {
		while (flag) {
			test();
		}
	}

	public void test() {
		if (ticketNum < 0) {
			flag = false;
			return;
		}
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + "-->" + ticketNum--);
	}
}
