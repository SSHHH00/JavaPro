package days07;

import java.util.Scanner;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 11. - 오전 10:06:07
 * @subject			한문자를 입력받아서 종류별 구분,출력
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {
		//7. 한 문자를 입력받아서 "대문자", "소문자", "숫자", "한글", "특수문자" 라고
		  // 출력하는 코딩을 하세요.
		   //( 특수문자는 # ! @ % )
		
		Scanner sc = new Scanner(System.in);
		char one;
		System.out.println("한문자 입력 ? :");
		one =sc.next().charAt(0);
		
		if ('A' <= one && one <= 'Z') {
			System.out.println("대문자");
		}else if ('a' <= one && one <= 'z') {
			System.out.println("소문자");
		}else if ('0' <= one && one <= '9') {
			System.out.println("숫자");
		}else if ('가' <= one && one <= '힣') {
			System.out.println("한글");	
		}else if( '#' == one || '!'== one || '@' == one||'%' == one) {
			System.out.println("특수문자");
		}else {
			System.out.println("기타 ~");
		}sc.close();
		
	}//main

}//class
 


