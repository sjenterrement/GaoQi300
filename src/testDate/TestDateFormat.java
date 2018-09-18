package testDate;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 测试datefarmet类
 * @author savrina
 *
 */

public class TestDateFormat {
	public static void main(String[] args) {
		DateFormat df=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss,属于本月的的第w周");
		
		Date d=new Date(393213143230L);
		String str=df.format(d);//将时间对象转化为字符串
		System.out.println(str);
	}
}
