package gof23.propotype.shallow;

import java.util.Date;

/**
 * ����ǳ��¡ԭ��ģʽ
 * @author SJ
 *
 */
public class Client {
	public static void main(String[] args) throws CloneNotSupportedException {
		Date date=new Date(12345678901L);
		Sheep sheep=new Sheep("Ф��", date);
		
		Sheep copySheep=(Sheep) sheep.clone();
		
		System.out.println("sheep==copySheep?");
		System.out.println(sheep==copySheep);
		
		System.out.println("sheep.getBirthday()==copySheep.getBirthday()?");
		System.out.println(sheep.getBirthday()==copySheep.getBirthday());
	}
	
}
