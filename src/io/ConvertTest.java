package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


/**
 * 1.���ַ�������ʽ��ʽ�ֽ��������ı��ģ�
 * 2.ָ���ַ���
 * @author SJ
 *
 */

public class ConvertTest {
	public static void main(String[] args) {
		//����system.in��system.out
		try(BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(System.out));){
			//ѭ����ȡ���̵����루exit�Ƴ��������������
			String msg="";
			while (!msg.equals("exit")) {
				msg=reader.readLine();//ѭ����ȡ
				writer.write(msg);
				writer.newLine();
				writer.flush();
			}
		}catch(IOException e) {
			System.out.println("ERROR");
		}
	}
}
