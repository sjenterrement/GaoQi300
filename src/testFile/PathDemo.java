package testFile;

import java.io.File;

/**
 *\   /名词分隔符 separator
 * @author SJ
 *
 */
public class PathDemo {
	public static void main(String[] args) {
		String path="C:\\Users\\ASUS\\eclipse-workspace\\GaoQi300\\src\\testFile\\报名照片.jpg";
		System.out.println(File.separatorChar);
		
		//建议
		//1.
		path="C:/Users/ASUS/eclipse-workspace/GaoQi300/src/testFile/报名照片.jpg";
		System.out.println(path);
		
		//2.常量拼接
		path="C:"+File.separator+"Users"+File.separator+"ASUS"+File.separator+"eclipse-workspace"+File.separator+"GaoQi300"+File.separator
				+"src"+File.separator+"testFile"+File.separator+"报名照片.jpg";
		System.out.println(path);
	}
}
