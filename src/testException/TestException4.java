package testException;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * 测试异常方法3:可以自己写异常处理
 * @author savrina
 *
 */

public class TestException4 {
	public static void main(String[] args) {
		File f=new File("f:/Test");
	if (!f.exists()) {
		try {
			throw new FileNotFoundException("FileNotFoundException");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
	
}
