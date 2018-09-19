package testCalendar;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 测试日期类
 * @author savrina
 *
 */

public class TestCalendar {
	public static void main(String[] args) {
		Calendar c=new GregorianCalendar();
		c.set(2001, Calendar.FEBRUARY,10,12,23,34);
		
		Date d=c.getTime();
		System.out.println(d);
		System.out.println(c.get(Calendar.YEAR));
		
		//测试日期计算
		c.add(Calendar.YEAR, -30);
		System.out.println(c);
	}
}
