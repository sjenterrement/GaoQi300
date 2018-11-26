package gof23.bridge;

public class Client {
	public static void main(String[] args) {
		// ���ۻ�˶�ʼǱ�����
		Computer c = new Laptop(new Asua());
		c.sale();

		// ���ۻ���̨ʽ����
		Computer c2 = new Desktop(new Hp());
		c2.sale();
	}
}
