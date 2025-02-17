package days03;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 5. - 오후 3:34:17
 * @subject		산술연산자	+	-	*	/
 * @content
 * 
 */
public class Ex07_02 {

	public static void main(String[] args) {
	int i = 10, j =3;
	
	System.out.println( i + j );		//13
	System.out.println( i - j );		//7
	System.out.println( i * j );		//30
	System.out.println( i / j );		//3		몫연산자
//	System.out.println( double)i / j );	//3.3333	
	System.out.println( i % j );		// 		나머지 연산자
		
	
	//[주의할점]	/	%	0			//
//	System.out.println( 10 %0 );	//ArithmeticException
	System.out.println( 10.0 / 0 );	
	System.out.println( 10.0 % 0 );	//Nan	Not a Number
		

		
		
		

	}//main

}//class
