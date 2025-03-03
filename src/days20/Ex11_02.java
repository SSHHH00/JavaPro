package days20;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex11_02 {
	public static void main(String[] args) {
		//날짜 형식의 문자열 s를 Date, calendar 날짜 클래스로 변환
		String s = "2025.02.28일(금)";
		
		String pattern = "yyyy.MM.dd(E)";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		try {
			Date d = sdf.parse(s);
			System.out.println(d.toLocaleString());
			
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		
/*		
		[ 1 ]
		int year= Integer.parseInt( s.substring(0,4) );
		int month= Integer.parseInt( s.substring(5,7) );
		int date= Integer.parseInt( s.substring(8,10) );
		
		Date d = new Date(year-1900, month-1, date);
*/	
		
		
		
		
		
		
		
	}// m
}// c













