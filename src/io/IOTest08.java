package io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;


/**
 * �ֽ������������ByteArrayOutputStream����
 * 1.������:�ڲ�ά��
 * 2.ѡ������������Դ�����ô���
 * 3.����
 * 3���رտ��Բ���
 * 
 * ��ȡ���ݣ�toByteArray()
 * @author SJ
 *
 */
public class IOTest08 {
	public static void main(String[] args) {
		//1.������
		byte[] dest = null;
		
		//2.ѡ����������������
	   ByteArrayOutputStream baos=null;
		try {
			baos=new ByteArrayOutputStream();
			//3.����
			String msg="show me the code";
			byte[] datas = msg.getBytes();//�ַ���--���ֽ�����
			baos.write(datas, 0, datas.length);
			baos.flush();
			
			//��ȡ����
			dest=baos.toByteArray();
			System.out.println(dest.length);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (null!=baos) {
				try {
					baos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
	}
}
