package visualizeCalendar;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *���ӻ�����
 * @author savrina
 *
 */

public class VisualizeCalendar {
	public static void main(String[] args) {
		System.out.println("���������ڣ����ո�ʽ��2030-3-20��");
		Scanner scanner=new Scanner(System.in);
		String date=scanner.nextLine();
		
		DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date temp=df.parse(date);
			Calendar calendar=new GregorianCalendar();
			calendar.setTime(temp);
			int day=calendar.get(Calendar.DATE);
			calendar.set(Calendar.DATE, 1);
			
			System.out.println("��\tһ\t��\t��\t��\t��\t��");
			
			for (int i = 1; i < calendar.get(Calendar.DAY_OF_WEEK); i++) {
				System.out.print("\t");
			}
			
			for (int i = 1; i <= calendar.getActualMaximum(Calendar.DATE); i++) {
				if (i==day) {
					System.out.print("*");
				}
				System.out.print(i+"\t");
				if (calendar.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY) {
					System.out.println();
				}
				calendar.add(Calendar.DATE, 1);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
