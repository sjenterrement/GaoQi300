package thread;

/**
 * �̰߳�ȫ���ڲ���ʱ��֤���ݵ�׼ȷ��Ч�ʾ����ܸ� synchronized 1.ͬ������ 2.ͬ����
 * 
 * @author SJ
 *
 */
public class SynBlockTest01 {
	public static void main(String[] args) {
		// һ����Դ
		SynWeb12306 web = new SynWeb12306();
		System.out.println(Thread.currentThread().getName());
		// �������
		new Thread(web, "����").start();
		new Thread(web, "��ũ").start();
		new Thread(web, "���").start();
	}
}

class SynWeb12306 implements Runnable {
	// Ʊ��
	private int ticketNum = 10;
	private boolean flag = true;

	@Override
	public void run() {
		while (flag) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			test5();
		}
	}

	//�̰߳�ȫ����������������ķ�Χ������ָ���룬֮���ݵ������ԣ�
	public void test5() {
		if (ticketNum < 0) {// ���ǵ���û��Ʊ�����
			flag = false;
			return;
		}
		synchronized (this) {// �������һ��Ʊ
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

	// �̲߳���ȫ
	public void test4() {
		synchronized (this) {
			if (ticketNum < 0) {
				flag = false;
				return;
			}
		}
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + "-->" + ticketNum--);

	}

	// �̲߳���ȫ ticketNum�ڱ�
	public void test3() {
		synchronized ((Integer) ticketNum) {
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

	// ͬ����
	public void test2() {
		synchronized (this) {
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

	public synchronized void test1() {
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
