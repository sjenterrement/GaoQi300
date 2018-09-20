package testFile;

import java.io.File;

/**
 * ¼òµ¥µÄfiletree
 * @author savrina
 *
 */

public class FileTree {
	
	public static void main(String[] args) {
		File f=new File("f:/TEST");
		printFile(f, 0);
		
	}
	
	static void printFile(File f,int level) {
		// TODO Auto-generated method stub
		for (int i = 0; i < level; i++) {
			System.out.print("-");
		}
		
		System.out.println(f.getName());
		
		if (f.isDirectory()) {
			File[] fs=f.listFiles();
			for (File file : fs) {
				printFile(file, level+1);
			}
		}
	}
}
