package days15;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 21. - 오후 2:36:57
 * @subject
 * @content				this 
 */
public class Ex06 {

	public static void main(String[] args) {
		/*
		 [ this 키워드 ]  p225, p245
		 1. 정의 : 클래스 자기 자신의 주소값 갖는 참조변수
		 
		 MyPoint p1 =	new MyPoint(10,20);
		 heap```````	call Stack( main)
		 인스턴스			객체
		 [10-[20][0x100]		[0x100]
		 x y   this
		 
		 2. this의 3가지 용도
		 	1) 멤버를 가리킬 때의 this 용도
		 	2) 생성자에서 또 다른 생성자를 호출 할때의 this
		 		- 생성자 호출 시기 
		 	3) 단독(홀로) 사용될 때의 this 용도 
		 		ㄴ - 매개변수	Ex06_02.java
		 		ㄴ - 리턴값		Ex06_03.java
		 	
		 	
		 */
		/*
	//	Person p1 = new Person("홍길동",20,true);
		Person p1 = new Person();
	//	p1.name;
		p1.getAge();
		*/
		
		Person p2 = new Person();		//default 생성자를 호출
		System.out.println(p2.name);
	}

}
