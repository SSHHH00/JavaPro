package days14;

public class Ex06 {

	public static void main(String[] args) {
		// [ 지역 변수 선언 형식 ]
		// 자료형 변수명[=초기값];
		// final 자료형 상수명=초기값;
		
		//지역변수는 접근지정자를 붙일 수 없다.
		//public String name = "홍길동"; XX
		
		//객체 선언 및 생성
		Tv t1 = new Tv();					 // TV 객체 생성 (전원: false, 채널: 11)
		t1.power();        	 				// 전원 ON (power = true)
		t1.channelUp();     				// 채널 1 증가 (11 → 12)
		System.out.println(t1.channel);  	// 채널 값 출력 (12)
		t1.power();         				// 전원 OFF (power = false)
		System.out.println("end");  		// "end" 출력

		
	}//main

}//class

//The public type Tv must be defined in its own file
//Ex06.Java 자바파일을 생성하면 자바 파일 안에는 반드시 1개의
//public 선언된 클래스 ( class 자바파일명 ) 가 있어야 한다.
//public class Tv{

class Tv{
	
	//필드
	// [필드 선언 형식 ]
	// [ 접 ] [ 기 ] 자료형 필드명[=초기값];
	public String color;
			boolean power = false;
	public int channel = 11;
	
	//매서드
	public void power() {
		power = !power;
	}
	public void channelUp() {
		channel++;
	}
	public void channelDown() {
		channel--;
	}
	
	
	
	
	
}// Tv class