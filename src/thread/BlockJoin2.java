package thread;

public class BlockJoin2 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("�ְֺͶ������̵Ĺ���");
		new Thread(new Father()).start();
	}
}
class Father extends Thread{
	public void run() {
		System.out.println("û��\n����ȥ��");
		Thread t=new Thread(new Son());
		t.start();
		try {
			t.join();
			System.out.println("�ϰֽӹ��̣�����Ǯ��������");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("�����߶���");
		}
	}
}
class Son extends Thread{
	public void run() {
		System.out.println("�ӹ��ϰֵ�Ǯ��ȥ��");
		System.out.println("·���и���Ϸ��������10��");
		for(int i=0;i<10;i++) {
			System.out.println(i+"�����");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("�Ͻ�����");
		System.out.println("��һ���л�");
	}
}