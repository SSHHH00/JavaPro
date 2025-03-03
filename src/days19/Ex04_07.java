package days19;

import java.util.Arrays;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 27. - 오후 2:12:14
 * @subject
 * @content			
 */
public class Ex04_07 {

	public static void main(String[] args) {
		String message = "TODO Auto-gernerated method stub";
		// String -> char[] 변환
		// char[] -> String 변환
		
		// String -> Byte[] 변환
		byte[] messageArr = message.getBytes();
		System.out.println(Arrays.toString(messageArr));
		//byte[] -> String 전환
		message = new String(messageArr);
		System.out.println( message);
	}

}
