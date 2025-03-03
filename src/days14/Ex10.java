package days14;


/**
 * @author C_Seung_H0
 * @date 2025. 2. 21. - 오전 12:38:34
 * @subject 
 * @content
 */
public class Ex10 {

	public static void main(String[] args) {

		/*
		 [멤버(필드,매서드) 앞에 붙는 접근지정자 설명 ]
	 	1. public			- 패키지 내/외부 어디서나 접근(참조) 가능.
		2. protected		- default + 상속(패키지 외부에서 자식클래스에 접근 가능
		3. default(package)	- 패키지 내부에서만 접근(참조) 가능.
		4. private			- 같은 클래스 내에서만 접근(참조) 가능.

		 	public -> protected -> default -> private
		 */
		
		//days14.Time.java
		//days14.Ex10.java
		//패키지 내/외부 테스트
		Time t = new Time();
		// t. 	public protected default 필드,매서드 접근 가능
		
		//The field Time.milisecond is not visible
		//t.milisecond = 100;
		 
		
		
		
		
		
		
	}

}
