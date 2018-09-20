package testException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestException2 {
	public static void main(String[] args) {
		// FileReader reader=null;

		FileReader reader = null;
		try {
			reader = new FileReader("f:/TEST/a.txt");
			char temp = (char) reader.read();
			System.out.println("读出内容：" + temp);
		} catch (FileNotFoundException e) {
			System.out.println("文件没有找到");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("文件读取错误");
			e.printStackTrace();
		} finally {
			System.out.println("不管有没有异常，我都会被执行");
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
