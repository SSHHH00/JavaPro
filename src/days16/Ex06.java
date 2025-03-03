package days16;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 24. - 오후 12:10:58
 * @subject
 * @content
 */
public class Ex06 {

	public static void main(String[] args) {

		/*
		 	[클래스들 같의 2가지 관계 ]
		 	1. has-a(소속관계)
		 		예) 자동차 클래스			Car
		 			엔진(1) 클래스		Engine
		 	2. is-a (상속 관계)
		 */
		//생성자를 사용해서 의존성 주입(DI) 디펜던시 인젝션 
		Engine k_engine = new Engine();
		Car car1 = new Car(k_engine);
		car1.speedUp(10);
		
		//Setter를 사용해서 의존성 주입(DI)
		Engine h_enEngine = new Engine();
		car1.setEngine(h_enEngine);
		
		int speed = car1.getEngine().speed;
		System.out.println(" 현재속도 : "+speed);
		
		// System 필드
		//printStream out;
		//		ㄴ printf(), println() , print()
		System.out.println();
		System.out.println("End");
	}//main

}//classsssssssssssssssssssssssssssssx
