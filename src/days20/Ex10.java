package days20;

import java.text.DecimalFormat;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 28. - 오후 4:19:24
 * @subject
 * @content
 */
public class Ex10 {

	public static void main(String[] args) {
/*
 			[ 형식화 클래스 ] 
 				ㄴ	java.txt 패키지에 있는 클래스
 				ㄴ	숫자 , 날짜, 문자열 이러 데이터를 일정한 형식에 맞게
 					표현할 수 있는 메서드 제공하는 클래스
 				1. DecimalFormat 클래스
 					ㄴ 숫자를 형식화 하는 클래스
 				2. SimpleDateFormat 클래스
 				3. ChoiceFormat 클래스
 				4. MessageFormat 클래스 
 */
		int money = 3257600;
		//			3,257,600
		// [ 1 ]
//		String strmoney = String.format("%,d", money);
//		System.out.println(strmoney);
		
		// [ 2 ] DecimalFormat 숫자를 형식화 하는 클래스
		String pattern = "#,###";						
		DecimalFormat df = new DecimalFormat(pattern);
		String strmoney = df.format(money);
		System.out.println(strmoney);
		
		
		
		
		
		
		
	}//m

}//c















