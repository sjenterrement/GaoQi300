package testException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParsePosition;

/**
 * �����쳣�ļ̳�
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
 * ������д���쳣����ԭ��
 * 1.����û�������쳣������Ҳ����
 * 2.�����׳�ԭ�з����׳��쳣��ĸ�����ϲ���
 * 3.�׳��쳣���͵���Ŀ�����Ա�ԭ�з����׳��Ļ��ࣨ���Ǹ�����
*/

