package thread;
/**
 * �����̳�thread
 * �����������������
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
		//�����������
		StartTread st=new StartTread();
		//����
		st.start();
		for (int i = 0; i < 20; i++)
			System.out.println("coding");
	}
}
