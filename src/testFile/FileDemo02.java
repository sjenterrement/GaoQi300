package testFile;

import java.io.File;

/**
 * isFile()
 * ifDirectory()
 * @author SJ
 *
 */
public class FileDemo02 {
	public static void main(String[] args) {
		
		File src = new File("testFile/������Ƭ.jpg");
		System.out.println("�Ƿ���ڣ�"+src.exists());
		System.out.println("�Ƿ��ļ���"+src.isFile());
		System.out.println("�Ƿ��ļ��У�"+src.isDirectory());
		
		System.out.println("---------------");
		
		src = new File("C:/Users/ASUS/eclipse-workspace/GaoQi300/src/testFile/������Ƭ.jpg");
		System.out.println("�Ƿ���ڣ�"+src.exists());
		System.out.println("�Ƿ��ļ���"+src.isFile());
		System.out.println("�Ƿ��ļ��У�"+src.isDirectory());
		
		System.out.println("----------------");
		
		src= new File("xxx");
		if (!src.exists()) {
			System.out.println("�ļ�������");
		} else {
			if (src.isFile()) {
				System.out.println("�ļ�����");
			} else {
				System.out.println("�ļ��в���");
			}
		}
		
	}
}
