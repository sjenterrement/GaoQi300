package gof23.sinleton;
/**
 * 测试懒汉式单例模式（如何防止反射和反序列漏洞）
 * @author SJ
 *
 */
public class SingletonDemo6 {
	//累初始化时，不初始化这个对象（延时加载真正用到的时候再加载）
		private static SingletonDemo6 instance;
		
		private SingletonDemo6(){
			if (instance!=null) {
				throw new RuntimeException();
			}
		}
		
		//方法同步，调用效率低
		public static synchronized SingletonDemo6 getInstance() {
			if (instance==null) {
				instance=new SingletonDemo6();
			}
			return instance;
		}
		
}
