package commons;

import java.io.File;

import org.apache.commons.io.FileUtils;

public class CIOTest01 {
	public static void main(String[] args) {
		//�ļ���С
		long len=FileUtils.sizeOf(new File("src/commons/CIOTest01.java"));
		System.out.println(len);
		//Ŀ¼��С
		len=FileUtils.sizeOf(new File("C:/Users/ASUS/eclipse-workspace/Leetcode"));
		System.out.println(len);
	}
}
