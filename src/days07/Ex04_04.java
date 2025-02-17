package days07;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 11. - 오후 2:08:45
 * @subject	
 * @content
 */
public class Ex04_04 {

	public static void main(String[] args) {
		
		//k=1 d=2 ~ +2
		//k=2 d=5 ~ +2
		//k=3 d=8 ~ +2
		 for (int k = 1; k <=2 ; k++) {
			 
	         for (int i = 1; i <= 9; i++) {
	        	 
	            for (int d = 4*k-2; d <= 4*k-2+3; d++) {  // 단
	               System.out.printf("%d*%d=%2d ", d, i, d*i);
	            } // for d
	            System.out.println();
	         } // for i   
	         System.out.println();
	      } // for k


	}

}
 


