package days07;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 11. - 오후 2:22:15
 * @subject
 * @content
 */
public class Ex04_05 {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
	         for (int d = 2; d <= 9; d++) {
	        	 if ( d==5)break;// 단
	            System.out.printf("%d*%d=%2d ", d, i, d*i);
	         } // for d
	         System.out.println();
	      } // for i   


	}

}
 


