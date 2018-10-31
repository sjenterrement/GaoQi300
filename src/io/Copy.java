package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * �ļ��������ļ�������������� 1.������ 2.ѡ���� 3.���� 3���ر�
 * 
 * @author SJ
 *
 */
public class Copy {
	public static void main(String[] args) {
		Copy("src\\io\\Copy.java", "copy.txt");
	}

	public static void Copy(String srcPath, String destPath) {
		// 1.������

		File src = new File(srcPath);// ������ Դͷ
		File dest = new File(destPath);// ����� Ŀ�ĵ�

		// 2.ѡ����
		try (InputStream is = new FileInputStream(src); 
				OutputStream os = new FileOutputStream(dest)) {
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
		}

	}
}
