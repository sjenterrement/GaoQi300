package thread;

/**
 * 守护线程：是为用户线程服务的，jvm停止不用等待守护线程执行完毕
 * 
 * @author SJ
 *
 */
public class DaemonTest {
	public static void main(String[] args) {
		God god = new God();
		You1 you = new You1();
		Thread t = new Thread(god);
		t.setDaemon(true);//将用户线程调整为守护
		t.start();
		new Thread(you).start();
	}
}

class You1 extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 356 * 100; i++)
			System.out.println("happy life...");
		System.out.println("oooooo...");
	}
}

class God extends Thread {
	public void run() {
		for (; true;)
			System.out.println("god blessing you");
	}
}