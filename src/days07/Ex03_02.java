package days07;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 11. - 오전 11:33:38
 * @subject			foreach 문 사용
 * @content		문자열 분활과 공백 제거 split 활용
 * 						" , " => , 제거 출력 		\\s*,\\s* 문자열 공백제거
 * 														앞 		뒤
 */								
public class Ex03_02 {

	public static void main(String[] args) {
		String data = "홍길동 ,  이창익,    서영학 , 정창기";
		String regex = "\\s*,\\s*";
		String [] names = data.split(regex);
		for (String name : names) {
			System.out.println(name);
		}
	}

}
 


