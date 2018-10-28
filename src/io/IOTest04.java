package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * 文件数组输出流
 * 1.创建流
 * 2.选择流
 * 3.操作
 * 3。关闭
 * @author SJ
 *
 */
public class IOTest04 {
	public static void main(String[] args) {
		//1.创建流
		File dest = new File("dest.txt");
		
		//2.选择流
		OutputStream os=null;
		try {
			os=new FileOutputStream(dest,true);
			//3.操作
			String msg="BTS";
			byte[] datas = msg.getBytes();//字符串--》字节数组
			os.write(datas, 0, datas.length);
			os.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (null!=os) {
				try {
					os.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
	}
}
