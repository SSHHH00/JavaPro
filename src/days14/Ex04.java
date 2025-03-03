package days14;

public class Ex04 {
	
	

	public static void main(String[] args) {
		/*
		 
		 [ 클래스 선언 시 앞에 붙는 접근지정자명 ]
		  1. public				활성화
		  		ㄴ 패키지 내/외부에서 사용(참조, 상속) 가능하다.
		  3. default(package)	활성화
		  		ㄴ 패키지 내부에서만 사용(참조, 상속) 가능하다.
		  
		  
		  중첩(=내부inner클래스)를 선언할 때만 사용할 수 있는 접근지정자
		  	ㄴ 4가지 종류의 내부 클래스가 있다.
		  2. protected			비활성화
		  		ㄴ default(package) 기능 + 패키지 외부에서는 상속만 가능하다.
		  4. private			비활성화
		 		ㄴ 같은 파일 내에서만 사용(참조, 상속) 가능하다.
		 
		 	[클래스 선언 시 앞에 붙는 기타제어자 설명]
		 	1.abstract	활성화 : 추상 클래스 
		 	2.final		활성화 : 최종 클래스
		 	3. static 비활성화 :	정적 클래스
		 					ㄴ중첩클래스 선언시에만 사용할 수 있는 키워드
		 		
		 		
		 [ 멤버(필드,매서드) 선언 시 앞에 붙는 접근지정자명 ]
		  1. public
		  2. protected
		  3. default
		  4. private
		 
		 
		 */
		// 같은 패키지 내부이기 떄문에 Ex04 클래스에서 Person 클래스를 사용가능하다.
		Person p1 = new Person();
		p1.name = "홍길동";
		p1.age = 20;
		p1.run();
		
		p1.age = 31;
		p1.run();
	}

}
