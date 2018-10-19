package simulationArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;



/**
 * collection类的辅助类使用
 * collection是接口，collections是工具类
 * @author savrina
 *
 */

public class TestCollection {
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add("jungkook:"+i);
		}
		System.out.println(list);
		
		Collections.shuffle(list);//随机排列list中的元素
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);
		
		System.out.println(Collections.binarySearch(list, "jungkook:1"));//二分查找，或者：折半查找 
	}
}
