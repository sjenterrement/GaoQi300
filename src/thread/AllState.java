package thread;

import java.lang.Thread.State;

public class AllState {
	public static void main(String[] args) {
		Thread t=new Thread(()->{
			for(int i=0;i<5;i++)
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			System.out.println("......");
		});
		//¹Û²ì×´Ì¬
		State state =t.getState();
		System.out.println(state);//new
		
		t.start();
		state=t.getState();//runnable
		System.out.println(state);
		
		while(true) {
			int num=Thread.activeCount();
			System.out.println(num);
			if(num==1)
				break;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			state=t.getState();//timed_waiting
			System.out.println(state);
		}
//		state=t.getState();//TERMINATED
//		System.out.println(state);
	}
}
