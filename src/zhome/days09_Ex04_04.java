package zhome;

import java.util.Scanner;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 14. 오전 8:47:31
 * @subject		days09_Ex04_04
 * @content
 */
public class days09_Ex04_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String rrn = getRrn(sc);
		System.out.println("주민등록번호: " + rrn);
		
		String birthday = getBirthday(rrn);
		System.out.println("생년월일: " + birthday);
		
		
	  
	}

	private static String getBirthday(String rrn) {
		int century = getCentury(rrn);
		String year = century + rrn.substring(0,2);
		String month = rrn.substring(2, 4);
		String day = rrn.substring(4,6);
		return year + "년" + month + "월" + day + "일";
	}

	private static int getCentury(String rrn) {
		return 0;
		
	}

	private static String getRrn(Scanner sc) {
		String regex = "\\d{6} - \\7{7};";
		String rrn;
		do {
			System.out.println("> 주민등록번호 14자리 입력( 예: 000000-000000) ? ");
			rrn = sc.next();
		} while (!rrn.matches(regex));
		return rrn;
	}

}
