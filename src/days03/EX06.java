package days03;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 5. - 오후 2:01:52
 * @subject	문자열 90을 바이트 값으로 바꾸기
 * 
 * @content
 * 
 */
public class EX06 {

	public static void main(String[] args) {
		//Byte.parseByte("90") -> 90
		// int 가장 큰 2,147,483,647
		//long 	" 	:
		
//		//래퍼(Wrapper)클래스	-	기본형 int -> 기능이 구현된 클래스(물건, 부품, 객체. 개체)
//								ㄴ매서드
		System.out.println( Integer.MAX_VALUE); //
		String strkor = "90";
		
		int kor = Integer.parseInt(strkor); //4바이트로 인티저로 바꿔서 출력해줌 
		//문자열 90을 바이트 값으로 바꾼다
		//byte - > 	Byte
		//기본형		래퍼클래스
		
		double kor2 = Double.parseDouble(strkor);
		
		// long	->	Long
		// Short -> Short
		// float -> Float
		// char  -> Character
		
		
		
		
	}

}
