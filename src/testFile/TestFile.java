package testFile;

import java.io.File;
import java.io.IOException;

/**
 * ≤‚ ‘file¿‡
 * 
 * @author savrina
 *
 */

public class TestFile {

	public static void main(String[] args) {
		File f = new File("f:/TEST");
		File f1 = new File(f, "test1.java");
		try {
			f1.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		File f2=new File("f:/TEST/a/b/c");
		f2.mkdirs();
//		f1.delete();\
		
		if (f1.isFile()) {
			System.out.println("yes1");
		}
		
		if (f2.isDirectory()) {
			System.out.println("yes2");
		}
	}

}
