package generics;

public interface Comparable<T> {
	void test();
}
/*
 *制定具体类型
 */
class comp1 implements Comparable<String> {

	@Override
	public void test() {
		// TODO Auto-generated method stub

	}

}

/*
 * 父类擦除
 */
class comp2<T> implements Comparable {

	@Override
	public void test() {
		// TODO Auto-generated method stub

	}

}

/*
 * 子类父类都擦除
 */
class comp3 implements Comparable {

	@Override
	public void test() {
		// TODO Auto-generated method stub

	}

}

/*
 * 子类》=父类
 */
class comp4<T> implements Comparable<T> {

	@Override
	public void test() {
		// TODO Auto-generated method stub

	}
}
