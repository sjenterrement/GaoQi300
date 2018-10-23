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
		File src = new File("C:/Users/ASUS/eclipse-workspace/GaoQi300/src/testFile/报名照片.jpg");
		
		System.out.println("名称："+src.getName());
		System.out.println("路径："+src.getPath());
		System.out.println("绝对路径："+src.getAbsolutePath());
		System.out.println("父路径："+src.getParent());
		System.out.println("父对象："+src.getParentFile().getParent());
	}
	
	
}
