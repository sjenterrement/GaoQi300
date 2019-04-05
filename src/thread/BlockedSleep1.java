package thread;
/**
 * sleep模拟网络延迟 放大问题发生的可能性
 * @author SJ
 *
 */
public class BlockedSleep1 {
	public static void main(String[] args) {
		//一份资源
		Web123061 web=new Web123061();
		System.out.println(Thread.currentThread().getName());
		//多个代理
		new Thread(web,"码畜").start();
		new Thread(web,"码农").start();
		new Thread(web,"码蝗").start();
	}
}
class Web123061 implements Runnable {
	// 票数
	private int ticketNum = 99;

	@Override
	public void run() {
		while (true) {
			if (ticketNum < 0)
				break;
			//模拟延时
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
