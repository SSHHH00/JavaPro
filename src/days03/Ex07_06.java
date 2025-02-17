package days03;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 5. - 오후 4:43:39
 * @subject		조건 연산자 ?: 
 * @content		
 * 
 */
public class Ex07_06 {

	public static void main(String[] args) {
		//	?:	삼항연산자	또는 조건연산자
		int x = 30, y;
		//y = ( x > 10 ? 1 : 2 );	//( x > 10 True 이면 ? , false 2선택)
		//조건이 참이면 ? 뒤의 값이 거짓이면 : 선택됨
		
		y = ( x > 5 ? ( x < 10 ? 1 : 2 ):200);
		System.out.println( y );
	
	
	
	
	
	
	
	
	}//main

}//class
