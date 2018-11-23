package gof23.adapter;
/**
 * 对象适配器方式，采用组合的方式跟被适配者组合
 * @author SJ
 *
 */
public class Adapter implements Target{

	private Adaptee adaptee;
	
	public Adapter(Adaptee adaptee) {
		super();
		this.adaptee = adaptee;
	}
	
	@Override
	public void handleReq() {
		adaptee.request();
	}

	
}
