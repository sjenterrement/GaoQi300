package generics;

public interface Comparable<T> {
	void test();
}
/*
 *�ƶ���������
 */
class comp1 implements Comparable<String> {

	@Override
	public void test() {
		// TODO Auto-generated method stub

	}

}

/*
 * �������
 */
class comp2<T> implements Comparable {

	@Override
	public void test() {
		// TODO Auto-generated method stub

	}

}

/*
 * ���ุ�඼����
 */
class comp3 implements Comparable {

	@Override
	public void test() {
		// TODO Auto-generated method stub

	}

}

/*
 * ���ࡷ=����
 */
class comp4<T> implements Comparable<T> {

	@Override
	public void test() {
		// TODO Auto-generated method stub

	}
}
