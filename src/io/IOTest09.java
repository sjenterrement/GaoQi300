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
 * 1.ͼƬ��ȡ���ֽ�����: 2.�ֽ�����д�����ļ�
 * 
 * 
 * @author SJ
 *
 */
public class IOTest09 {
	public static void main(String[] args) {
		// ͼƬת���ֽ�����
		byte[] datas = fileToByteArray("bts.jpg");
		System.out.println(datas.length);
		byteArrayToFile(datas, "c-bts.jpg");
	}

	/**
	 * 1.ͼƬ��ȡ���ֽ����� 1����ͼƬ������FileInputStream 2).�����ֽ����飺ByteArrayOutputSteam
	 */
	public static byte[] fileToByteArray(String filePath) {
		// 1.��������Ŀ�ĵ�
		File src = new File(filePath);
		byte[] dest = null;
		// 2.ѡ����
		InputStream is = null;
		ByteArrayOutputStream baos = null;
		try {
			is = new FileInputStream(src);
			baos = new ByteArrayOutputStream();
			// ����(�ֶδ�ȡ)
			byte[] flush = new byte[1024 * 10];// ��������
			int len = -1;// ���ܳ���
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
	 * 2.�ֽ�����д��ͼƬ 1�����ֽ�����д�����ByteArrayInputStream 2����FileOutputStream
	 * 
	 * @param src
	 * @param filePath
	 */
	public static void byteArrayToFile(byte[] src, String filePath) {
		// 1.������
		// 1.������
		File dest = new File(filePath);

		// 2.ѡ����
		InputStream is = null;
		OutputStream os = null;
		try {
			is = new ByteArrayInputStream(src);
			os = new FileOutputStream(dest);
			// ����(�ֶδ�ȡ)
			byte[] flush = new byte[1024 * 10];// ��������
			int len = -1;// ���ܳ���
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
