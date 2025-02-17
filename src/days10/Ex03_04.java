package days10;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 14. 오후 12:14:48
 * @subject
 * @content
 */
public class Ex03_04 {

	public static void main(String[] args) {
		// [ 별찍기 -4]
		//	****
		//   ***
		//	  **
		//	  *
		for (int i = 1; i <= 4; i++) { // 행 반복
		    for (int j = 1; j <= 5 - i; j++) { // 별 개수 조절
		        System.out.print("*"); // 열 출력
		    }
		    System.out.println(); // 줄바꿈 추가
		} 
		// [2]
		//		  *
		for (int i = 1; i <= 4; i++) { // 행 반복
			for (int j = 1; j <= i; j++) { // 별 개수 조절
				System.out.print("*"); // 열 출력
			} System.out.println();
		} 





	}//main

}//class
