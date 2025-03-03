package days20;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 28. - 오후 2:37:15
 * @subject
 * @content			Calendar 날짜 확인...
 */
public class Ex07_02 {
	public static void main(String[] args) {
		// 달력
		int year = 2025;
		int month = 3;

		// 1) 2025.3.1 무슨요일?
		Calendar c= Calendar.getInstance();
		c.set(Calendar.YEAR, year);
//		c.set(Calendar.MONTH);
		c.set(Calendar.YEAR, year);
		
		c = new GregorianCalendar(year,month -1, 1);
		
		int dayOfWeek = Calendar.DAY_OF_WEEK;
		
		
		// 2) 2025.3.1 마지막 날짜?
		// ㄱ 2025.3.1  + 1달
//		c.set(Calendar.MONTH, c.get(Calendar.MONTH)+1);
		c.add(Calendar.MONTH,1);
		
		c.add(Calendar.DATE,-1);
		
		// [ 2 ] 
		System.out.println(c.getActualMaximum(Calendar.DATE));
		
		System.out.println(Ex07.getCalender(c));
		System.out.println(dayOfWeek);
		
		
		
	}//m
	public static int getDayOfWeek(Calendar c ) {
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		return dayOfWeek;
	}
	public static int getLastday(Calendar c) {
		return c.getActualMaximum(Calendar.DATE);
		
	}
}//c
