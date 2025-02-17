package days05;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 7. - 오전 11:01:33
 * @subject		조건반복문 for문 , while문
 * @content
 */
/**
 * @author C_Seung_H0
 * @date 2025. 2. 7. - 오전 11:08:32
 * @subject			
 * @content			if문과 else 문을 한줄일때 {}괄호를 쓰지 않아도 된다.
 * 				for문, while 문도 출력 코딩이 한줄 일때 {}지역변수를 쓰지 않아도 된다.
 */
public class Ex04 {

	public static void main(String[] args) {

		//[for문] 1~10=55
		//	ㄴ 반복문
		//[while문] 1~10=55		
		//ㄴ 조건반복문			//condition이 참일 동안 {}블럭을 실행하는 반복문, 거짓이 될때깨지 실행
		//if는 한번만 실행, 

		/*			while (condition) {			

		}//while

		do {						//최소한번은 실행

		} 	while (condition) 
		 */			

//				int i = 1;
//				int sum =0;
//				
//				while(i <=10 ) {							//전위형 후휘형파악?
//					System.out.printf("%d+",i);
//					sum += i;
//					i++;
//				}
//				System.out.printf("=%d\n",sum);


		int i = 1;
		int sum =0;
		
		while(++i <= 3 ) {					//false 4<	//전위형 후휘형파악?
			System.out.printf("%d+",i);
			sum += i;

			//			i++;

		}
		System.out.printf("=%d\n",sum);










	}

}



