package days20;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 28. - 오후 4:42:07
 * @subject			2. SimpleDateFormat 클래스
 * @content				Date, Calendar 객체를 원하는 날짜형식으로 출력할때
 * 						사용하는 형식화 클래스이다.		
 * 
 * 						Date, Calendar  
 */
public class Ex11 {
	public static void main(String[] args) {

/*		[ 1 ] 
		Date d = new Date();
//		System.out.println(d.toLocaleString());
//		System.out.println(d.toGMTString());
		
//		출력형식 ) 2025/02/28 04:48:00 금요일
		String pattern = "yyyy/MM/dd hh:mm:ss E요일";
		SimpleDateFormat sdf = new SimpleDateFormat();
		System.out.println(sdf.format(d) );
*/		
//		[ 2 ]	Calendar -> Date 변환 시킨 후 형식화 클래스를 사용하면 된다.
		
/*		Calendar c = Calendar.getInstance();
		String pattern = "yyyy/MM/dd hh:mm:ss E요일";
		SimpleDateFormat sdf = new SimpleDateFormat();
		
		System.out.println(sdf.format( c.getTime()) );
*/		
		//2025년 02월 28일 오후 04:48:00 금요일
		Calendar c = Calendar.getInstance();
		String pattern = "yyyy년 M월 d일 hh:mm:ss E요일";
		SimpleDateFormat sdf = new SimpleDateFormat();
		
		System.out.printf(sdf.format( c.getTime()) );
		
		
		
		
		
		
	}//m
}//c





























