package days02;

import java.util.Calendar;


/**
 * @author C_Seung_H0
 * @date 2025. 2. 4. - 오후 1:42:44
 * @subject printf() 포맷팅과 %1$s의 의미
 * @content 문자열과 변수명을 연결하는 방식
 * 
 */
public class Ex03_05 {

	public static void main(String[] args) {

		/*
		Calendar c = Calendar.getInstance();
		String s = String.format("Duke's Birthday: %1$tY.%1$tm.%1$te", c);
		System.out.println( s );
		*/
		
//		%[argument_index$][flags][width][.precision]conversion
		
		String name = "홍길동";
		
		// "홍길동!!! 안녕하세요. 홍길동입니다. 홍길동입니다."
		System.out
		   .println(name + "!!! 안녕하세요. " + name + "입니다.");
		
		// System.out.printf("%s!!! 안녕하세요. %s입니다. %s입니다.", name, name, name);
		
		//    '\n' 개행(줄바꿈) 제어문자
		System.out.printf("%1$s!!!\n 안녕하세요.\n %1$s입니다.\n %1$s입니다.", name);

		

	} // main

} // class
