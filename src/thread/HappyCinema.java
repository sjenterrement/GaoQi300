package thread;

public class HappyCinema {

	public static void main(String[] args) {
		Cinema c = new Cinema(2, "BTS");
		new Thread(new Customer(c, 2), "�ְ�").start();
		new Thread(new Customer(c, 1), "����").start();
	}
}

class Customer implements Runnable {
	Cinema cinema;
	int seats;

	public Customer(Cinema cinema, int seats) {
		this.cinema = cinema;
		this.seats = seats;
	}

	@Override
	public void run() {
		synchronized (cinema) {
			boolean flag = cinema.bookTickets(seats);
			if (flag) {
				System.out.println("��Ʊ�ɹ�" + Thread.currentThread().getName() + "-->λ��Ϊ" + seats);
			} else {
				System.out.println("��Ʊʧ��" + Thread.currentThread().getName() + "λ�ò���");
			}
		}
	}
}

class Cinema {

	int available;// ���
	String name;// ����

	public Cinema(int available, String name) {
		this.available = available;
		this.name = name;
	}

	// ��Ʊ
	public boolean bookTickets(int seats) {
		System.out.println("����λ��Ϊ�� " + available);
		if (seats > available) {
			return false;
		}
		available -= seats;
		return true;
	}
}
