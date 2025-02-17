package days09;import java.util.Random;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 13. - 오전 11:20:17
 * @subject			nextInt(bound) 사용법 숙지
 * @content			String.join
 */
public class Ex03 {

	public static void main(String[] args) {  // main 메서드 시작
		String rrn ="7655-8988-9234-5677";  // 카드 번호 문자열 선언
		String[] guBun = rrn.split("-");  // "-"를 기준으로 카드 번호를 4개 부분으로 나눔

		Random star = new Random();  // 랜덤 객체 생성

		int cut = star.nextInt(4);  // 0~3 사이의 랜덤 숫자 생성 (총 4개 그룹 중 하나를 선택)
		guBun[cut] = "****";  // 선택된 인덱스의 값(카드 번호의 한 부분)을 "****"로 변경

		String result = String.join("-", guBun);  // 다시 "-"로 연결하여 새로운 문자열 생성
		System.out.println(result);  // 결과 출력
	} // main
} // class


