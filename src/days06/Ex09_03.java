package days06;

import java.io.IOException;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 10. - 오후 5:26:25
 * @subject
 * @content
 */
public class Ex09_03 {

	public static void main(String[] args) throws IOException {
		//
		char one,two,three;     
		System.out.print("> 한 문자 입력 ? ");
		one = (char) System.in.read();
		
		System.out.print("> 한 문자 입력 ? ");
		two = (char) System.in.read();
		
		System.out.print("> 한 문자 입력 ? ");
		three = (char) System.in.read();
		System.out.printf("합친값 : ",one,two,three);
	
	}

}
 


