package gof23.sinleton;
/**
 * 测试饿汉式单例模式
 * @author SJ
 *
 */
public class SingletonDemo3 {
	//类初始化时，立即加载这个对象（没有延迟加载的优势），加载类时，天然的是线程安全的！
	private static SingletonDemo3 instance=null;
	
	private SingletonDemo3() {
		
	}
	
	//方法没有同步，调用效率高！
	public static SingletonDemo3 getInstance() {
		if (instance==null) {
			SingletonDemo3 sc;
			synchronized (SingletonDemo3.class) {
				sc=instance;
				if (sc==null) {
					sc=new SingletonDemo3();
				}
			}
			instance=sc;
		}
		return instance;
	}
	
}
