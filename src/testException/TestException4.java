package testException;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * �����쳣����3:�����Լ�д�쳣����
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
