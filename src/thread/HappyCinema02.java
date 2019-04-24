package thread;

import java.util.ArrayList;
import java.util.List;

public class HappyCinema02 {

	public static void main(String[] args) {
		List<Integer> available=new ArrayList<Integer>();
		available.add(1);
		available.add(2);
		available.add(3);
		available.add(4);
		available.add(5);
		available.add(6);
		available.add(7);
		
		List<Integer> seats1=new ArrayList<Integer>();
		seats1.add(1);
		seats1.add(2);
		List<Integer> seats2=new ArrayList<Integer>();
		seats2.add(3);
		seats2.add(4);
		seats2.add(5);
		
		BtsCinema c = new BtsCinema(available, "BTS");
		new Thread(new HappyCustomer(c, seats1), "�ְ�").start();
		new Thread(new HappyCustomer(c, seats2), "����").start();
	}
}

class HappyCustomer implements Runnable {
	BtsCinema cinema;
	List<Integer> seats;

	public HappyCustomer(BtsCinema cinema, List<Integer> seats) {
		this.cinema = cinema;
		this.seats = seats;
	}

	@Override
	public void run() {
		synchronized (cinema) {
			boolean flag = cinema.bookTickets(seats);
			if (flag) {
				System.out.println("��Ʊ�ɹ�   " + Thread.currentThread().getName() + "-->λ��Ϊ" + seats);
			} else {
				System.out.println("��Ʊʧ��   " + Thread.currentThread().getName() + "λ�ò���");
			}
		}
	}
}

class BtsCinema {

	List<Integer> available;// ���
	String name;// ����

	public BtsCinema(List<Integer> available, String name) {
		this.available = available;
		this.name = name;
	}

	// ��Ʊ
	public boolean bookTickets(List<Integer> seats) {
		System.out.println("welcome "
				+this.name+"��ǰ����λ��Ϊ�� " + available);
		List<Integer> temp=new ArrayList<Integer>();
		temp.addAll(available);
		//���
		temp.removeAll(seats);
		//�жϴ�С
		if(available.size()-temp.size()!=seats.size()) {
			return false;
		}
		//�ɹ�
		available=temp;
		return true;
	}
}
