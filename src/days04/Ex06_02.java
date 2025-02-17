package days04;

import java.util.Scanner;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 6. - 오후 2:37:00
 * @subject
 * @content   if ( 짝수 조건식) {
 */
public class Ex06_02 {

		public static void main(String[] args) {
		// [문제]
		// 정수를 입력받아서 "홀수"/"짝수"라고 출력

			int n ;

			Scanner scanner = new Scanner(System.in);
			System.out.println(">정수(n)입력 : ");		//Ctrl + Shift + B 중간지점 포인트 
				n = scanner.nextInt();
			
//			if ( n % 2 == 0) {
//					System.out.println("짝수(Even numer");
//			}
//			if ( n % 2 != 0) {
//					System.out.println("홀수(Even numer");


				if ( n % 2 == 0) {
					System.out.println("짝수(Even numer");
				}	
				else {									//else 문에는 조건식 사용 X
					System.out.println("홀수(Even numer");	
					
					}//f


			System.out.println("end");



	}

}
 


