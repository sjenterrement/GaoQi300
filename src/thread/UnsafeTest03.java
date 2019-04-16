package thread;

import java.util.ArrayList;
import java.util.List;

/**
 * 线程不安全：取钱
 * 
 * @author SJ
 *
 */
public class UnsafeTest03 {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		for (int i = 0; i < 10000; i++) {
			new Thread(()->{
				list.add(Thread.currentThread().getName());
			}).start();
		}
		
		System.out.println(list.size());
	}
}