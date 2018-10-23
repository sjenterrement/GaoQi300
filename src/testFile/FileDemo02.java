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
		
		File src = new File("testFile/报名照片.jpg");
		System.out.println("是否存在："+src.exists());
		System.out.println("是否文件："+src.isFile());
		System.out.println("是否文件夹："+src.isDirectory());
		
		System.out.println("---------------");
		
		src = new File("C:/Users/ASUS/eclipse-workspace/GaoQi300/src/testFile/报名照片.jpg");
		System.out.println("是否存在："+src.exists());
		System.out.println("是否文件："+src.isFile());
		System.out.println("是否文件夹："+src.isDirectory());
		
		System.out.println("----------------");
		
		src= new File("xxx");
		if (!src.exists()) {
			System.out.println("文件不存在");
		} else {
			if (src.isFile()) {
				System.out.println("文件操作");
			} else {
				System.out.println("文件夹操作");
			}
		}
		
	}
}
