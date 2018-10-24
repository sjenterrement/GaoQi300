package testFile;

import java.io.File;

/**
 * 面向对象：统计文件
 * @author SJ
 *
 */
public class FileCount {
	
	//大小
	private long len;
	//路径
	private String path;
	//文件个数
	private int fileSize=-1;
	//文件夹个数
	private int dirSize=-1;
	//源
	private File src;
	
	
	
	public long getLen() {
		return len;
	}


	public int getFileSize() {
		return fileSize;
	}


	public int getDirSize() {
		return dirSize;
	}



	public FileCount(String path) {
		this.path = path;
		this.src=new File(path);
		count(this.src);
	}
	
	//统计大小
	private void count(File src) {
		//获取大小
		if (null!=src&&src.exists()) {
			if (src.isFile()) {
				len+=src.length();
				this.dirSize++;
			}else {
				this.fileSize++;
				for (File s : src.listFiles()) {
					count(s);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		FileCount dir1 = new FileCount("C:/Users/ASUS/eclipse-workspace/GaoQi300");
		System.out.println(dir1.getLen()+"-->"+dir1.getDirSize()+"-->"+dir1.getFileSize());
		
		FileCount dir2 = new FileCount("C:/Users/ASUS/eclipse-workspace/GaoQi300/src");
		System.out.println(dir2.getLen()+"-->"+dir2.getDirSize()+"-->"+dir2.getFileSize());
	}
	
}
