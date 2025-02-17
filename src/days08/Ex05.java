package days08;

import java.util.Scanner;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 12. - 오후 2:07:16
 * @subject
 * @content
 */
public class Ex05 {

	public static void main(String[] args) {
		// 오버로딩( == 중복함수)
		// drawLine()
		// drawLine(int)
		// drawLine(int, String)
		
		int x,y,result = 0;
		Scanner scaner = new Scanner(System.in);
		System.out.print(" > x , y input? ");
		x = scaner.nextInt();
		y = scaner.nextInt();
		
		//result = x+ y;
		// 두 정수의 합을 반환하는 sum() 매서드를 선언 - > 호출
		
		//매서드 선언부
		System.out.printf("%d+%d=%d\n",x,y,result); {
//			int result = x + y;
//			return result;
			return;
		}
		
		

	}

}
 


