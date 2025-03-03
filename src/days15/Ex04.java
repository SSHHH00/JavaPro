package days15;

import java.util.Date;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 21. - 오후 12:11:52
 * @subject 
 * @content
 */
public class Ex04 {

	//생성자 
	public Ex04(){			//접근지정자도 생성가능
		
	}
	public static void main(String[] args) {
		/*
		 [생성자(constructor) p220	
		 1. 일종의 매서드이다
		 2. 리턴자료형 X			void X
		 3. 반드시 매서드명 클래스명과 동일하게 설정.
		 4. 매개변수 X 없는 생성자를 "디폴트생성자(default constructor"라고 부른다.
		 5. 생성자의 역할 : 필드 초기화
		 6. 생성자 호출시점 : 인위적으로 생성자를 호출할 수 없다.
		 					객체를 생성할 때만 자동으로 호출.
		 7. 제한자(Modifier)를 사용할 수 있다.
		 8. 생성자도 오버로딩이 가능하다 ( 중복선언 )
		 9. 생성자는 상속되지 않는다.
		 10. 생성자가 하나도 없는 경우 컴파일러가 자동으로 디폴트 생성자를 추가.
		 */
		
		/*
		 [ 1 ]
		MyPoint p1 = new MyPoint();
		//필드 초기화
		p1.x = 10;
		p1.y = 20;
		
		p1.dispMyPoint();
		*/
		
		// [ 2 ]
		//The constructor MyPoint(int, int) is undefined
		
		MyPoint p1 = new MyPoint(10,20);
		p1.dispMyPoint();
		
		new MyPoint();
		
		Date d = new Date();
		d.setYear(2000-19000);
		d.setMonth(10-1);
		System.out.println(d.toLocaleString());
		
		
		
		
		
		
		
		
	}//main

}//class
