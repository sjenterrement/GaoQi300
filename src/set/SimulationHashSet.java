package set;

import java.util.HashMap;

/**
 * ģ��jdk���set
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
	public void add(Object o) {//������map������󲻿��ظ���
		map.put(o, PRESENT);
	}
	public static void main(String[] args) {
		SimulationHashSet ss=new SimulationHashSet();
		ss.add("aaa");
		System.out.println(ss.size());
	}
}
