package map_hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * ����map��hashmap�Ļ����÷�
 * @author savrina
 *
 */

public class TestHashmap {
	public static void main(String[] args) {
		Map map=new HashMap();
		map.put("��", new Idol("��͹�"));
		map.put("С������",new Idol("��Դ"));
		
		Idol idol=(Idol) map.get("С������");
		
		System.out.println(idol.name);
	}
}
class Idol{
	String name;
	public Idol(String name) {
		this.name=name;
	}
	
}
