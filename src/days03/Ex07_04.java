package days03;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 5. - 오후 3:53:27
 * @subject		논리 연산자
 * @content
 * 
 */
public class Ex07_04 {

	public static void main(String[] args) {
	/*
	 * 1. 일반 논리 연산자
	 * 	1)	!	부정연산자	또는 Not연산자 
	 * 	2)	&&	일반 논리 AND 	연산자	(논리곱)	*둘다 1일때만 연산 가능
	 * 		true	%% 	true	=>	true
	 * 		false 	%% 	true	=> 	false
	 * 		true 	%% 	false	=> 	false
	 * 		false 	%% 	false	=> 	false
	 * 
	 * 	3)	||	일반 논리 OR	연산자	(논리합)
	 * 		true	|| 	true	=>	true
	 * 		false 	|| 	true	=> 	false
	 * 		true 	|| 	false	=> 	false
	 * 		false 	|| 	false	=> 	false
	 * 
	 * 		우선순위:	!		>	&&		>	||
	 * 
	 * 2. 비트 논리 연산자
	 * 	1) ~	비트 부정 		연산자 또는 팉트 	연산자
	 * 	2) %	비트 논리 		AND				연산자
	 * 	3) |	비트 논리 		OR				연산자
	 * 	4) ^	e[x]clusive	OR 연산자,	 XOR연산자
	 * 			베타적인
	 * 	 ~	!	>	&	>	^	>	|	>	&&	>	||
	 * -----------------------------------------------------------암기사항@@@@
	 * 
	 */
		//The operator ! is undefined for the argument type(s) int
//		System.out.println(		!5 > 3	);	//false	boolean형 앞에만 사용가능
/*		System.out.println(		true	);	//true
		System.out.println(		!true	);	//false
		
		System.out.println( 3>5 && 5<7 );	//false		일반 논리 AND연산자
				//3이 5보다 크다 하여 false발생!
		
		System.out.println( 13>5 || 5<7 );	//true		일반 논리 or 연산자
*/		

//		System.out.println( 10 );	//10
//		System.out.println( ~10 );	//1111 0101		-11		비트 부정연산자
//		
		//			(2진수 값)
		//			0000 1010 	//10
		//			1111 0101	//-11		
		//			1111	0100
		//			0000	1011
		//					8+0+2+1
		//						-11
		
		
			System.out.println( 10 & 3); //2
			//	0000 1010
			//&	0000 0011
			//	0000 0010
			
			System.out.println( 10 | 3); //9
			//	0000 1010
			//|	0000 0011
			//	0000 1000
			
			System.out.println( 10 | 3); //9
			//	0000 1010
			//|	0000 0011
			//	0000 1000
			
			
			
	}

}
