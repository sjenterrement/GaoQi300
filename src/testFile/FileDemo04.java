package testFile;

import java.io.File;
import java.io.IOException;

/**
 * ������Ϣ
 * createNewFile()������ʱ�Ŵ���
 * @author SJ
 *
 */
public class FileDemo04 {
	public static void main(String[] args) throws IOException {
		File src = new File("C:\\Users\\ASUS\\eclipse-workspace\\GaoQi300\\src\\testFile\\������Ƭ.jpg");
		boolean flag=src.createNewFile();
		System.out.println(flag);
		
		src = new File("C:\\Users\\ASUS\\eclipse-workspace\\GaoQi300\\src\\testFile\\1.txt");
		flag=src.createNewFile();
		System.out.println(flag);
		
		//���䣺con��com3����ϵͳ���У�������ȷ����
	}
}
