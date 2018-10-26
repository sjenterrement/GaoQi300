package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * 1.����Դ 2.ѡ���� 3.���� 4.�ͷ���Դ
 * 
 * @author SJ
 *
 */
public class IOTest02 {
	public static void main(String[] args) {
		// 1.����Դ
		File src = new File("C:\\Users\\ASUS\\eclipse-workspace\\GaoQi300\\bts");

		// 2.ѡ����
		InputStream is = null;
		try {
			is = new FileInputStream(src);

			// 3������(��ȡ)

			int temp;
			while ((temp = is.read()) != -1) {
				System.out.println((char) temp);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 4.�ͷ���Դ
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
