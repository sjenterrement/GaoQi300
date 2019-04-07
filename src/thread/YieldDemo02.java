package thread;
/**
 * 
 * @author SJ
 *
 */
public class YieldDemo02 {
	public static void main(String[] args) {
		MyYield my=new MyYield();
		new Thread(my).start();
		new Thread(my).start();
	}
}

class MyYield implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"-->star");
		Thread.yield();
		System.out.println(Thread.currentThread().getName()+"-->end");
	}
	
}
