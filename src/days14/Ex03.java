package days14;

public class Ex03 {

	public static void main(String[] args) {
		
		// m : 지역변수,참조변수, 배열명
		int[] m = new int[3];
		
		m[0]=12;
		
		// 변수 선언 형식
		// 자료형 변수명 [=초기값];
		// myCar : 지역변수,참조변수,객체명
		
		// 클래스 ? 객체를 생성하기 위한 설계도		Car
		// 객체	 ? 클래스로 선언된 참조변수		myCar
		// 인스턴스? new연산자 클래스의 객체가 실제 힙 영역에 생성된 것.
		Car myCar = null;
		myCar = new Car();
		//객체명.필드명
		//객체명.매서드명();
		myCar.name = "k9";
		myCar.dispCarInfo();
		System.out.println( myCar.name);
		
		/*
		 											Car 클래스
		 											[주소]
		 											myCar
		 	[name][speed] [wc][메주소]				변수
		 											지역변수
		 											참조변수
		 											객체명
		 
		 
		 
		 */
		
		
		
	}

}
