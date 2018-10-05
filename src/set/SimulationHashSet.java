package set;

import java.util.HashMap;

/**
 * 模拟jdk里的set
 * @author savrina
 *
 */
public class SimulationHashSet {
	HashMap map;
	private static final Object PRESENT=new Object();
	
	public SimulationHashSet() {
		map=new HashMap();
	}
	public int size() {
		return map.size();
	}
	public void add(Object o) {//利用了map里键对象不可重复的
		map.put(o, PRESENT);
	}
	public static void main(String[] args) {
		SimulationHashSet ss=new SimulationHashSet();
		ss.add("aaa");
		System.out.println(ss.size());
	}
}
