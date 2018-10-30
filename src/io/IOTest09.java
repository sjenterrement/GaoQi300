package io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 1.图片读取到字节数组: 2.字节数组写出到文件
 * 
 * 
 * @author SJ
 *
 */
public class IOTest09 {
	public static void main(String[] args) {
		// 图片转成字节数组
		byte[] datas = fileToByteArray("bts.jpg");
		System.out.println(datas.length);
		byteArrayToFile(datas, "c-bts.jpg");
	}

	/**
	 * 1.图片读取到字节数组 1）。图片到程序：FileInputStream 2).程序到字节数组：ByteArrayOutputSteam
	 */
	public static byte[] fileToByteArray(String filePath) {
		// 1.创建流和目的地
		File src = new File(filePath);
		byte[] dest = null;
		// 2.选择流
		InputStream is = null;
		ByteArrayOutputStream baos = null;
		try {
			is = new FileInputStream(src);
			baos = new ByteArrayOutputStream();
			// 操作(分段存取)
			byte[] flush = new byte[1024 * 10];// 缓冲容器
			int len = -1;// 接受长度
			while ((len = is.read(flush)) != -1) {
				baos.write(flush, 0, len);
			}
			baos.flush();
			return baos.toByteArray();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
		return null;

	}

	/**
	 * 2.字节数组写出图片 1）。字节数组写入程序ByteArrayInputStream 2）。FileOutputStream
	 * 
	 * @param src
	 * @param filePath
	 */
	public static void byteArrayToFile(byte[] src, String filePath) {
		// 1.创建流
		// 1.创建流
		File dest = new File(filePath);

		// 2.选择流
		InputStream is = null;
		OutputStream os = null;
		try {
			is = new ByteArrayInputStream(src);
			os = new FileOutputStream(dest);
			// 操作(分段存取)
			byte[] flush = new byte[1024 * 10];// 缓冲容器
			int len = -1;// 接受长度
			while ((len = is.read(flush)) != -1) {
				os.write(flush, 0, len);

			}
			os.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				if (null != os) {
					os.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
