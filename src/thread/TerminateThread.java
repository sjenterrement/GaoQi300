package thread;
/**
 * ��ֹ�߳�
 * 1.�߳�����ִ�����--������
 * 2.�ⲿ����--�������־
 * ��Ҫʹ��stop destroy
 * @author SJ
 *
 */
public class TerminateThread implements Runnable{
	public TerminateThread(String name) {
		super();
		this.name = name;
	}
	//�����ʶ ��־�߳����Ƿ��������
	private boolean flag=true;
	private String name;
	
	
	
	@Override
	public void run() {
		int i=0;
		// ������ʶΪtrue--�����У�false--��������
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
