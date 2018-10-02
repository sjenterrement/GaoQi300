package map_hashmap;

import java.util.LinkedList;

/**
 * 自定义map的升级版： 提高查询效率
 * 
 * @author savrina
 *
 */

public class SimulationMap_pt2 {

	LinkedList[] arr = new LinkedList[999];

	int size;

	public void put(Object key,Object value) {
		MapElement e=new MapElement(key, value);
		
		int hash=key.hashCode();
		hash=hash<0?-hash:hash;
		
		int addr=hash%arr.length;
		if (arr[addr]==null) {
			LinkedList list=new LinkedList();
			arr[addr]=list;
			list.add(e);
		}else {
			LinkedList list=arr[addr];
			for (int i = 0; i < list.size(); i++) {
				MapElement e2=(MapElement) list.get(i);
				if (e2.key.equals(key)) {
					e2.value=value;//重复直接覆盖
					return;
				}
			}
			arr[addr].add(e);
		}
	}
	
	public Object get(Object key) {
		int addr=key.hashCode()%arr.length;
		if (arr[addr]!=null) {
			LinkedList list=arr[addr];
			for (int i = 0; i < list.size(); i++) {
				MapElement e=(MapElement) list.get(i);
				if (e.key.equals(key)) {
					return e.value;
				}
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		 SimulationMap_pt1 sm=new SimulationMap_pt1();
		 sm.put("我", new Idol("李泰民"));
		 sm.put("我", new Idol("田柾国"));
		 sm.put("小蒙奇奇", new Idol("王源"));
		 Idol id=(Idol) sm.get("我");
		 System.out.println(id.name);
	}
}
