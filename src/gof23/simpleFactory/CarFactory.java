package gof23.simpleFactory;
/**
 * 简单工厂模式下
 * @author SJ
 *
 */
public class CarFactory {
	public static Car CreateFactory(String type) {
		if ("奥迪".equals(type)) {
			return new Audi();
		}else if ("比亚迪".equals(type)) {
			return new Byd();
		}else {
			return null;
		}
	}
}
