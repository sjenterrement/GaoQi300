package gof23.factory.simpleFactory;
/**
 * 简单工厂模式下
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
