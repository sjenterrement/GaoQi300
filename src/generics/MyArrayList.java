package generics;

import java.util.Iterator;

class MyArrayList {
	private String[] elem= {"a","b","c","d","e","f","g"};
	private int size=elem.length;
	
	private class MyIt implements Iterator<String>{
		private int cursor=-1;
		/**
		 * 判断是否存在下一个元素
		 */
		public boolean hasNext() {
			return cursor+1<size;
		}
		
		public String next() {
			cursor++;
			return elem[cursor];
		}
		
		public void remove() {
			
		}
		
		public Iterator<String> iterator(){
			return new MyIt();
		}
		
		public static void main(String[] args) {
			MyArrayList list=new MyArrayList();
			Iterator<String>
			
		}
	}
}
