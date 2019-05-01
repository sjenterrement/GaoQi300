package thread;

/**
 * ����12306
 * 
 * @author SJ
 *
 */
public class Happy12306 {
	public static void main(String[] args) {
		Web1230611 c = new Web1230611(4, "BTS");
		new Passenger(c, "�ϸ�", 2).start();
		new Passenger(c, "����", 1).start();
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

	int available;// ���
	String name;// ����

	public Web1230611(int available, String name) {
		this.available = available;
		this.name = name;
	}

	public void run() {
		Passenger p = (Passenger) Thread.currentThread();
		boolean flag = this.bookTickets(p.seats);
		if (flag) {
			System.out.println("��Ʊ�ɹ�" + Thread.currentThread().getName() + "-->λ��Ϊ" + p.seats);
		} else {
			System.out.println("��Ʊʧ��" + Thread.currentThread().getName() + "λ�ò���");
		}
	}

	// ��Ʊ
	public synchronized boolean bookTickets(int seats) {
		System.out.println("����λ��Ϊ�� " + available);
		if (seats > available) {
			return false;
		}
		available -= seats;
		return true;
	}
}