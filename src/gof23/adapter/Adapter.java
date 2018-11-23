package gof23.adapter;
/**
 * ������������ʽ��������ϵķ�ʽ�������������
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
