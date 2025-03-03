package days18;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 26. - 오후 2:48:52
 * @subject
 * @content 	에외 처리 2번째 방법 		: Throw문 설명
 * 				예외를 강제로 발생시키는	: Throws문 설명
 */
public class Ex08 {
	public static void main(String[] args) throws IOException {

		//	System.in.read();		이해

		// 국어점수를 입력 받아서 수~ 가 출ㄹ력

		int kor = 0;
		try {
			kor = getScore();
		System.out.println("kor = "+ kor);
		} catch (Exception e) {
			e.printStackTrace();
		}	
		
		
	}//main

	private static int getScore() throws IOException{
		Scanner sc = new Scanner(System.in);
		int score =0;

		System.out.println("점수 입력? :");
		String input = sc.next();			//"90"

		//0~100 유효성 검사
		String regex = "^(100|[1-9]?[0-9])$\r\n";

		if(input.matches(regex)) {
			score = Integer.parseInt(input);
		}else {
			//강제 예외 발생 시키겠다.	:	throw문 사용
			throw new IOException("> 점수의 범위는 0 이상 100이하");
//			throw new ArithmeticException("> 점수의 범위는 0 이상 100이하");	
		}

		return score;
		}



}//class


















