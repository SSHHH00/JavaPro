package days17;

import days16.Car;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 25. - 오후 3:40:47
 * @subject
 * @content
 */
public class EX12 {

	public static void main(String[] args) {
		//has-a 관계 (소속관계)
		//days16 Car.java
		//day16.Engine.jave클래스
		
		//[ Engine 클래스 -> 인터페이스 변경 ]
		Car car1= new Car(new K_Engine());
		car1.setEngine(new X_Engine());
	}//main

}//class
