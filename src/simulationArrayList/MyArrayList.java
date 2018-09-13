package simulationArrayList;

/**
 * 模拟实现JDK中提供的ArrayList类
 * 
 * @author savrina
 *
 */

public class MyArrayList {
	/**
	 * the value is used for object storage.
	 */
	private Object[] value;

	/**
	 * the size is the number of object used
	 */
	private int size;

	public MyArrayList() {
		// TODO Auto-generated constructor stub
		this(10);
	}

	public MyArrayList(int size) {
		if (size < 0) {
			try {
				throw new Exception();// 先随便丢个异常
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		}
		value = new Object[size];
	}

	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public void add(Object obj) {
		value[size]=obj;
		size++;
		if (size>=value.length) {
			//装不下了，需扩容
			int newCapcity=value.length*2;
			Object[] newList=new Object[newCapcity];
			
			for (int i = 0; i < value.length; i++) {
				newList[i]=value[i];
			}
			
			value=newList;
		}
	}
	
	public Object get(int index) {
		rangeCheck(index);
		return value[index];
	}
	
	public int indexOf(Object obj) {
		if (obj==null) {
			return -1;
		}else {
			for (int i = 0; i < value.length; i++) {
				if (obj==value[i]) {
					return i;
				}
			}
			return -1;
		}
	}
	
	public int lastIndexOf(Object obj) {
		if (obj==null) {
			return -1;
		}else {
			for (int i = value.length-1; i >=0; i++) {
				if (obj==value[i]) {
					return i;
				}
			}
			return -1;
		}
	}
	
	public Object set(int index, Object object) {
		rangeCheck(index);
		Object old =value[index];
		value[index]=object;
		return old;
	}

	public void rangeCheck(int index) {
		// TODO Auto-generated method stub
		if (index<0||index>size-1) {
			try {
				throw new Exception();//手动抛出一个异常
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		}
	}
	
	public static void main(String[] args) {
		MyArrayList list =new MyArrayList();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		System.out.println(list.size());
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.isEmpty());
	}
	
	
}
