package gof23.factory.simpleFactory;
/**
 * �򵥹���ģʽ��
 * @author SJ
 *
 */
public class CarFactory2 {
	public static Car CreateAudi(String type) {
		return new Audi();
	}
	public static Car CreateByd(String type) {
		return new Byd();
	}
}
