package testException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 测试try。。catch。。
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
			return "step2";// 先确定返回的值，并不会直接结束运行
		} catch (IOException e) {
			e.printStackTrace();
			return "step3";
		} finally {
			System.out.println("finally");
//		    return "fff";//不要在finally内 使用return
		}
	}

}

//1.执行try，catch。给返回值赋值
//2.执行finally
//3.return