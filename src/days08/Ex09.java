package days08;

import java.util.Scanner;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 12. - 오후 4:16:55
 * @subject
 * @content
 */
public class Ex09 {

	public static void main(String[] args) {
		/* [문제] 년도를 입력받아서 윤년/ 평년 출력
		 		윤년?
				평년?
				 태음력/태양력 -> 오차를 보정하기 위해 추가되는 일/주/월 => 윤년
				 치윤법
				 지-태 공전 : 365.2422일
				그레고리력 ; 1년은 365.2425일

		[ 치윤법 ]
		 400 97일
		 */

		int year;
		Scanner sc=new Scanner(System.in);
		year = getyear(sc);

		if (isLeapYear(year)) {
			System.out.println("윤년 (leep year)");
		} else {
			System.out.println("평년 (common year)");

		}
	}// main

	private static boolean isLeapYear(int year) {
		//              &&     >    ||
		return year % 4  == 0 && year % 100  != 0 || year % 400  == 0 ;


	}

	private static int getyear(Scanner sc) {
		// 년도 유효성 검사 리턴~ 1년 ~>
		String regex = "\\d*";
		String strYear;
		do {
			System.out.print(" 년도입력 : ?");
			strYear = sc.next();
		} while (!strYear.matches(regex) );
		return 0;

	}

}// class
