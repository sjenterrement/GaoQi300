package thread;
/**
 * 其他方法
 * isAlive
 * currentThread():当前线程
 * getName()：代理名称
 * @author SJ
 *
 */
public class InfoTest {
	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().isAlive());
		//设置名称：真是角色+代理角色
		MyInfo info=new MyInfo("战斗机");
		Thread t =new Thread(info);
		t.setName("公鸡");
		t.start();
		t.sleep(1000);
		System.out.println(t.isAlive()); 
	}
}
class MyInfo implements Runnable{
	private String name;
	
	
	public MyInfo(String name) {
		this.name = name;
	}


	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"-->"+name);
	}
}
