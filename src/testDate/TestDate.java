package testDate;

import java.util.Date;

/**
 * ����date����÷�
 * @author savrina
 *
 */

public class TestDate {
	public static void main(String[] args) {
		Date d=new Date();
		long t=System.currentTimeMillis();
		System.out.println(t);
		Date d2=new Date(1000);
		
		System.out.println(d2.toGMTString());//������ʹ��
		d2.setTime(24324324);
		System.out.println(d2.getTime());
		System.out.println(d.getTime()<d2.getTime());
	}
}
