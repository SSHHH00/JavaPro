package days20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 28. - 오후 12:10:50
 * @subject
 * @content			원하는 문자 출력
 */
public class Ex05_02 {

	public static void main(String[] args) {

		String source = "안녕하세요.홍길동입니다."
				+"폰번호 : 011-1234-5678, 집번호 : 02-9999-9999";
		String pattern = "(0\\d{1,2})-(\\d{3,4})-(\\d{4})";
		
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(source);
		
		//m.maches()
		//m.file()
		while (m.find()) {	// m 변수에 담긴 패턴값을 찾기 시작하는 매서드
			System.out.printf("%s\t%s\t%s\t%s\n",m.group(), m.group(1),m.group(2),m.group(3));
		} //while				// ㄴ 캡처 그룹 사용 매칭된 부분 나눔 출력
		
	}

}
