package io;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

/**
 * �ֽ��������������ֽ����鲻Ҫ̫��
 *  1.����Դ 2.ѡ���� 3.���� 
 *  4.�ͷ���Դ�����Բ��ô���
 * 
 * @author SJ
 *
 */
public class IOTest05 {

	public static void main(String[] args) {
		// 1.������
		byte[] src="talk is cheap show me the code".getBytes();

		// 2.ѡ����
		InputStream is = null;
		try {
			is = new ByteArrayInputStream(src);

			// ����(�ֶδ�ȡ)
			byte[] flush = new byte[1024];// ��������
			int len = -1;// ���ܳ���
			while ((len = is.read(flush)) != -1) {
				// �ַ�����--���ַ���
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
