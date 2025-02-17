package days10;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 14. 오후 2:07:04
 * @subject
 * @content
 */
public class Ex03_07 {

	public static void main(String[] args) {
	      // __*
	      // _***
	      // *****
	      // _***
	      // __*
	/*	for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 2-i; j++) {
				System.out.print(" __*");
	}	for (int k = 1; k <= 5; k++) {
		for (int l = 1; l <= -i; l++) {
			System.out.print(" *");
		}
			System.out.println();
		} //for
		}	
	*/
		for (int i = 1; i <= 5; i++) {
	         for (int j = 1; j <= 5; j++) {
	            //System.out.print( i+j==4 || i==3|| j-i==2?"*":" ");
	            //System.out.print( i+j>=4   ?"*":" ");
	            //System.out.print( j-i<=2 ?"*":" ");
	            System.out.print( i+j>=4 && j-i<=2  ?"*":" ");
	         } // for j
	         System.out.println();
	      } // for i 
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

