package days14;

//신형 자동차 클래스 선언
/**
 * @author C_Seung_H0
 * @date 2025. 2. 21. - 오전 9:50:32
 * @subject
 * @content
 */
public class Car {
	
	//필드 ( field ) ==멤버 변수(속성)
	String name;	// 자동차 이름
	int speed;		// 속도
	int wheelCount; // 바퀴수
	
	//메소드(method) == 멤버 함수(기능)
	public void dispCarInfo() {
		System.out.printf("> 차명 %s, 속도: %d \n",name,speed);
	}
}
