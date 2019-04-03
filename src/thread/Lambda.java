package thread;
/**
 * lanmbda表达式简化线程的使用（用一次）
 * @author sj
 *
 */
public class Lambda{
	static class Test implements Runnable {
		//静态内部类
		public void run() {
			for (int i = 0; i < 20; i++) {
				System.out.println("music");
			}
		}
	}
	public static void main(String[] args) {
	//	new Thread(new Test()).start();
		//局部内部内
		class Test2 implements Runnable {
			public void run() {
				for (int i = 0; i < 20; i++) {
					System.out.println("music");
				}
			}
		}
		new Thread(new Test2()).start();
		
		//匿名内部类，必须记住接口或弗雷
		new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 20; i++) {
					System.out.println("music");
				}
			}
		}).start();
		
		//jdk简化lambda
		new Thread(()->{
				for (int i = 0; i < 20; i++) {
					System.out.println("music");
				}
			}
		).start();
	}
}
