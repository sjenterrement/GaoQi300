package gof23.bridge;

public class Client {
	public static void main(String[] args) {
		// 销售华硕笔记本电脑
		Computer c = new Laptop(new Asua());
		c.sale();

		// 销售惠普台式电脑
		Computer c2 = new Desktop(new Hp());
		c2.sale();
	}
}
