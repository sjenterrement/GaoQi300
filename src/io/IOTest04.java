package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * �ļ����������
 * 1.������
 * 2.ѡ����
 * 3.����
 * 3���ر�
 * @author SJ
 *
 */
public class IOTest04 {
	public static void main(String[] args) {
		//1.������
		File dest = new File("dest.txt");
		
		//2.ѡ����
		OutputStream os=null;
		try {
			os=new FileOutputStream(dest,true);
			//3.����
			String msg="BTS";
			byte[] datas = msg.getBytes();//�ַ���--���ֽ�����
			os.write(datas, 0, datas.length);
			os.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (null!=os) {
				try {
					os.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
	}
}
