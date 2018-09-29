package map_hashmap;

/**
 * 自定义实现的功能
 * 
 * @author savrina
 *
 */

public class SimulationMap_pt1 {

	MapElement[] m = new MapElement[990];
	int size;

	public void put(Object key, Object value) {
        MapElement me = new MapElement(key, value);
		// 解决键值相同的情况
		for (int i = 0; i < size; i++) {
			if (m[i].key.equals(key)) {
				m[i].value = value;
				return;
			}
		}

		// 键值不相同时
		
		m[size++] = me;
	}

	public Object get(Object key) {
		for (int i = 0; i < size; i++) {
			if (m[i].key.equals(key)) {
				return m[i].value;
			}
		}
		return null;
	}

	public boolean containsKey(Object key) {
		for (int i = 0; i < size; i++) {
			if (m[i].key.equals(key)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean containsValue(Object value) {
		for (int i = 0; i < size; i++) {
			if (m[i].value.equals(value)) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		 SimulationMap_pt1 sm=new SimulationMap_pt1();
		 sm.put("我", new Idol("田柾国"));
		 sm.put("小蒙奇奇", new Idol("王源"));
		 Idol id=(Idol) sm.get("我");
		 System.out.println(id.name);
	}
}

class MapElement {
	Object key;
	Object value;
	
	public MapElement() {
		// TODO Auto-generated constructor stub
	}

	public MapElement(Object key, Object value) {
		super();
		this.key = key;
		this.value = value;
	}

	
}