package testDate;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ����datefarmet��
 * @author savrina
 *
 */

public class TestDateFormat {
	public static void main(String[] args) {
		DateFormat df=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss,���ڱ��µĵĵ�w��");
		
		Date d=new Date(393213143230L);
		String str=df.format(d);//��ʱ�����ת��Ϊ�ַ���
		System.out.println(str);
	}
}
