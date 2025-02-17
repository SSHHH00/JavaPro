package days10;

import java.util.Scanner;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 14. 오후 12:37:18
 * @subject
 * @content
 */
public class Ex03_06 {

	public static void main(String[] args) {
		// [ 별찍기 -6]	이등변삼각형
		//			
		//__*
		//_****

		//[문제] 행의 객수를 입력받아서 이등변삼각형 그리기

		Scanner sc = new Scanner(System.in);
		System.out.println("입력 : ");

		int pnum = sc.nextInt();

		for (int i = 1 ; i <= pnum; i++ ) {       // 행
			// 공백 찍는 for
			for (int j = 1; j <= pnum; j++) {   // 열
				System.out.print("_");             
			} // for j
			// 별 찍는 for 
			for (int j = 1; j <= i; j++) {   // 열
				System.out.print("*");             
			} // for j
			System.out.println(); // 개행
		}


	}//메인이다

}
