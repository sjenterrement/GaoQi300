package thread;

public class BlockJoin2 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("爸爸和儿子买烟的故事");
		new Thread(new Father()).start();
	}
}
class Father extends Thread{
	public void run() {
		System.out.println("没烟\n儿子去买");
		Thread t=new Thread(new Son());
		t.start();
		try {
			t.join();
			System.out.println("老爸接过烟，把零钱给儿子了");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("孩子走丢了");
		}
	}
}
class Son extends Thread{
	public void run() {
		System.out.println("接过老爸的钱出去了");
		System.out.println("路过有个游戏厅，完了10秒");
		for(int i=0;i<10;i++) {
			System.out.println(i+"秒过了");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("赶紧买烟");
		System.out.println("拿一包中华");
	}
}