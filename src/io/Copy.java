package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 文件拷贝：文件数组输入输出流 1.创建流 2.选择流 3.操作 3。关闭
 * 
 * @author SJ
 *
 */
public class Copy {
	public static void main(String[] args) {
		Copy("src\\io\\Copy.java", "copy.txt");
	}

	public static void Copy(String srcPath, String destPath) {
		// 1.创建流

		File src = new File(srcPath);// 输入流 源头
		File dest = new File(destPath);// 输出流 目的地

		// 2.选择流
		try (InputStream is = new FileInputStream(src); 
				OutputStream os = new FileOutputStream(dest)) {
			// 3.操作
			byte[] flush = new byte[1024];// 缓冲容器
			int len = -1;// 接受长度
			while ((len = is.read(flush)) != -1) {
				os.write(flush, 0, len);
			}
			os.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
