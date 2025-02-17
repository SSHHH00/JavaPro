package days04;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 6. - 오전 11:19:20
 * @subject		[문제] 연산자 	,	배열의 정의 
 * @content		[문제] 인덱스(index) 연산자 저장 변수 
 */
public class Ex03 {

	public static void main(String[] args) {	//String 배열 args
		// 한 학생의 국어점수를 저장할 변수를 선언.
		int kor = 0;
		//100명 학생의 국어점수를 저장할 변수를 선언
		
		//	1.배열(array)	:	동일한 자료형을 메모리상에 연속적으로 놓이게 한 것(정의)
		//		ㄴ 참조(Reference Type)
		// 	2. 배열 선언 형식
		//		자료형 [] 배열명 = new 자료형[배열크기];
		//	3. new 연산자
		int [] kors;		//int 베열 kor
		kors = new int[100];
		//	배열 크기
		//	배열명.length
		int size = kors.length;			//배열명크기를 얻어옴
		System.out.println(size);
		
		kors[0] = 90;
		kors[1] = 80;
		
		System.out.println(kors[0]);
		System.out.println(kors[1]);
		/*												
		 	heap										stack
		 		0		1		2		3				첨자값(index)
		 	아랫첨자값								귓점자값
		 	LowerBound						UpperBound
		 									kors.length-1
		 									배열크기-1을 빼면 윗첨자값이 나옴.
		 	[4바이트]										[	0x100번지		]
		 	0번째 요소(Element)	1번째
		  	0x100번지										 kors 변수, 참조변수, 배열명
		  												 
		  												
		 */
		





	}//main

}//class
 