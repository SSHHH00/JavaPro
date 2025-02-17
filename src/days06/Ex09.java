package days06;

import java.util.Scanner;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 10. - 오후 4:37:04
 * @subject 
 * @content
 */
public class Ex09 {

	public static void main(String[] args) {
		//br
		//scanner
		char one = '\u0000';
		Scanner sc = new Scanner(System.in);
		System.out.println("한 문자 입력 : ?");
//		sc = scanner.next(); 		//공백을 무시 앞 한글자만 입력됨
//		sc = scanner.nextLine();
		
		char moon = sc.next().charAt(0);
		System.out.printf("%c\n",moon);
		
//		one =Scanner.next().charAt(0);
//		
//		System.out.printf("[%c]\n");
		
		//"A"
		// 'A' +'\0'
		
		
		
	}//main
}


 


