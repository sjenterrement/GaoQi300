package testFile;

import java.io.File;

/**
 * �������ͳ���ļ�
 * @author SJ
 *
 */
public class FileCount {
	
	//��С
	private long len;
	//·��
	private String path;
	//�ļ�����
	private int fileSize=-1;
	//�ļ��и���
	private int dirSize=-1;
	//Դ
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
	
	//ͳ�ƴ�С
	private void count(File src) {
		//��ȡ��С
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
