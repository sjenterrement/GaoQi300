package simulationLinkedList;

/**
 * 模拟jdk的linkedlist
 * @author savrina
 *
 */
public class SimulationLinkedList {
	private Node first;
	private Node last;
	
	private int size;
	
	 public void add(Object obj) {
		 Node n=new Node();
		if (first==null) {
			n.setPrevious(null);
			n.setObj(obj);
			n.setNext(null);
			
			first=n;
		}else {
			//直接往last后面加节点
			n.setPrevious(last);
			n.setObj(obj);
			n.setNext(null);
			
			last=n;
		}
		size++;
	}
	 
	 public static void main(String[] args) {
		SimulationLinkedList list=new SimulationLinkedList();
		list.add("aaa");
		list.add("bbb");
		System.out.println(list.size());
	}

	public int size() {
		
		return size;
	}
}
