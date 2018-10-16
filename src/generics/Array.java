package generics;

/**
 * 泛型没有数组
 * @author savrina
 *
 */

public class Array {
	public static void main(String[] args) {
		Integer[] arr = new Integer[10];
//		Student<String>[] arr2 = new Student<String>[];
		
		MyArrayList<String> list = new MyArrayList<String>();
		list.add(0, "a");
		String elem = list.getElem(0);
		System.out.println(elem);
		
	}
}
class MyArrayList<E>{
	Object[] cap = new Object[10];
	
	public void add(int ids,E e) {
		cap[ids]=e;
	}
	
	@SuppressWarnings("unchecked")
	public E[] getAll() {
		return (E[]) cap;
	}
	
	@SuppressWarnings("unchecked")
	public E getElem(int ids) {
		return (E) cap[ids];
	}
}
