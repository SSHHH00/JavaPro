package days02;


/**
 * @author C_Seung_H0
 * @date 2025. 2. 4. - 오후 8:12:33
 * @subject 변수 선언  
 * @content 변수명 선언마다 이전값 소멸, 새로운 값으로 출력. 
 * 
 */
public class Ex02 {

		public static void main(String[] args) {  // 영역(범위) 연산자 {}		
		// Ctrl + Shift + L  이클립스 단축키 목록
		String name = null ;
		
		name = "홍길동";
		System.out.println( name );
		name = "이창익";
		System.out.println( name );
		name = "서영학";
		
		// The [local variable] name may not have been initialized
		//      지역   변수
		System.out.println( name );
			
		

	} // main

} // class








