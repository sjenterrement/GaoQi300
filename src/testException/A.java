package testException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParsePosition;

/**
 * 测试异常的继承
 * 
 * @author savrina
 *
 */
class A {
	public void method() throws IOException {
	}
}

class B extends A {
	public void method() {
	}
}

class C extends A {
	public void method() throws FileNotFoundException {}
}

class D extends A {
	public void method() throws IOException,FileNotFoundException{}
}

class E extends A {
	public void method() throws IOException,ArithmeticException{}
}

class F extends A{
	public void method() throws IOException,ParsePosition{}
}


/*
 * 方法重写中异常声明原则：
 * 1.父类没有声明异常，子类也不能
 * 2.不可抛除原有方法抛出异常类的父类或上层类
 * 3.抛出异常类型的数目不可以比原有方法抛出的还多（不是个数）
*/

