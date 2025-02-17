package days10;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 14. 오전 11:48:14
 * @subject
 * @content
 */
public class Ex03_02 {

	public static void main(String[] args) {
		//별찍기 [번]
//		for (int i = 1; i <= 4; i++) { // 행
//			for (int j = 1; j <= 4; j++) {
//				System.out.print("*"); // 열
//				
//			} // for j
//		} //for
//		System.out.println();
//		
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.print(i>=j?"*":" ");
			} //for
		} //for
		
		
		
		
		
		
		
		
		
	}//main

}
