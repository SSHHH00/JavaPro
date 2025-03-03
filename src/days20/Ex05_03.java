package days20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 28. - 오후 12:19:23
 * @subject
 * @content		특정 단어 찾고 두번째 단어만 변경하기
 */
public class Ex05_03 {
	public static void main(String[] args) {

		String source = "안녕하세요. 홍길동입니다. 이름은 홍길동입니다. 별명도 홍길동입니다.";
		String pattern = "홍길동";

		StringBuffer sb = new StringBuffer();

		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(source);
		System.out.println(source);
		int cnt =0;
		while (m.find()) {
			cnt++;
			System.out.printf("start : %d ~ end : %d\n",m.start(),m.end());// 정규식 패턴과 일치하는 문자열이 어느 위치에 있는 지 출력
			if (cnt ==2 ) {
				m.appendReplacement(sb, "최승호");
			} //if
		} //while
		m.appendTail(sb);
		
	}// main
}// class
