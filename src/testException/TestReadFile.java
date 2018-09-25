package testException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 处理异常的的方式2
 * 
 * @author savrina
 *
 */

public class TestReadFile {
	public static void main(String[] args) {
		String str;
		try {
			str=new TestReadFile().openFile();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}String openFile() throws FileNotFoundException,IOException{
	FileReader reader=new FileReader("f:/TEST");
	char c=(char) reader.read();
	System.out.println(c);
	return ""+c;
			}

}
