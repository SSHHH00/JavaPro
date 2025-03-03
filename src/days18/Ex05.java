package days18;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 26. - 오후 12:25:38
 * @subject		Chapter 11 예외처리 p466
 * @content
 */
public class Ex05 {

	public static void main(String[] args) {
		/*
		[ 예외 처리 (Exception Handling)	]
		1. 오류(에러) ? 프로그램 실행 중에 오작동 또는 비정상 종료되는 원인
		2. 오류 발생 시점에 따라..
			1) 컴파일 오류(에러)
				int a  문법오류 ; 
			2) 실행 오류(에러) == 런타임(Runtime)오류
				int[] m = null;
				m[0] = 100;
				System.out.println(m[0]);
				(1) 에러(Error) : 복구할 수 없는 심각한 오류
								  메모리, 스택 오버프로워 등등
					Error 부모클래스로부터
					  ㄴ	  Error 자식클래스 ...
				(2) 예외(Exception)에러보다 덜 심각한 비교적 수습될 수 있는 실행오류
					Exception 부모클래스
						ㄴ	자식클래스
			3) 논리적 오류 ( 가장 어려운 오류 )
				int i = Integer.MAX_VALUE;
				int j = i + 100;
				System.out.println(j);	// 오버플로우 발생\
				//-2147483549

		int[] m = new int[1];
		m[0] = 100;
		System.out.println(m[0]);	


		java.lang.NuulPointException 예외가발생한다
		JVM 안에 "예외처리기"가 발생한 예외를 예외객체(NullPointException)
		로 생성해서 개발자에게 예외를 처리하도록 전달...

		[ 예외 처리 ] 
		- 프로그램 실행 시 발생할 수 있는 예기치 못한 발생에
			대비한 코드를 작성하는것.

										object
										  ↑
										Throwable
										  ↑
						Exception						Error
							↑
			RuntimeException , IOException
				ㄴ	NullPointException
				ㄴ	AritheticException
					등등
		[ 예외 ] 
		[ 예외처리 ]
		[ 예외처리 방법 ]		***
			1. try~catch	문 사용
			2. throws		문 사용
		 */



	}//main

}//class









