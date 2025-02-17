package days10;

public class Ex03_03 {

	public static void main(String[] args) {
		// [ 별 찍기 - 3 ]
	      // ****      i=1   j=4
	      // ***         i=2   j=3
	      // **        i=3   j=2
	      // *         i=4   j=1
	      //           j=5-i 
	      
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.print(i+j<=5?"*":" ");
			} //for
			System.out.println();
		} //for
	      
	      /* [1]
	      for (int i = 1, k = 4; i <= 4; i++, k--) {       // 행 
	         for (int j = 1; j <= k; j++) {   // 열
	            System.out.print("*");             
	         } // for j
	         System.out.println(); // 개행
	      } // for i
	      */

	}

}
