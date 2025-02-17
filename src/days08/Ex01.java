package days08;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 12. - 오전 9:01:09
 * @subject		제어문
 * @content				//		// [ 정보처리 기사 실기]
//		//1+2+4+7+11+16
//		int plus=0, plu
//		while = plus;
 */
public class Ex01 {

	public static void main(String[] args) {
//		// [ 정보처리 기사 실기]
//		//1+2+4+7+11+16
//		int plus=0, plu
//		while = plus;
//		]
		int sum = 0;
		int term = 1;
		int inc = 1;

		while ( term <= 100 ) {  // 1<=100 t
			sum += term;
			System.out.printf("%d+", term);    // 1+         
			term += inc++;
		} // while
		System.out.printf("=%d", sum);
		
		
	}	

}



