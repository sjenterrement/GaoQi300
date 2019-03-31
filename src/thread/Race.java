package thread;
/**
 * 模拟龟兔赛跑
 * @author SJ
 *
 */
public class Race implements Runnable{
	private String winner;//胜利者
	@Override
	public void run() {
		for (int steps = 1; steps <= 100; steps++) {
			if(Thread.currentThread().getName().equals("rabbit")&&steps%10==0)
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			System.out.println(Thread.currentThread().getName()+"-->"+steps);
			//比赛是否结束
			boolean flag=gameOver(steps);
			if(flag)
				break;
		}
	}
	private boolean gameOver(int steps) {
		if(winner!=null)
			return true;
		else {
			if(steps==100) {
				winner=Thread.currentThread().getName();
				System.out.println("winner-->"+winner);
				return true;
			}	
		}
		return false;
	}
	public static void main(String[] args) {
		Race race=new Race();
		new Thread(race,"tortoise").start();
		new Thread(race,"rabbit").start();
	}
}
