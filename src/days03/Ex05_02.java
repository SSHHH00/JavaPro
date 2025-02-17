package days03;
/**
 * @author C_Seung_H0
 * @date 2025. 2. 5. - 오후 12:20:40
 * @subject 복습#@@@@@@@@@@@@@2
 * @content 		
 * 					String	->	 Byte 변환 숙지.
 * 					
 * 
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex05_02 {

	public static void main(String[] args) throws IOException {
//		[문제] 
//		국어점수를 키보드로부터 입력받아서 
//		변수에 저장하고
//		"국어=90" 출력하는 코딩작성.0~100까지만 담을수 있는 바이트
		
		//BufferedReader는 한줄 단위로 입력을 받을때 사용됨 String
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String kor = null;
//		System.out.print("> 국어 입력? :");
//		kor = br.readLine();				입력한 언어를 kor 에 저장;
//		
//		System.out.printf("> 국어점수=%s\n : ", kor);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String kor = null;
		System.out.print("국어점수 입력 : ");
		kor = br.readLine();
		
		System.out.printf("국어점수 =%s\n ", kor);
		
		
		
		
		
		
		
		
	}//main

}//class
