package thread;
/**
 * 创建继承thread
 * 启动：创建子类对象
 * @author sj
 *
 */
public class StartTread extends Thread{
	@Override
	public void run() {
		for(int i=0;i<20;i++) {
			System.out.println("music");
		}
	}
	public static void main(String[] args) {
		//创建子类对象
		StartTread st=new StartTread();
		//启动
		st.start();
		for (int i = 0; i < 20; i++)
			System.out.println("coding");
	}
}
