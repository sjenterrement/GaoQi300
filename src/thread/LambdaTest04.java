package thread;

/**
 * lambda推到+加入参数+返回值
 * 
 * @author SJ
 *
 */
public class LambdaTest04 {
	public static void main(String[] args) {
		new Thread(()->{
			for(int i=0;i<100;i++) {
				System.out.println("一边学习lambda");
			}
		}).start();
		
		new Thread(()->System.out.println("一边奔溃")).start();
		
	}
}