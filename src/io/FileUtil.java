package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 1.分装拷贝
 * 2.分装释放
 * @author 	SJ
 *
 */

public class FileUtil {
	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("bts");
			OutputStream os = new FileOutputStream("cc-bts.txt");
			copy(is,os);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 对接输入输出流
	 * @param is
	 * @param os
	 */
	public static void copy(InputStream is, OutputStream os) {
		
		try {
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
		} finally {
			// 4.释放资源：分别释放，先打开的后关闭
			try {
				if (null != os) {
					os.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

			try {
				if (null != is) {
					is.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
