package days07;

import java.util.Scanner;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 11. - 오후 4:28:47
 * @subject		mathes 매서드 활용, 유효성검사는 정규 표현식으로 함.
 * @content		3번 잘못 입력 시 프로그램 종료하는 코드 작성
 * 				if do while 문에서 break; 는 do while 문을 빠져나간다는 의미
 */
public class Ex07_03 {
	public static void main(String[] args) {
		// 사용자 입력값 유효성 검사
		 // 사용자의 가위 바위 보 입력값에 대한 유효성 검사...
	      //          1 ~ 3
		int user;
		String input;
		Scanner scanner = new Scanner(System.in); 

		System.out.print("> user 가위(1)/바위(2)/보(3) 선택 ? ");
		input = scanner.next();
		// user == 1 || user ==2 || user == 3
		String regex = "[1-3]"; // "[a-zA-Z0-9]"
		
		if ( input.matches(regex) ) {
			user = Integer.parseInt(input);
			System.out.printf("> user=%d\n",  user	);
		} else {
			System.out.println("[알림]입력잘못!!!");
		} // if
	      scanner.close();

	}
}
