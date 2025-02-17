package days03;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 5. - 오후 3:19:15
 * @subject
 * @content
 * 
 */
public class Ex06_04 {

	public static void main(String[] args) {
//		int i = 100;
		int i = Integer.MAX_VALUE;	//인티제의 가장 큰값
		int j = 200;
		long k = i + (long)j ;			//이미 큰값에 인티제를 계산 산술 오버플로우 발생..
		//오버플로우 발생시 더큰 long 형으로 변환
		//
		
		System.out.printf("%d + %d= %d \n",i,j,k);

		
		
		
	}//main

}//class
