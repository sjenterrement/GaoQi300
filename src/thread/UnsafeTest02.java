package thread;

/**
 * 线程不安全：取钱
 * 
 * @author SJ
 *
 */
public class UnsafeTest02 {
	public static void main(String[] args) {
		// 账户
		Account account = new Account(100, "结婚礼金");
		Drawing you = new Drawing(account, 80, "可悲的你");
		Drawing wife = new Drawing(account, 90, "happy的她");
		you.start();
		wife.start();
	}
}

// 模拟取款
class Drawing extends Thread {
	Account account;// 取钱的账户
	int drawingMoney;// 取得钱数
	int packetTotal;// 取得总数

	public Drawing(Account account, int drawingMoney, String name) {
		super(name);
		this.account = account;
		this.drawingMoney = drawingMoney;
	}

	@Override
	public void run() {
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
		System.out.println(this.getName() + "-->账户余额为：" + account.money);
		System.out.println(this.getName() + "-->口袋钱为：" + packetTotal);
	}
}