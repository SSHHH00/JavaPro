package days18;

import java.util.Random;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 26. - 오후 12:46:44
 * @subject 1) try~catch문 사용해서 예외처리
 */
public class Ex05_03 {

	public static void main(String[] args) {
		int number = 100;
		int result = 0;
		Random rnd = new Random();
		int n = -1;
		int[] m = new int[10]; // 결과 저장 배열

		for (int i = 0; i < 10; i++) {
			try {
				// 0이 나오면 다시 랜덤 값 생성
				do {
					n = rnd.nextInt(5); // 0 ~ 4 랜덤 생성
				} while (n == 0); // 0이면 다시 뽑기

				result = number / n; // 나눗셈 연산 수행
				m[i] = result; // 배열에 저장
				System.out.println("결과: " + result);

			} catch (ArithmeticException e) {
				System.out.println("0으로 나눌 수 없음! 다시 시도");
				i--; // 다시 시도
			} catch (Exception e) {
				System.out.println("예외 발생: " + e.toString());
			}
		} // for 종료
	}
}
