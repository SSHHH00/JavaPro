package days09;

import java.util.Scanner;
import java.time.LocalDate;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 13. - 오후 12:34:38
 * @subject 
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {
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

