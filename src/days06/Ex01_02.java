package days06;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 11. - 오전 12:53:51
 * @subject	[Java] 1부터 10까지 짝수만 출력하고 합 구하기 
 * 				(for문 & continue 활용)
 * @content
 */
public class Ex01_02 {

	public static void main(String[] args) {
		//1~10까지 짝수만 출력후 합구하기
		int sum =0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) continue;
			System.out.print( i + " ");
				sum+=i;
			} // for i
		System.out.println("\n짝수합 : "+sum);
		
		
		
		
		int zum=0;
		for (int i = 1; i <= 10; i++) {
			if ( i % 2 != 0) continue;
			System.out.print( i + " ");
			zum += i;
			
			}System.out.println("\n짝수의 합 : "+zum);
	}//main

}//class
 


