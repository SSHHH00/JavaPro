package days16;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 24. - 오후 4:06:43
 * @subject
 * @content
 */
public class Ex09 {

	public static void main(String[] args) {
		//자식객체를 생성하면 먼저 부모 객체가 생성된 후에
		//자식객체가 생성된다.
		//(부모의 생성자함수가 먼저 호출되고 자식의 생성자함수가 호출된다.)
		
		//this 키워드
		//super 키워드
		//		ㄴ	정의? 자식클래스에서 부모클래스의 멤버를 참조하는데 사용되는
		//		ㄴ	용도? 1) 부모의 멤버를 가리킬 때의 super
		//				 2)	생성자에서 또 다른 부모의 생성자를 호출 할때의 super()
		//				 3) 단독으로 사용되는 super X 
		
		Child c = new Child();
		
		System.out.println("end");
	}//main

}//class
class Parent{
	//필드
	int x = 10;
	//생성자
	Parent(){
		System.out.println(" > Parent 디폴트 생성자 호출됨");
	}
	//메소드
	void dispParent() {
		//
	}
	//final 메소드 선언
	// 
	public final void  test() {
		System.out.println(" > Parent text ");
	}
}
class Child extends Parent{
	//int x = 10; 필드상속
	//dispParent(){}	상속
	//test(){}			상속
	//부모의 생성자(){}	상속
	
	//부모에게 물려받은 x 필드가 존재하는데 똑같은 이름으로 선언 x
	
	int x = 20;
	int y;
	
	public Child() {
		super();
		System.out.println("> Child 디폴트 생성자 호출됨");
	}
	void dispChiled() {
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
	}
	void dispParent() {
		System.out.println("새로 구현(재정의)");
	}
}
