package testException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * ����try����catch����
 * 
 * @author savrina
 *
 */

public class TestException3 {
	public static void main(String[] args) {
		String str = new TestException3().openFile();
	}

	String openFile() {
		System.out.println("aaa");
		try {
			FileInputStream fis = new FileInputStream("f:/TEST/a.txt");// checked
			int a = fis.read();
			System.out.println("bbb");
			return "step1";
		} catch (FileNotFoundException e) {
			System.out.println("catching");
			e.printStackTrace();
			return "step2";// ��ȷ�����ص�ֵ��������ֱ�ӽ�������
		} catch (IOException e) {
			e.printStackTrace();
			return "step3";
		} finally {
			System.out.println("finally");
//		    return "fff";//��Ҫ��finally�� ʹ��return
		}
	}

}

//1.ִ��try��catch��������ֵ��ֵ
//2.ִ��finally
//3.return