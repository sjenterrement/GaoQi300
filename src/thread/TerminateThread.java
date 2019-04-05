package thread;
/**
 * 终止线程
 * 1.线程正常执行完毕--》次数
 * 2.外部干涉--》加入标志
 * 不要使用stop destroy
 * @author SJ
 *
 */
public class TerminateThread implements Runnable{
	public TerminateThread(String name) {
		super();
		this.name = name;
	}
	//加入标识 标志线程体是否可以运行
	private boolean flag=true;
	private String name;
	
	
	
	@Override
	public void run() {
		int i=0;
		// 关联标识为true--》运行，false--》不运行
		while(flag)
			System.out.println(name+"-->"+i++);
	}
	
	public void teminate() {
		this.flag=false;
	}
	
	public static void main(String[] args) {
		TerminateThread tt=new TerminateThread("jungkook");
		new Thread(tt).start();
		
		for (int i = 0; i < 100; i++) {
			if(i==88) {
				tt.teminate();
				System.out.println("jungkook enough");
			}
			System.out.println("main-->"+i);
		}
	}

}
