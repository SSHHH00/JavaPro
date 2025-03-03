package days20;

import java.util.Calendar;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 28. - 오후 2:19:45
 * @subject
 * @content			년 / 월 / 일 가져옴ㅁ
 */
public class Ex07 {
	public static void main(String[] args) {

		//JDK 1.1 Calendar
		// Calendar 추상클래스 - > new 연산자 객체 생성 X
		// Calendar c = new Calendar();
		Calendar c = Calendar.getInstance();
		//		System.out.println(c);

		System.out.println(c.get(1));
		System.out.println(c.get(Calendar.YEAR));			// YEAR = 1; 연도 가져오
		System.out.println(c.get(Calendar.MONTH)+1); 		// MONTH = 0  < = 1 더해서 사용
		System.out.println(c.get(Calendar.DATE));			// DATE = 5;
		System.out.println(c.get(Calendar.DAY_OF_MONTH));

		System.out.println(c.get(Calendar.DAY_OF_YEAR));	
		// 시간 , 분 , 초 밀리초
		// 요일
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		System.out.println(c.get(Calendar.HOUR_OF_DAY)+Calendar.MINUTE);

		System.out.println(c.get(Calendar.DAY_OF_WEEK));

	}//m



public static String getCalender(Calendar c) {
	return String.format("%d.%02d.%02d", 
			c.get(Calendar.YEAR), 
			c.get(Calendar.MONTH) + 1, 
			c.get(Calendar.DATE));
}

}//c


























