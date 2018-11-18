package io.decorate;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

/**
 * �ļ��ֽ������
 * 1.������
 * 2.ѡ����
 * 3.����
 * 3���ر�
 * @author SJ
 *
 */
public class BufferedTest04 {
	public static void main(String[] args) {
		//1.������
		File dest = new File("dest.txt");
		
		//2.ѡ����
		Writer wt=null;
		try {
			wt=new FileWriter(dest);
			//3.����
			
			//д��1
//			String msg="BTS ���Ͽ� ��˶�� �ɫj�� ֣���� ���ǕF ��̩�� ��͹�";
//			char[] datas = msg.toCharArray();//�ַ���--���ַ�����
//			wt.write(datas, 0, datas.length);
			
			//д��2
//			String msg="BTS ���Ͽ� ��˶�� �ɫj�� ֣���� ���ǕF ��̩�� ��͹�";
//			wt.write(msg);
			
			//д��3
			String msg="BTS ���Ͽ� ��˶�� �ɫj�� ֣���� ���ǕF ��̩�� ��͹�\n";
			wt.append(msg).append(msg);
			
			wt.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (null!=wt) {
				try {
					wt.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
	}
}
