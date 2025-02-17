package zhome;

import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 6. - 오후 9:58:08
 * @subject		
 * @content
 */
public class 과목점수출력 {

	public static void main(String[] args) {
		// //연산자 : instanceof 연산자
		//			>>	>>>	<<	쉬프트(shift)연산자  비트연산자
		//						방향을 바꾸다, 이동시키다, 옮기다
		//			>>=			<<= 복합대입연산자
//
		Scanner br = new Scanner(new InputStreamReader(System.in));

	int  kor,eng,mat;
	System.out.print("국어점수입력 : ");
	kor = br.nextInt();
	
	System.out.print("영어점수입력 : ");
	eng = br.nextInt();
	
	System.out.print("수학점수입력 : ");
	mat = br.nextInt();

	System.out.printf("국어=%d, 영어=%d, 수학=%d\n",
			kor,eng,mat);
//	
//	//결과 각 과목당 사용자에게 점수를 입력받아 출력함
//	
	
		//비트 연산자의 개념 활용, 비트조작 최적화된 연산, 시스템 프로그래임, 보안 데이터 압축 등의 분야에서활용가능
		
//		System.out.println( 15 >> 2 );  // 00001111>>2
//		//                                 00000011
//		System.out.println( 15 >>> 2 ); // 00000011
//		System.out.println( 15 << 2 );  // 00111100
//	 
//		/*
//		// 00001111
//		String b = Integer.toBinaryString(15) ;  // "1111" -> 1111				
//		//System.out.printf("%08d", 1111);
//		System.out.printf("%08d", Integer.parseInt(b) );
//		*/
//		
//		System.out.println( Integer.toOctalString(15) ); // 8진수 문자열
//		System.out.println( Integer.toHexString(15) ); // 16진수 문자열
		
//		System.out.println(  3 >= 5 );
//		System.out.println( 5.2 / 0 ); 
		
		
		
		
		
		
		
	}
}
 


