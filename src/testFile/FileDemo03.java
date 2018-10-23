package testFile;

import java.io.File;

/**
 * 其他信息
 * @author SJ
 *
 */
public class FileDemo03 {
	public static void main(String[] args) {
		File src = new File("C:\\Users\\ASUS\\eclipse-workspace\\GaoQi300\\src\\testFile\\报名照片.jpg");
		System.out.println(src.length());
		
		src = new File("C:\\Users\\ASUS\\eclipse-workspace\\GaoQi300\\src\\testFile");
		System.out.println(src.length());
		
		src = new File("C:\\Users\\ASUS\\eclipse-workspace\\GaoQi300\\src\\testFile01");
		System.out.println(src.length());
	}
}
