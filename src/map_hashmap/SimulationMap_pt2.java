package map_hashmap;

import java.util.LinkedList;

/**
 * �Զ���map�������棺 ��߲�ѯЧ��
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
					e2.value=value;//�ظ�ֱ�Ӹ���
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
		 sm.put("��", new Idol("��̩��"));
		 sm.put("��", new Idol("��͹�"));
		 sm.put("С������", new Idol("��Դ"));
		 Idol id=(Idol) sm.get("��");
		 System.out.println(id.name);
	}
}
