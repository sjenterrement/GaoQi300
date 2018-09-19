package visualizeCalendar;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *可视化日历
 * @author savrina
 *
 */

public class VisualizeCalendar {
	public static void main(String[] args) {
		System.out.println("请输入日期（按照格式：2030-3-20）");
		Scanner scanner=new Scanner(System.in);
		String date=scanner.nextLine();
		
		DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date temp=df.parse(date);
			Calendar calendar=new GregorianCalendar();
			calendar.setTime(temp);
			int day=calendar.get(Calendar.DATE);
			calendar.set(Calendar.DATE, 1);
			
			System.out.println("日\t一\t二\t三\t四\t五\t六");
			
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
