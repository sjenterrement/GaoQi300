package io.decorate;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * ������ ѡ���� ���� �ر�
 * 
 * @author SJ
 *
 */
public class BufferedTest01 {
	public static void main(String[] args) {
		// 1.������
		File src = new File("C:\\Users\\ASUS\\eclipse-workspace\\GaoQi300\\bts");

		// 2.ѡ����
		InputStream is = null;

		try {
			is = new BufferedInputStream(new FileInputStream(src));
			// ����(�ֶδ�ȡ)
			byte[] flush = new byte[3];// ��������
			int len = -1;// ���ܳ���
			while ((len = is.read(flush)) != -1) {
				// �ֽ�����--���ַ��������룩
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

			try {
				if (null != is) {
					is.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}

class test01 {
	public static void main(String[] args) {
		// 1.������
		File src = new File("C:\\Users\\ASUS\\eclipse-workspace\\GaoQi300\\bts");

		// 2.ѡ����
		InputStream is = null;
		BufferedInputStream bis = null;
		try {
			is = new FileInputStream(src);

			// ����(�ֶδ�ȡ)
			byte[] flush = new byte[3];// ��������
			int len = -1;// ���ܳ���
			while ((len = is.read(flush)) != -1) {
				// �ֽ�����--���ַ��������룩
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

			try {
				if (null != is) {
					is.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			try {
				if (null != bis) {
					bis.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
