package io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;


/**
 * 字节数组输出流：ByteArrayOutputStream（）
 * 1.创建流:内部维护
 * 2.选择流：不关联源，不用传参
 * 3.操作
 * 3。关闭可以不用
 * 
 * 获取数据：toByteArray()
 * @author SJ
 *
 */
public class IOTest08 {
	public static void main(String[] args) {
		//1.创建流
		byte[] dest = null;
		
		//2.选择流（新增方法）
	   ByteArrayOutputStream baos=null;
		try {
			baos=new ByteArrayOutputStream();
			//3.操作
			String msg="show me the code";
			byte[] datas = msg.getBytes();//字符串--》字节数组
			baos.write(datas, 0, datas.length);
			baos.flush();
			
			//获取数据
			dest=baos.toByteArray();
			System.out.println(dest.length);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (null!=baos) {
				try {
					baos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
	}
}
