package testFile;

import java.io.File;

/**
 * getName()
 * getPath()
 * getAbsolutePath()
 * getParent()
 * getParentFile()
 * @author SJ
 *
 */
public class FileDemo01 {
	public static void main(String[] args) {
		File src = new File("C:/Users/ASUS/eclipse-workspace/GaoQi300/src/testFile/������Ƭ.jpg");
		
		System.out.println("���ƣ�"+src.getName());
		System.out.println("·����"+src.getPath());
		System.out.println("����·����"+src.getAbsolutePath());
		System.out.println("��·����"+src.getParent());
		System.out.println("������"+src.getParentFile().getParent());
	}
	
	
}
