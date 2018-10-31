package io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 1.��װ���� 2.��װ�ͷ�
 * 
 * @author SJ
 *
 */

public class FileUtils {
	public static void main(String[] args) {
		// �ļ�--���ļ�
		try {
			InputStream is = new FileInputStream("bts");
			OutputStream os = new FileOutputStream("cc-bts.txt");
			copy(is, os);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// �ļ�--���ֽ�����
		byte[] datas = null;
		try {
			InputStream is = new FileInputStream("bts.jpg");
			ByteArrayOutputStream os = new ByteArrayOutputStream();
			copy(is, os);
			datas = os.toByteArray();
			System.out.println(datas.length);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// �ֽ�����--���ļ�
		try {
			InputStream is = new ByteArrayInputStream(datas);
			OutputStream os = new FileOutputStream("cc-bts.jpg");
			copy(is, os);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * �Խ����������
	 * 
	 * @param is
	 * @param os
	 */
	public static void copy(InputStream is, OutputStream os) {

		try {
			// 3.����
			byte[] flush = new byte[1024];// ��������
			int len = -1;// ���ܳ���
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
			// 4.�ͷ���Դ���ֱ��ͷţ��ȴ򿪵ĺ�ر�
			close(is,os);
		}

	}

	/**
	 * �ͷ���Դ1
	 * 
	 * @param is
	 * @param os
	 */
	public static void close(InputStream is, OutputStream os) {
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

	public static void close(Closeable... ios) {
		for (Closeable is : ios) {
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
