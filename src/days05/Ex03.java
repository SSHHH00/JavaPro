package days05;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 7. - 오전 10:43:45
 * @subject		sum을 이용하여 
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		// [ 문제 ]  1 + 2 + ...+9+10=55(for문)
		
		int i;
		int sum = 0;
		for ( i = 0 ; i <=55; i++) {	
			//for 문안애서만 사용
			System.out.printf("%d",i);
			sum =+i ;	//sum - sum +i;
		} // for i
		System.out.printf("=%d",sum);
//		System.out.println(">> 빠져나올때의 i ="+i);
		
		
		
		
	}

}
 


