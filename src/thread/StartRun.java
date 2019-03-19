package thread;
/**
 * 实现runnable+重写run
 * 启动：创建实现类对象+thread对象+start
 * 推荐：避免单继承的局限性，优先使用接口
 * 方便共享资源
 * @author sj
 *
 */
public class StartRun implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<20;i++) {
			System.out.println("music");
		}
	}
	public static void main(String[] args) {
//		//创建实现对象
//		StartRun sr=new StartRun();
//		//创建代理类对象
//		Thread t=new Thread(sr);
//		//启动
//		t.start();
		
		new Thread(new StartRun()).start();
		
		for (int i = 0; i < 20; i++)
			System.out.println("coding");
	}
}
