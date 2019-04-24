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
		new Thread(new HappyCustomer(c, seats1), "爸爸").start();
		new Thread(new HappyCustomer(c, seats2), "儿子").start();
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
				System.out.println("出票成功   " + Thread.currentThread().getName() + "-->位置为" + seats);
			} else {
				System.out.println("出票失败   " + Thread.currentThread().getName() + "位置不够");
			}
		}
	}
}

class BtsCinema {

	List<Integer> available;// 金额
	String name;// 名称

	public BtsCinema(List<Integer> available, String name) {
		this.available = available;
		this.name = name;
	}

	// 购票
	public boolean bookTickets(List<Integer> seats) {
		System.out.println("welcome "
				+this.name+"当前可用位置为： " + available);
		List<Integer> temp=new ArrayList<Integer>();
		temp.addAll(available);
		//相见
		temp.removeAll(seats);
		//判断大小
		if(available.size()-temp.size()!=seats.size()) {
			return false;
		}
		//成功
		available=temp;
		return true;
	}
}
