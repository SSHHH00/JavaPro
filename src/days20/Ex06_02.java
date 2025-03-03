package days20;

import java.util.Date;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 28. - 오후 2:01:15
 * @subject
 * @content
 */
public class Ex06_02 {
	public static void main(String[] args) {
		//달력
		int year = 2025;
		int month = 3;
		
		// 1) 2025.3.1 무슨요일?
		// 2) 2025.3.1 마지막 날짜
//		Date d = new Date();
//		System.out.println(d.getDate());
//		d.setDate(3-1);
//		d.setYear(year -1900);
//	
		// [ 2 ]
		Date d = new Date(year - 1900, month -1,1);
		
		// [ 3 ] year , month 마지막 날짜?
//		System.out.println(d.getDate());	//년 월 [일[
//		int date = d.getDate();
//		d.setDate(date+3);
		
		// 1달 더함
		d.setMonth(d.getMonth() + 1);		
		// 1달 뺌
//		d.getMonth(d.getMonth() - 1);
		System.out.println(d.getDate());
		System.out.println(d.toLocaleString());
		
		
		
		
		
		
		
		
	}//main
}//class




















