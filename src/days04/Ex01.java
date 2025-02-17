package days04;


/**
 * @author C_Seung_H0
 * @date 2025. 2. 6. - 오전 9:59:59
 * @subject 형변환하는 코딩 예제 , 비트이동 연산자 , 쉬프트 연산자
 * @content parse in max_value
 */
public class Ex01 {

	public static void main(String[] args) {
		
		//연산자 : instanceof 연산자
		//			>>	>>>	<<	쉬프트(shift)연산자  비트연산자
		//						방향을 바꾸다, 이동시키다, 옮기다
		//			>>=			<<= 복합대입연산자
		
			System.out.println( 15 >> 2);	//00001111>>22	
			System.out.println( 15 >>> 2);	//00000011
			System.out.println( 15 << 2);	//000011				비트값 다룰때 사용
			//					<<< 는 없음.
			
			
			//00001111
//			String b = Integer.toBinaryString(15);
//			//이진수 형태를 문자로 반환하는
//			System.out.printf("%08d",Integer.parseInt(b) );
//			
			System.out.println(Integer.toOctalString(15) );		//8진수문자열
			System.out.println(Integer.toHexString(15) );		//16진수문장열
			
		
	}//main

}//class
 
