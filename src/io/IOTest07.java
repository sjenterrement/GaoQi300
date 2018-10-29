package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

/**
 * 文件字节输入流 1.锟斤拷锟斤拷源 2.选锟斤拷锟斤拷 3.锟斤拷锟斤拷 4.锟酵凤拷锟斤拷源
 * 
 * @author SJ
 *
 */
public class IOTest07 {

	public static void main(String[] args) {
		// 1.创建流
		File src = new File("C:\\Users\\ASUS\\eclipse-workspace\\GaoQi300\\bts");

		// 2.选择流
		Reader rd = null;
		try {
			rd = new FileReader(src);

			// 操作(分段存取)
			char[] flush = new char[1024];// 缓冲容器
			int len = -1;// 接受长度
			while ((len = rd.read(flush)) != -1) {
				// 字符数组--》字符串
				String str = new String(flush, 0, len);
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (null != rd) {
				try {
					rd.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}
}
