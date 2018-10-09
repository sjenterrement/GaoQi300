package generics;

/**
 * 父类为泛型
 * 要么同时及擦除，要么子类大于父类的类型
 * 不能子类擦出，父类泛型
 * 1.属性类型
 * 父类中，随父类而定
 * 子类中，随子类而定
 * 2.方法重写
 * 随父类而定
 * @author savrina
 *
 */

public abstract class Father<T1,T2> {
	T1 name;
	public abstract void test(T1 t);
}

/*
 * 子类声明时指定具体类型
 * 属性为具体类型
 * 方法同理
 */

class Child1 extends Father<String, Integer>{

	@Override
	public void test(String t) {
		// TODO Auto-generated method stub
		
	}
	
}

/*
 * 子类为泛类型，子类在使用时确定
 */
class Child2<T1,T2,T3> extends Father<T1,T2>{

	T1 name;
	
	@Override
	public void test(T1 t) {
		// TODO Auto-generated method stub
		
	}
	
}

/*
 * 子类为泛类型，父类不指定类型，用object替换
 */
class Child3<T1,T2> extends Father{

	T1 name;
	@Override
	public void test(Object t) {
		// TODO Auto-generated method stub
		
	}
	
}

/*
 * 子类和父类同时擦除
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
 *错误类型：子类擦除父类使用泛型
class Child5 extends Father<T1, T2>{

	@Override
	public void test(generics.T1 t) {
		// TODO Auto-generated method stub
		
	}
	
}
*/