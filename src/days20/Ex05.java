package days20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 28. - 오전 11:26:50
 * @subject
 * @content				
 */
public class Ex05 {
	public static void main(String[] args) {
/*
	[ 정규 표현식 ] ([ Regular [Exp]ression )] regex
		ㄴ 문자역 속에 원하는 패턴 (pattern)과 일치하는 문자열을 찾기
		ㄴ 미리 정의된 기호와 문자
		ㄴ java.util.regex 패키지 
			ㄴ Pattern 클래스 - 정규식 정의
			ㄴ Matcher 클래스 - 데이터와 정규식 (Pattern객체)을 비교
			
		boolean String.matches(String regex)
 */
		String[] data = { "bat", "baby", "bonus", 
				"cA", "ca", "co", "c.", "c0", "car", "combat", "count", "date",
				"disc", "fx" };
		String regex = "[a-zA-Z&&[^b-d]].*";
	      // String regex = "c[a-z]*"; // c문자 시작해서 소문자 0~여러개 패턴
	      // String regex = "c[a-z]";  // c문자 + 소문자 1개
	      // String regex = "c[a-zA-Z]"; // c문자 + 알파벳 1개
	      
	      // String regex = "c[a-zA-Z0-9]";
	      // String regex = "c\\w";
	      // String regex = ".*";
	      // String regex = "c.";
	      // String regex = "c\\.";
	      // String regex = "c[0-9]";
	      // String regex = "c.*t";
	      // String regex = "[b|c]";
	      // String regex = "[bc]";
	      // String regex = "[b-c].*";
	      // String regex = "[^bc].*";

	      // String regex = ".*a.*";

	      // String regex = "[^bcd].*";

	      // String regex = "[a-zA-Z].*";
	      // String regex = "[ae-zA-Z].*";
		Pattern pt = Pattern.compile(regex);
		
		
		for (int i = 0; i < data.length; i++) {
			Matcher matcher = pt.matcher(data[i]);
			if (matcher.matches() ) {
				System.out.println(data[i]);
			} //if
		} //for
		
//		for (int i = 0; i < data.length; i++) {
//			System.out.printf("%s - %s 패턴 : %bn	",data[i].matches(regex));
//		} //for
		

	}
}

























