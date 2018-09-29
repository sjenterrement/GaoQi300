package map_hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * 测试map和hashmap的基本用法
 * @author savrina
 *
 */

public class TestHashmap {
	public static void main(String[] args) {
		Map map=new HashMap();
		map.put("我", new Idol("田柾国"));
		map.put("小蒙奇奇",new Idol("王源"));
		
		Idol idol=(Idol) map.get("小蒙奇奇");
		
		System.out.println(idol.name);
	}
}
class Idol{
	String name;
	public Idol(String name) {
		this.name=name;
	}
	
}
