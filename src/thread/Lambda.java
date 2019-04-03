package thread;
/**
 * lanmbda���ʽ���̵߳�ʹ�ã���һ�Σ�
 * @author sj
 *
 */
public class Lambda{
	static class Test implements Runnable {
		//��̬�ڲ���
		public void run() {
			for (int i = 0; i < 20; i++) {
				System.out.println("music");
			}
		}
	}
	public static void main(String[] args) {
	//	new Thread(new Test()).start();
		//�ֲ��ڲ���
		class Test2 implements Runnable {
			public void run() {
				for (int i = 0; i < 20; i++) {
					System.out.println("music");
				}
			}
		}
		new Thread(new Test2()).start();
		
		//�����ڲ��࣬�����ס�ӿڻ���
		new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 20; i++) {
					System.out.println("music");
				}
			}
		}).start();
		
		//jdk��lambda
		new Thread(()->{
				for (int i = 0; i < 20; i++) {
					System.out.println("music");
				}
			}
		).start();
	}
}
