package generics;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试1.7泛型
 * @author savrina
 *
 */

public class Test7 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		List<String> list2 = new ArrayList<>();//可省略创建时的类型
	}
}
