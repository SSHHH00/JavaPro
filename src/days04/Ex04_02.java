package days04;

import java.util.Scanner;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 6. - 오후 12:33:20
 * @subject
 * @content
 */
public class Ex04_02 {

		public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
		
		
		String input = "1 		fish 	2fish red fish blue fish";
//	    Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
		Scanner s = new Scanner(input);
		s.useDelimiter("\\s*fish\\s*"); //정규표현식(String regex)
		//				\s	스페이스 공백 
		//				* 반복횟수 0~여러번
		//				
	     
	     System.out.println(s.nextInt());	//fish 구분자
	     System.out.println(s.nextInt());
	     System.out.println(s.next());
	     System.out.println(s.next());
	     s.close();
		

	}

}
 


