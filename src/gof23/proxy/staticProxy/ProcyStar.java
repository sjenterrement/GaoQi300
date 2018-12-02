package gof23.proxy.staticProxy;

public class ProcyStar implements Star{
	
	private RealStar realStar;
	
	

	public ProcyStar() {
		realStar=new RealStar();
	}

	@Override
	public void confer() {
		System.out.println("ProcyStar.confer");
	}

	@Override
	public void signContract() {
		System.out.println("ProcyStar.signContract");
	}

	@Override
	public void bookTicket() {
		System.out.println("ProcyStar.bookTicket");
	}

	@Override
	public void sing() {
		realStar.sing();
	}

	@Override
	public void CollectMoney() {
		System.out.println("ProcyStar.CollectMoney");
	}

}
