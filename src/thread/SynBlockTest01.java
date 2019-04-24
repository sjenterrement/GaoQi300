package thread;

/**
 * 线程安全：在并发时保证数据的准确性效率经可能高 synchronized 1.同步方法 2.同步快
 * 
 * @author SJ
 *
 */
public class SynBlockTest01 {
	public static void main(String[] args) {
		// 一份资源
		SynWeb12306 web = new SynWeb12306();
		System.out.println(Thread.currentThread().getName());
		// 多个代理
		new Thread(web, "码畜").start();
		new Thread(web, "码农").start();
		new Thread(web, "码蝗").start();
	}
}

class SynWeb12306 implements Runnable {
	// 票数
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

	//线程安全：尽可能锁定合理的范围（不是指代码，之数据的完整性）
	public void test5() {
		if (ticketNum < 0) {// 考虑的是没有票的情况
			flag = false;
			return;
		}
		synchronized (this) {// 考虑最后一张票
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

	// 线程不安全
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

	// 线程不安全 ticketNum在变
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

	// 同步块
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
