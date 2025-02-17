package days09;

import java.time.LocalDate;
import java.util.Scanner;


/**
 * @author C_Seung_H0
 * @date 2025. 2. 14. 오전 9:45:40
 * @subject
 * @content
 */
public class Ex04_04 {

	public static void main(String[] args) {
		/*		‘ㅍ’은 주민등록번호에 오류가 없는지 
		확인하는 검증번호로, 아래와 같은 특수한 규칙으로 만든다.
		ㅍ = 11-{(2×ㄱ+3×ㄴ+4×ㄷ+5×ㄹ+6×ㅁ+7×ㅂ+8×ㅅ+9×ㅇ+2×ㅈ+3×ㅊ+4×ㅋ+5×ㅌ) mod 11}
		즉, 소괄호 안에 있는 것을 계산한 값을 11로 나눠서 나온 나머지를 11에서 뺀 값이 ㅍ이다.
		 (단, 10은 0, 11은 1로 표기한다.)
		 */		


		Scanner scanner = new Scanner(System.in);
		String rrn = getRrn(scanner);
		System.out.println("주민등록번호: " + rrn);

		// 생년월일 반환
		String birthday = getBirthday(rrn);
		System.out.println("생년월일: " + birthday);

		// 만나이 계산
		int age = getCountingAge(rrn);
		System.out.println("만 나이: " + age);
	}//main

	private static String getBirthday(String rrn) {
		int century = getCentury(rrn);
		String year = century + rrn.substring(0, 2);
		String month = rrn.substring(2, 4);
		String day = rrn.substring(4, 6);
		return year + "년 " + month + "월 " + day + "일";
	}

	private static int getCountingAge(String rrn) {
		LocalDate today = LocalDate.now();
		int currentYear = today.getYear();
		int birthYear = getYear(rrn);
		return currentYear - birthYear;
	}

	private static int getYear(String rrn) {
		int century = getCentury(rrn);
		int year = Integer.parseInt(rrn.substring(0, 2));
		return century + year;
	}

	private static boolean getNationality(String rrn) {
		char gender = rrn.charAt(7);
		switch (gender) {
		case '9': case '0':
		case '1': case '2': case '3': case '4':
			return true;
		default:
			return false;
		}
	}

	private static int getCentury(String rrn) {
		char gender = rrn.charAt(7);
		switch (gender) {
		case '9': case '0':
			return 1800;
		case '1': case '2': case '5': case '6':
			return 1900;
		default:
			return 2000;
		}
	}

	private static boolean getGender(String rrn) {
		int gender = Integer.parseInt(rrn.substring(7, 8));
		return gender % 2 == 1;
	}

	private static String getRrn(Scanner scanner) {
		String regex = "\\d{6}-\\d{7}";
		String rrn;
		do {
			System.out.print("> 주민등록번호 14자리 입력( 예: 000000-000000) ? ");
			rrn = scanner.next();
		} while (!rrn.matches(regex));
		return rrn;
	}

}//main




