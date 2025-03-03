package days19;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 27. - 오전 10:25:36
 * @subject		
 * @content			[	문자열을 다루는 클래스		]
 					1. String 클래스
 					2. StringBuffer 클래스
 					3. StringBuilder 클래스
 				4. StringTokenizer클래스		==String.split();	Ex05_04.java
 				5. StringJoiner 클래스		==String.join();
 */
public class Ex04 {

	public static void main(String[] args) {
		/* 
		 		1. [ String 클래스 ]
				ㄴ 문자열 자료형
		 			ㄴ 문자열 나열 char[]
	************	ㄴ (암기)String는 "변경 불가능한( immutable ) 클래스이다"
		 		String name = new String(3);	문자열로됨
		 		
		 		String name = "홍길동";
				String name2  = "홍길동";		//같은 주소값
				System.out.println( name == name2); //같은주소값 true
				
	



		 		2. StringBuffer 클래스

		 		3. StringBuilder 클래스

		 		4. StringTokenizer클래스
		 */

		String name = "홍길동";
		String name2  = "홍길동";		//같은 주소값
		System.out.println( name == name2); //같은주소값 true
		


	}//main

}//class














