package testFile;

import java.io.File;
import java.io.IOException;

/**
 * 其他信息
 * createNewFile()不存在时才创建
 * @author SJ
 *
 */
public class FileDemo04 {
	public static void main(String[] args) throws IOException {
		File src = new File("C:\\Users\\ASUS\\eclipse-workspace\\GaoQi300\\src\\testFile\\报名照片.jpg");
		boolean flag=src.createNewFile();
		System.out.println(flag);
		
		src = new File("C:\\Users\\ASUS\\eclipse-workspace\\GaoQi300\\src\\testFile\\1.txt");
		flag=src.createNewFile();
		System.out.println(flag);
		
		//补充：con，com3操作系统已有，不能正确创建
	}
}
