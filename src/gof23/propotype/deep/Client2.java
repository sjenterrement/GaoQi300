package gof23.propotype.deep;

import java.util.Date;

/**
 * �������¡ԭ��ģʽ
 * @author SJ
 *
 */
public class Client2 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Date date=new Date(12345678901L);
		Sheep2 sheep=new Sheep2("Ф��", date);
		
		Sheep2 copySheep=(Sheep2) sheep.clone();
		
		System.out.println("sheep==copySheep?");
		System.out.println(sheep==copySheep);
		
		System.out.println("sheep.getBirthday()==copySheep.getBirthday()?");
		System.out.println(sheep.getBirthday()==copySheep.getBirthday());
	}
	
}
