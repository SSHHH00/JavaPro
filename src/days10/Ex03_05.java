package days10;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 14. 오후 12:14:48
 * @subject
 * @content
 */
public class Ex03_05 {

	public static void main(String[] args) {
		// [ 별찍기 -4]
		//	****
		//   ***
		//	  **
		//	  *
		// [ 별 찍기 - 5 ]            공백
	      // ___*      i=1   j=1       3
	      // __**      i=2   j=2       2
	      // _***        i=3   j=3       1
	      // ****      i=4   j=4       0
	      
	      // [1] 
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5-1; j++) {
				System.out.print(i+j<=5?"*":" ");
			} //for
			System.out.println();
		} //for
	      
	      // [2] 
	      /*
	      for(int i=4; i>=1; i--) {
	          System.out.println(" ".repeat(i-1)+"*".repeat(5-i));
	      }
	      */
	      
	      // [3]
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(i+j>=4 ?"*":" ");
			} //for
			System.out.println();
		} //for





	}//main

}//class
