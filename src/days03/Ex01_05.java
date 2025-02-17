package days03;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 5. - 오전 10:30:15
 * @subject ASCII 코드연산, 형변환
 * @content
 * 
 */
public class Ex01_05 {

		public static void main(String[] args) {
		
//		대문자 + 32 = 소문자
//		System.out.println( 'A' - 'a');
		char a = 'x';
		char b;
		
		System.out.printf("a=%1$c, b=%1$C\n",a);
		
		// %c는 문자 출력 사이에 1$가 들어가면 첫번째 인수를 출력한다를 의미
		// 	ㄴ 즉 첫번째 인수만 반복적으로 사용하게 됨.

		//Type mismatch: cannot convert from int to char 	//메세지 검색오류해경
		//b = a - 32;			<---
		b =(char) (a - 32);
		
		System.out.println(b);
		

	}//main

}//class
