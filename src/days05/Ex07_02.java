package days05;

import java.util.Scanner;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 7. - 오후 3:06:54
 * @subject
 * @content		1)게임을 계속 여부? y
 */
public class Ex07_02 {

	public static void main(String[] args) {
		int com, user;
	      Scanner scanner = new Scanner(System.in);

	      com = (int) (Math.random() * 3) + 1;

	      System.out.print("> user 가위(1)/바위(2)/보(3) 선택 ? ");
	      user = scanner.nextInt();

	      System.out.printf("> com=%d, user=%d\n", com, user);

	      // 승자 판단해서 출력...
	      switch (user - com) {
	      case 0:
	         System.out.println("무승부");
	         break;
	      case 1:
	      case -2:
	         System.out.println("사용자 승리");
	         break;
	      case -1:
	      case 2:
	         System.out.println("컴퓨터 승리");
	         break;
	      } // switch

		
	}

}
 


