package gof23.adapter;

public class Client {
	public void test(Target t) {
		t.handleReq();
	}

	public static void main(String[] args) {
		Client client = new Client();
		Adaptee adaptee = new Adaptee();
		Target target = new Adapter(adaptee);
		client.test(target);
	}
}
