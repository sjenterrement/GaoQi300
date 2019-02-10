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
 * 对象流 1.写出后读取 2.读取的顺序与写出的一致
 * 3.不是所有的对象都可以序列化，必须是可以实现serializable接口
 * 
 * 字节流 ObjectOutputStream ObjectInputStream
 * 
 * @author SJ
 *
 */
public class ObjectTest02 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//写出--》序列化
		ObjectOutputStream oos=new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("obj.ser")));//字节流需加缓冲
		//操作数据类型+数据
		oos.writeUTF("田柾国");
		oos.writeInt(21);
		oos.writeBoolean(true);
		oos.writeChar('t');
		//对象
		oos.writeObject("甜酒果");//string实现了serializable
		oos.writeObject(new Date());//string实现了serializable
		Employee emp=new Employee("田柾国",400);
		oos.writeObject(emp);
		oos.flush();
		oos.close();
		//读取--》反序列化
		ObjectInputStream ois=new ObjectInputStream(new BufferedInputStream(new FileInputStream("obj.ser")) );
		//顺序一定要与写出一致
		String msg=ois.readUTF();
		int age=ois.readInt();
		boolean flag=ois.readBoolean();
		char ch=ois.readChar();
		System.out.println(msg);
		//对象的数据还原
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
