package days08;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 12. - 오전 10:45:58
 * @subject
 * @content 피보나치 수열
 */
public class Ex02 {

	public static void main(String[] args) {
		// [정보처리 기사 실시]
		// 10항의 합
		// int num =0;
		// int count =1;
		// int[] sum = new int[10];

		/*
		 * //gtp 피보나치 int n1 = 0, n2 = 1, n3; int count = 10; // 10항까지 출력 int i = 2; //
		 * 0, 1은 이미 포함했으므로 2부터 시작
		 * 
		 * System.out.print(n1 + " " + n2); // 첫 두 개의 숫자 출력
		 * 
		 * while (i < count) { n3 = n1 + n2; // 다음 항 계산 System.out.print(" " + n3); n1 =
		 * n2; // 값 이동 n2 = n3; i++; }
		 */
		// -----------------------------------------------

		int firstTerm = 1, secondTerm = 1, thirdTerm;
		int sum = firstTerm + secondTerm; // 2
		System.out.printf("%d+%d+", firstTerm, secondTerm);
		int termLength = 2;

		while (termLength < 10) {
			thirdTerm = firstTerm + secondTerm;
			System.out.printf("%d+", thirdTerm);
			sum += thirdTerm;

			firstTerm = secondTerm;
			secondTerm = thirdTerm;
			termLength++;

		} // while

		System.out.printf("=%d", sum);

	}// main

}// class
