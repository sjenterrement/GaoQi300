package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * 1.����Դ
 * 2.ѡ����
 * 3.����
 * 4.�ͷ���Դ
 * @author SJ
 *
 */
public class IOTest01 {
	public static void main(String[] args) {
		//1.����Դ
		File src =new File("C:\\Users\\ASUS\\eclipse-workspace\\GaoQi300\\bts");
		//2.ѡ����
		try {
			InputStream is = new FileInputStream(src);
			//3������(��ȡ)
			int data1=is.read();//��һ������
			int data2=is.read();
			int data3=is.read();
			System.out.println((char)data1);
			System.out.println(data2);
			System.out.println(data3);
			//4.�ͷ���Դ
			is.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
}
