package simulationLinkedList;

/**
 * 模拟jdk的linkedlist
 * 
 * @author savrina
 *
 */
public class SimulationLinkedList {
	private Node first;
	private Node last;

	private int size;

	public int size() {

		return size;
	}

	public Node iterator(int index) {
		Node temp = null;
		if (first != null) {
			if (index<(size>>1)) {
				temp = first;
			for (int i = 0; i < index; i++) {
				temp = temp.next;
			}
			}else {
				temp=last;
				for (int i = size-1; i < index; i--) {
					temp=temp.previous;
				}
			}
			
		}
		return temp;
	}

	private void rangeCheck(int index) {
		// TODO Auto-generated method stub
		if (index < 0 || index > size - 1) {
			try {
				throw new Exception();// 手动抛出一个异常
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}

		}
	}

	private Object get(int index) {
		rangeCheck(index);

		Node temp = iterator(index);
		if (temp != null) {
			return temp.obj;
		}
		return null;
	}

	public void add(Object obj) {
		Node n = new Node();
		if (first == null) {
			n.setPrevious(null);
			n.setObj(obj);
			n.setNext(null);

			first = n;
		} else {
			// 直接往last后面加节点
			n.setPrevious(last);
			n.setObj(obj);
			n.setNext(null);

			last = n;
		}
		size++;
	}

	public void add(int index, Object obj) {
		Node temp = iterator(index);

		Node newNode = new Node();
		newNode.obj = obj;

		if (temp != null) {
			Node left = temp.previous;
			left.next = newNode;

			Node right = temp.next;
			right.previous = newNode;

			size++;
		}
	}

	public void remove(int index) {
		rangeCheck(index);

		Node temp = iterator(index);
		if (temp != null) {
			Node left = temp.previous;
			Node right = temp.next;
			left.next = right;
			right.previous = left;

			size--;
		}
	}

	public static void main(String[] args) {
		SimulationLinkedList list = new SimulationLinkedList();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("ddd");
		System.out.println(list.get(1));
		System.out.println(list.size());
	}
}
