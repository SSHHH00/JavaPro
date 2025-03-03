package days19;

import java.awt.Point;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 27. - 오전 9:31:18
 * @subject
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {

		//Object 의 매서드
		/*
		 	1. hashCode()
		 	2. getClass()
		 	3. toString()	오버라이딩
		 	4. equals()		오버라이딩
		 	5. clone()		

		 */

		Point p1 = new Point(1,2);
		Point p2 = new Point(1,2);

		System.out.println( p1 == p2);		//false
		System.out.println( p1.equals(p2));//true


		try {
			Point p3 = (Point) p1.clone();
			System.out.println(p3);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//main

}//class

class Ponint extends Object{
	int x;
	int y;

	public Ponint(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public boolean equals(Object obj) {

		if (obj != null && obj instanceof Point) {
			Point p =(Point)obj;
			return this.x == p.x && this.y == p.x;

		} //if
		return false;
	}
	//CloneNotSupportedException	check 예외
/*	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object obj = null;
		obj = super.clone();
		return obj;
	}
*/
	//
	@Override
	public String toString() {
		
		return String.format(" x= %d, y =%d", this.x, this.y);
	}

	//오버라이딩 주의할점	- 부모의 리턴자료형, 매개변수, 예외등ㅇ등으드으드으드으드으등
	//부모 리턴자료형 -> 자식리턴자료형 변수
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object obj = null;
		obj = super.clone();
		return obj;

}
	
}



















