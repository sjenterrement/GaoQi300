package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/**
 * 数据流 1.写出后读取 2.读取的顺序与写出的一致
 * 
 * 字节流 DataOutputStream DataInputStream
 * 
 * @author SJ
 *
 */
public class DataTest {
	public static void main(String[] args) throws IOException {
		//写出
		ByteArrayOutputStream baos=new ByteArrayOutputStream();///节点流，不用关
		DataOutputStream dos=new DataOutputStream(new BufferedOutputStream(baos));//字节流需加缓冲
		//操作数据类型+数据
		dos.writeUTF("田柾国");
		dos.writeInt(21);
		dos.writeBoolean(true);
		dos.writeChar('t');
		dos.flush();
		byte[] datas=baos.toByteArray();
		System.out.println(datas.length);
		//读取
		DataInputStream dis=new DataInputStream(new BufferedInputStream(new ByteArrayInputStream(datas)) );
		//顺序一定要与写出一致
		String msg=dis.readUTF();
		int age=dis.readInt();
		boolean flag=dis.readBoolean();
		char ch=dis.readChar();
		System.out.println(msg);
	}
}
