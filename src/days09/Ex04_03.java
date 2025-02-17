package days09;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 13. - 오후 4:22:49
 * @subject		\\ 
 * @content
 */
public class Ex04_03 {

	public static void main(String[] args) {

		// 만나이 = 올해년도 - 생일년도   ( 생일지나지않은 경에만 -1  ) 
		// 생일의 월/일 - 0412
		// 올해의 월/일 - 3 13
		/*
	         if (!(올해월>=생일월  && 올해일>=생일일))   age--;
		 */      
		//  0412 
/*		int americanAge = getCountingAge(rrn)-1;
		int birthMD = Integer.parseInt( rrn.substring(2, 6) );
		// 올해 월일
		Date d = new Date();
		int currMD = ( d.getMonth()+1)*100 +   d.getDate();
		if( birthMD > currMD ) americanAge--;       
		return americanAge;
*/	
		
		Scanner sc = new Scanner(System.in);
		String rrn = getRrn(sc);
		System.out.println( rrn);
		
		int age = getAmericanAe(rrn);
		System.out.println();
		
		
		
		
		
	}

	private static int getAmericanAe(String rrn) {
		int americanAge = getCountingAge(rrn)-1;
		return 0;
		
	}

	private static int getCountingAge(String rrn) {
		LocalDate d = LocalDate.now();
		int currentYear = d.getYear();
		int birthYear = getYear(rrn);
		return currentYear - birthYear + 1;
		
	}

	private static int getYear(String rrn) {
		int year = getCentry(rrn) + Integer.parseInt(rrn.substring(0,2));
		return year;
	}

	private static int getCentry(String rrn) {
		char gender = rrn.charAt(7) ;
		switch (gender) {  
		case '9': case '0':
			return 1800; 
		case '1': case '2': case '5': case '6':	
		// case '3': case '4': case '7': case '8':
		default:
		    return 2000; 			
		} // switch
	}

	private static String getRrn(Scanner sc) {
		String regex = "\\d{6}-\\d{7}";
		String rrn = null;
		do {
			System.out.print("> 주민등록번호 14자리 입력( 예: 000000-000000) ? ");
		} while (!rrn.matches(regex));
		return rrn;
	}

}
 


