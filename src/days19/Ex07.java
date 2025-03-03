package days19;

import java.awt.Point;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 27. - 오후 4:08:12
 * @subject
 * @content		래퍼클래스 제네릭은 래퍼 클래스를 사용x
 */
public class Ex07 {

	public static void main(String[] args) {
		
/*				[ Wrapper Class ] 래퍼 클래스
  			- 제네릭을 사용할때의 Type은 기본형 X. 래퍼클래스를 사용한다.
  			
  			 [ Auto Boxing ]  [ Auto UnBoxing ] 용어 이해.	*/
//  			 	[ 2 ]
  			 	int i = 100;
  			 	Integer j = i; ;	// Auto Boxing (기본형 -> 래퍼클래스 전환)
  			 	
  			 	int k = j; 			// Auto UnBoxing(래퍼클래스 -> 기본형 전환)
  			 

//				int i = 100;
//				System.out.println(i);
//				
//				
//				Integer j = new Integer("100");		//Integer 래퍼클래스 원하는 유형으로 출력가능
//				float f = j.floatValue();
//				int k = j.intValue();
				
				disp(i);
				
//				System.out.printf("출력형식",[Object...]);
				
				System.out.printf("%s\n", new Point(1,2));
				//래퍼클래스의 상속계층도 ( 기억 )
	}//main
	
	public static void disp(Object obj) {	//int -> Integer -> Object 가능 O)
		System.out.println(obj);
	}

}//class











