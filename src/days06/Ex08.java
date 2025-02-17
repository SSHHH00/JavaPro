package days06;

import java.util.Scanner;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 10. - 오후 4:09:30
 * @subject	스캐너 매서드 활용
 * @content
 */
public class Ex08 {

	public static void main(String[] args) {
		
		String name = null;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름 입력 : ?");
//		name = scanner.next(); 		//공백을 무시 앞 한글자만 입력됨
		name = scanner.nextLine();	//전체 라인 전체를 읽어감
		
		System.out.println(name);
		
		System.out.println("End");
		
		
		
	}//main

}//class
 


