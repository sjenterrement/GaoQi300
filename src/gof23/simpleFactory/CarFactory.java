package gof23.simpleFactory;
/**
 * �򵥹���ģʽ��
 * @author SJ
 *
 */
public class CarFactory {
	public static Car CreateFactory(String type) {
		if ("�µ�".equals(type)) {
			return new Audi();
		}else if ("���ǵ�".equals(type)) {
			return new Byd();
		}else {
			return null;
		}
	}
}
