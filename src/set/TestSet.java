package set;

import java.util.HashSet;
import java.util.Set;

/**
 * 测试set常用的方法
 * @author savrina
 *
 */
public class TestSet {
	public static void main(String[] args) {
		Set set =new HashSet();
		set.add("aaa");
		set.add("bbb");
		set.add(new String ("aaa"));
		System.out.println(set.size());
		System.out.println(set.contains("aaa"));
		set.remove("aaa");
		System.out.println(set.size());
	}
}
