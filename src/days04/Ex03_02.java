package days04;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 6. - 오후 12:06:51
 * @subject				
 * @content
 */
public class Ex03_02 {

	public static void main(String[] args) {
		// 학생의 이름을 여러면 저장 -> 배열 선언
		String [] names = null;	//지역변수, 참조변수, 배열명
		//The local variable names may not have been initialized
		names = new String[10];
		names[0] = "홍길동";
		names[1] = "이창익";
		
		System.out.println( names [0] );
//		System.out.println( names [10] );	//첨자값은 9까지인 상태(값에서 -1)
		//ArrayIndexOutOfBoundsException	0~9
		//배열 첨자가밧 범위 벗어낫다. 오류
		
		
		
		
	}

}
 


