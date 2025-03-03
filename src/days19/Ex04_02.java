package days19;

import java.util.Arrays;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 27. - 오전 10:38:30
 * @subject		String 이 가진 매서드들
 * @content		
 */
public class Ex04_02 {
	
	public static void main(String[] args) {
		
		//1. 문자열 길이를 반환하는 매서드
//		System.out.println(s.length());		//40
		
//		// 2. 문자열 속에서 특정 위치의 한 문자를 반환하는 매서드
//		System.out.println(s.charAt(0));	
//		for (int i = 0; i < s.length(); i++) {
//			System.out.printf(" %c", s.charAt(i));
//		} //for
		
		// 3. 대문자 변환, 소문자 변환
		// 		대문자로 변환하는 새로운 문자열 반환.
		//	s 문자열 불변 Xx
//		System.out.println(s.toUpperCase());
//		System.out.println(s.toLowerCase());
//		System.out.println(s);		// 문자열은 불변

		// [ 4. ]s.split(regex); 
		
//		// 5. String -> char[] 
//		char[] sArr = s.toCharArray();
//		System.out.println(Arrays.toString(sArr));
//		
//		// 6. char[]  -> String
//		String s2 =  new String(sArr);
//		String.valueOf(sArr);
//		System.out.println(s2);
//		
		// 7. trim() 문자열 앞 뒤의 공백 제거해서 문자열 반환하는 매서드
//		System.out.printf("[%s]   홍길동    ".trim());		//공백제거 
		
		// [ 문제 ] s 문자열 속에 main 문자열이 찾아서 MAIN 으로 변경코딩
		String s = "public static void main(String[] args) {";
		String sh = "main";
		
		//  s 문자열 속에 한글을 제외한 모든 문자는 제거..
	 
			
		//  [ 1 ]
/*		if(s.contains(sh) ) {
			int index = s.indexOf(sh);
			System.out.println(s.substring(0, index)  // "main" 앞부분
                    + sh.toUpperCase()               // "MAIN"
                    + s.substring(index + sh.length())); // "main" 이후 부분
*/
		 // [ 2 ]
//		String [] sArr = s.split(sh);
//		System.out.println(s.);
//					
		// [ 3 ]
//		System.out.println(s.replace(sh, sh.toUpperCase() ));	//"main" 값 : sh를 대문자 변환
		
		// indexOf()
		//
		
//		System.out.println( s.indexOf("main")); 		//0 앞에서부터
//		System.out.println( s.lastIndexOf("main"));		// 뒤에서부터 
		
		//문자열 연결
//		String s2 = "aaa" + "bbb" + "ccc";
//		"aaa".concat("bbb").concat("ccc");		//문자열 연결매서드
		
		// 문자열
//		s2.equals(s3);
//		s2.equalsIgnoreCase(s3);
		
		// 문자열 뒤집기
		String s2 = reverse(s);
		
		
		//
		/*
		   [ 과제 ]  비밀번호 정규표현식
					  알파벳 대문자 1개, 소문자 1개 ,숫자 1개 ,특수문자 1개 ,
					  문자열 길이 8~15사이
		 */
		
	}//main

	private static String reverse(String s) {
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			result = s.charAt(i) + result;
		} //for
		return result;
	}
}
//class





















