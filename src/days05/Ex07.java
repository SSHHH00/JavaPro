package days05;

import java.util.Random;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 7. - 오후 3:06:50
 * @subject				 math .random() 은 메서드이며,		***
						 Random		클래스	라고칭함
 * @content
 */
public class Ex07 {

	public static void main(String[] args) {
		// 자바에서 임의의 수를 발생시ㅣ키는 코딩.
		// 1) math .random() 은 메서드이며,		***
		// 2) Random		클래스	라고칭함

		//math클래스 : 수학과 관련된 기능이 구현된 클래스
		//		System.out.println(Math.abs( 10 ) );			//임의의 수를 발생시켜 출력 하는 코딩
		//		System.out.println(Math.abs( -10 ) );	

		//0.0 <= double	< 1.0		리턴타입은 더블
		//		for (int i = 0; i < 10; i++) {
		// for i
		//		}
		//		 System.out.println(Math.random() );									//임이의 수를 발생시켜 실수를 출력
		//		}
		//	
		
		//double -> int 형변환
		
		int lottoNumber ;
		
		for (int i = 0 ; i < 6; i++) {
			lottoNumber = (int)(Math.random()*45) +1;
		System.out.printf("로또번호%d  ",lottoNumber);
		}
		
		
		// for i
		//		 1 <= (int)(Math.random() * 45)+1 < 46;


		//국어 0~100
		//		0 <= (int).(Math.random()*101) < 101

//		//3~19 랜덤 숫자 출력
//		3 <= (int)(Math.random()*19) <19;
//				System.out.println();
//		
//		
//		int randomnum ;
//		
//		for (int i = 1; i < 10; i++) {
//			randomnum = (int)(Math.random()*45)+1;
//			
//		System.out.printf("로또번호%d\n",randomnum);
//		} // for i 
			
		 // for i
		
		
		
	}

}


 


