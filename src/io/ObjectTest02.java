package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * ������ 1.д�����ȡ 2.��ȡ��˳����д����һ��
 * 3.�������еĶ��󶼿������л��������ǿ���ʵ��serializable�ӿ�
 * 
 * �ֽ��� ObjectOutputStream ObjectInputStream
 * 
 * @author SJ
 *
 */
public class ObjectTest02 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//д��--�����л�
		ObjectOutputStream oos=new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("obj.ser")));//�ֽ�����ӻ���
		//������������+����
		oos.writeUTF("��͹�");
		oos.writeInt(21);
		oos.writeBoolean(true);
		oos.writeChar('t');
		//����
		oos.writeObject("��ƹ�");//stringʵ����serializable
		oos.writeObject(new Date());//stringʵ����serializable
		Employee emp=new Employee("��͹�",400);
		oos.writeObject(emp);
		oos.flush();
		oos.close();
		//��ȡ--�������л�
		ObjectInputStream ois=new ObjectInputStream(new BufferedInputStream(new FileInputStream("obj.ser")) );
		//˳��һ��Ҫ��д��һ��
		String msg=ois.readUTF();
		int age=ois.readInt();
		boolean flag=ois.readBoolean();
		char ch=ois.readChar();
		System.out.println(msg);
		//��������ݻ�ԭ
		Object str=ois.readObject();
		Object date=ois.readObject();
		Object employee=ois.readObject();
		
		if (str instanceof String) {
			String strObj=(String) str;
			System.out.println(strObj);
		}
		if (date instanceof Date) {
			Date dateObj= (Date) date;
			System.out.println(dateObj);
		}
		if (employee instanceof Employee) {
			Employee empObj= (Employee) employee;
			System.out.println(empObj.getName()+" "+empObj.getSalary());
		}
		ois.close();
	}
}
