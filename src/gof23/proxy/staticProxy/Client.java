package gof23.proxy.staticProxy;

public class Client {
	public static void main(String[] args) {
		ProcyStar p1=new ProcyStar();
		p1.confer();
		p1.signContract();
		p1.bookTicket();
		p1.CollectMoney();
		
		p1.sing();
	}
}
