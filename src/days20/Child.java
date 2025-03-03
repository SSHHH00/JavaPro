package days20;

public class Child extends Parent{

	void modiferAccessTest() {
		this.pub = 100;	//패키지 내부 / 외부 어디서든지 접근가능
		this.pro = 90;	//default + 상속 접근 가능
		this.def = 80;	//패키지 내부 접근 가능
		
//		this.pri XX 클래스 내부에서만 접근 가능
	}
}
