package generics;

/**
 * ����Ϊ����
 * Ҫôͬʱ��������Ҫô������ڸ��������
 * ����������������෺��
 * 1.��������
 * �����У��游�����
 * �����У����������
 * 2.������д
 * �游�����
 * @author savrina
 *
 */

public abstract class Father<T1,T2> {
	T1 name;
	public abstract void test(T1 t);
}

/*
 * ��������ʱָ����������
 * ����Ϊ��������
 * ����ͬ��
 */

class Child1 extends Father<String, Integer>{

	@Override
	public void test(String t) {
		// TODO Auto-generated method stub
		
	}
	
}

/*
 * ����Ϊ�����ͣ�������ʹ��ʱȷ��
 */
class Child2<T1,T2,T3> extends Father<T1,T2>{

	T1 name;
	
	@Override
	public void test(T1 t) {
		// TODO Auto-generated method stub
		
	}
	
}

/*
 * ����Ϊ�����ͣ����಻ָ�����ͣ���object�滻
 */
class Child3<T1,T2> extends Father{

	T1 name;
	@Override
	public void test(Object t) {
		// TODO Auto-generated method stub
		
	}
	
}

/*
 * ����͸���ͬʱ����
 */
class Child4 extends Father{
	String name;
	@Override
	public void test(Object t) {
		// TODO Auto-generated method stub
		
	}
	
}

/*
 *
 *�������ͣ������������ʹ�÷���
class Child5 extends Father<T1, T2>{

	@Override
	public void test(generics.T1 t) {
		// TODO Auto-generated method stub
		
	}
	
}
*/