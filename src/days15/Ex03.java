package days15;
/**
 * @author C_Seung_H0
 * @date 2025. 2. 21. - 오전 11:11:55
 * @subject
 * @content
 * 
  			1. 기본형 매개변수와 참조형 매개변수
  			2. 기본형 리턴자료형과 참조형 리턴자료형
  
  			MyPoint 클래스 선언 : 좌표를 관리하기 위한 필드,매서드르 가진클래스
 */

public class Ex03 {

	public static void main(String[] args) {
		
		MyPoint p1 = new MyPoint();
		//객체명.필드
		//객체명.매서드()
		p1.dispMyPoint();
		
		MyPoint p2 = new MyPoint();
		p2.x =10;
		p2.y =20;
		p1.offsetPoint(100);
		p1.dispMyPoint();
		
		/*
		MyPoint p2 = new MyPoint();
		p2.x =10;
		p2.y =20;
		p2.dispMyPoint();
		*/
		// x, y 좌표값을 내가 준 값 (100) 만큼 이동.
		p1.offsetPoint(100);	//기본형으로 인식
		p1.dispMyPoint();
		
		p1.offsetPoint(p2);	
		p1.dispMyPoint();
		
		//x 좌표만 이동
		int x = p1.plusPointX(10);
		System.out.println( x );
		
		
		
		
		
	}//main

}//class
