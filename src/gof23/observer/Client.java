package gof23.observer;

public class Client {

	public static void main(String[] args) {

		ConcreteSubject subject = new ConcreteSubject();

		Observer_A a1 = new Observer_A();
		Observer_A a2 = new Observer_A();
		Observer_A a3 = new Observer_A();

		subject.register(a1);
		subject.register(a2);
		subject.register(a3);

		subject.setState(20);

		System.out.println(a1.getMystate());
		System.out.println(a2.getMystate());
		System.out.println(a3.getMystate());

		System.out.println("一年之后");

		subject.setState(21);

		System.out.println(a1.getMystate());
		System.out.println(a2.getMystate());
		System.out.println(a3.getMystate());
	}

}
