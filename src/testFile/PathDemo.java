package testFile;

import java.io.File;

/**
 *\   /���ʷָ��� separator
 * @author SJ
 *
 */
public class PathDemo {
	public static void main(String[] args) {
		String path="C:\\Users\\ASUS\\eclipse-workspace\\GaoQi300\\src\\testFile\\������Ƭ.jpg";
		System.out.println(File.separatorChar);
		
		//����
		//1.
		path="C:/Users/ASUS/eclipse-workspace/GaoQi300/src/testFile/������Ƭ.jpg";
		System.out.println(path);
		
		//2.����ƴ��
		path="C:"+File.separator+"Users"+File.separator+"ASUS"+File.separator+"eclipse-workspace"+File.separator+"GaoQi300"+File.separator
				+"src"+File.separator+"testFile"+File.separator+"������Ƭ.jpg";
		System.out.println(path);
	}
}
