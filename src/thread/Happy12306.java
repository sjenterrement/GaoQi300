package thread;

/**
 * 快乐12306
 * 
 * @author SJ
 *
 */
public class Happy12306 {
	public static void main(String[] args) {
		Web1230611 c = new Web1230611(4, "BTS");
		new Passenger(c, "老高", 2).start();
		new Passenger(c, "儿子", 1).start();
	}
}

class Passenger extends Thread {
	int seats;

	public Passenger(Runnable target, String name, int seats) {
		super(target, name);
		this.seats = seats;
	}
}

class Web1230611 implements Runnable {

	int available;// 金额
	String name;// 名称

	public Web1230611(int available, String name) {
		this.available = available;
		this.name = name;
	}

	public void run() {
		Passenger p = (Passenger) Thread.currentThread();
		boolean flag = this.bookTickets(p.seats);
		if (flag) {
			System.out.println("出票成功" + Thread.currentThread().getName() + "-->位置为" + p.seats);
		} else {
			System.out.println("出票失败" + Thread.currentThread().getName() + "位置不够");
		}
	}

	// 购票
	public synchronized boolean bookTickets(int seats) {
		System.out.println("可用位置为： " + available);
		if (seats > available) {
			return false;
		}
		available -= seats;
		return true;
	}
}