package days07;

import java.io.IOException;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 11. - 오전 10:48:26
 * @subject		입력과 관련된 처리 (system.in.read)
 * @content (char)System.in.read()  (System.in.available()
 */
public class Ex02 {

	public static void main(String[] args) throws IOException {
		
		char one;
//		System.out.println("> 한문자 입력 :");
//		one =(char)System.in.read();
//		System.out.printf("%d(%c)\n",one);
//		
//		System.in.skip(System.in.available());
//		
//		System.out.print("> 한문자 입력 : ?");
//		one = (char) System.in.read();
//		System.out.printf("%d(%c)\n",one);
//		System.out.println("end");
		System.out.println(" > 한 문자 입력 :?");
		one = (char)(System.in.read());
		System.out.printf("%c\n",one);
		
		System.in.skip(System.in.available());
		
		
		System.out.println("> 한 문자 입력 : ?");
		one = (char)System.in.read();
		System.out.println("end");
		
		
	}

}
 


