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
public class Ex08_02 {
	public static void main(String[] args) {

		//	System.in.read();		이해

		// 국어점수를 입력 받아서 수~ 가 출ㄹ력

		int kor = 0;
		try {
			kor = getScore();
		System.out.println("kor = "+ kor);
		}catch (ScoreOutofBoundException e) {
			System.out.println(e.getERROR_CODE()+ "\n"+e.getMessage() );
		
		} catch (Exception e) {
			e.printStackTrace();
		}	
		
		
	}//main

	private static int getScore() throws ScoreOutofBoundException{
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
			throw new ScoreOutofBoundException("> 점수의 범위는 0 이상 100이하");
//			throw new ArithmeticException("> 점수의 범위는 0 이상 100이하");	
		}

		return score;
		}

}//class
//class ScoreOutofBoundException extends RuntimeException{ // unchecked 예외
class ScoreOutofBoundException extends Exception{ /**
	 * 
	 */
	private static final long serialVersionUID = -1361386386864749666L;
//checked 예외

	// 예외 코드 번호
	private final int ERROR_CODE;

	// getter 
	public int getERROR_CODE() {
		return ERROR_CODE;
	}

	public ScoreOutofBoundException(int error_code, String message) {
		super(message);
		this.ERROR_CODE = error_code; 
	}

	public ScoreOutofBoundException(String message) {
		this(1001, message);
	}

}//class Exception


















