package testFile;

import java.io.File;

/**
 * ������Ϣ
 * @author SJ
 *
 */
public class FileDemo03 {
	public static void main(String[] args) {
		File src = new File("C:\\Users\\ASUS\\eclipse-workspace\\GaoQi300\\src\\testFile\\������Ƭ.jpg");
		System.out.println(src.length());
		
		src = new File("C:\\Users\\ASUS\\eclipse-workspace\\GaoQi300\\src\\testFile");
		System.out.println(src.length());
		
		src = new File("C:\\Users\\ASUS\\eclipse-workspace\\GaoQi300\\src\\testFile01");
		System.out.println(src.length());
	}
}
