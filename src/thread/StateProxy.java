package thread;

/**
 * 
 * 静态代理
 * 1.真实角色
 * 2.代理角色
 * @author SJ
 *
 */
public class StateProxy {
	public static void main(String[] args) {
		new WeddingCompany(new You()).happyMary();
	}
}
interface Marry{
	void happyMary();
}
//真实角色
class You implements Marry{

	@Override
	public void happyMary() {
		System.out.println("you and 结婚那是不可能的");
	}
}
//代理角色
class WeddingCompany implements Marry{
	//真实角色
	private Marry target;
	public WeddingCompany(Marry target) {
		this.target=target;
	}
	
	@Override
	public void happyMary() {
		ready();
		this.target.happyMary();
		after();
	}

	private void after() {
		System.out.println("逼也不结");
	}

	private void ready() {
		System.out.println("被逼婚");
	}
	
}