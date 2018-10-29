package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

/**
 * �ļ��ֽ������� 1.����Դ 2.ѡ���� 3.���� 4.�ͷ���Դ
 * 
 * @author SJ
 *
 */
public class IOTest07 {

	public static void main(String[] args) {
		// 1.������
		File src = new File("C:\\Users\\ASUS\\eclipse-workspace\\GaoQi300\\bts");

		// 2.ѡ����
		Reader rd = null;
		try {
			rd = new FileReader(src);

			// ����(�ֶδ�ȡ)
			char[] flush = new char[1024];// ��������
			int len = -1;// ���ܳ���
			while ((len = rd.read(flush)) != -1) {
				// �ַ�����--���ַ���
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
