package thread;
/**
 * 线程安全：在并发时保证数据的准确性效率经可能高
 * synchronized
 * 1.同步方法
 * 2.同步快
 * @author SJ
 *
 */
public class SynTest01 {
	public static void main(String[] args) {
		// 一份资源
		SafeWeb12306 web = new SafeWeb12306();
		System.out.println(Thread.currentThread().getName());
		// 多个代理
		new Thread(web, "码畜").start();
		new Thread(web, "码农").start();
		new Thread(web, "码蝗").start();
	}
}

class SafeWeb12306 implements Runnable {
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
			test();
		}
	}

	public synchronized void test() {
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
