package days20;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ex08_02 {
	public static void main(String[] args) {
	
		
		Calendar today = Calendar.getInstance();
		//2025.02.28
		//
		today = new GregorianCalendar(today.get(1), today.get(2),today.get(5));
		System.out.println(Ex07.getCalender(today));
		Calendar startDate = new GregorianCalendar(2025,2-1,28);
		System.out.println(Ex07.getCalender(startDate));
		
		System.out.println(today.after( ( startDate ) ));
		
		
	}//m
}//
