package days18;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 26. - 오전 10:03:56
 * @subject
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {

		/*
		 	[ 내부 inner 클래스 ]
		 1. 사용빈도가 거의 없다. 개념정도만 이해.
		 2. 중첩클래스
		 3. AWT, Swing 과 같은 GUI 애플리케이션(윈도우 어플리케이션)에서 이벤트 처리할
		 	목적으로 자주 사용된다. 
		 4. 내부 클래스의 종류와 특징 - (선언 위치)
		 	1) 인스턴스 클래스 - 외부 클래스의 필드 위치에 선언.
		 	2) 정적 (static) 클래스 - 외부 클래스의 필드 위치에 선언.
		 	3) 지역 (local) 클래스 - 외부 클래스의 매서드 안이나 초기화 블럭안에 선언.
		 	4) 익명 == 무명 ( Anonymous) 클래스
		 		- 클래스의 선언 + 객채 생성 합쳐진 이름 없는 클래스
		 		- 일회용.
		 */
		
	}//m

}//c
//class Car{				//외부클래스
//	
//	class Engine{		//내부클래스
//		
//	}
//}

class Outer{
	//필드
	int iv =0;				//인스턴스 변수
	static int ic = 0; 		//클래스 변수
	class InstanceClass{	//인스턴스 클래스
		// 주로 outer(외부 클래스)의 인스턴스 멤버들과 관련된 작업을 더
		// 용이하게 하기 위한 목적.
		
	}
	
	static class StaticClass { 		// 2. 정적클래스 
		// 주로 외부클래스의 static 멤버들과 관련된 작업을 할 목적
		// static 멤버처럼 다루어진다.
		
	}
	{
		//인스턴스 초기화
		class LocalClass2{
			
		}
	}
	//매서드
	class LocalClass { 		// 3. 지역 ( local ) 클래스
		// 지역변수처럼
		// 해당 지역(영역)에서만 사용되는 클래스
	}
	//생성자
	
}



















