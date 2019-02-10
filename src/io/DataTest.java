package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/**
 * ������ 1.д�����ȡ 2.��ȡ��˳����д����һ��
 * 
 * �ֽ��� DataOutputStream DataInputStream
 * 
 * @author SJ
 *
 */
public class DataTest {
	public static void main(String[] args) throws IOException {
		//д��
		ByteArrayOutputStream baos=new ByteArrayOutputStream();///�ڵ��������ù�
		DataOutputStream dos=new DataOutputStream(new BufferedOutputStream(baos));//�ֽ�����ӻ���
		//������������+����
		dos.writeUTF("��͹�");
		dos.writeInt(21);
		dos.writeBoolean(true);
		dos.writeChar('t');
		dos.flush();
		byte[] datas=baos.toByteArray();
		System.out.println(datas.length);
		//��ȡ
		DataInputStream dis=new DataInputStream(new BufferedInputStream(new ByteArrayInputStream(datas)) );
		//˳��һ��Ҫ��д��һ��
		String msg=dis.readUTF();
		int age=dis.readInt();
		boolean flag=dis.readBoolean();
		char ch=dis.readChar();
		System.out.println(msg);
	}
}
