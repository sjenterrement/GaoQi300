package thread;

/**
 * 
 * ��̬����
 * 1.��ʵ��ɫ
 * 2.�����ɫ
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
//��ʵ��ɫ
class You implements Marry{

	@Override
	public void happyMary() {
		System.out.println("you and ������ǲ����ܵ�");
	}
}
//�����ɫ
class WeddingCompany implements Marry{
	//��ʵ��ɫ
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
		System.out.println("��Ҳ����");
	}

	private void ready() {
		System.out.println("���ƻ�");
	}
	
}