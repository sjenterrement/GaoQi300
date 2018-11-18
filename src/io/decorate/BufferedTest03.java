package io.decorate;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

/**
 * 字节数组输入流：字节数组不要太大
 *  1.锟斤拷锟斤拷源 2.选锟斤拷锟斤拷 3.锟斤拷锟斤拷 
 *  4.锟酵凤拷锟斤拷源：可以不用处理
 * 
 * @author SJ
 *
 */
public class BufferedTest03 {

	public static void main(String[] args) {
		// 1.创建流
		byte[] src="talk is cheap show me the code".getBytes();

		// 2.选择流
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(src));

			// 操作(分段存取)
			String line = null;
			while ((line = reader.readLine()!= null)) {
				// 字符数组--》字符串
				String str = new String(flush, 0, len);
				System.out.println(str);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (null != is) {
				try {
					is.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}
}
