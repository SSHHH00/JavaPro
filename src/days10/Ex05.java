package days10;

import java.util.Random;
import java.util.Scanner;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 14. 오후 5:07:14
 * @subject 한 반에 30명 학생의 성적 처리 (이름, 국어, 영어, 수학, 총점, 평균, 등수)
 * @content 학생성적관리 프로그램
 *          1. 입력 정보 : 이름, 국어, 영어, 수학 (랜덤 생성)
 *          2. 총점, 평균, 등수 계산 
 *          3. 모든 학생 정보 출력
 */
public class Ex05 {
	public static void main(String[] args) {
		final int STUDENT_COUNT = 30;

		String[] names = new String[STUDENT_COUNT];
		int[] kors = new int[STUDENT_COUNT];
		int[] engs = new int[STUDENT_COUNT];
		int[] mats = new int[STUDENT_COUNT];
		int[] tots = new int[STUDENT_COUNT];
		int[] ranks = new int[STUDENT_COUNT];
		double[] avgs = new double[STUDENT_COUNT];

		int cnt = 0; // 입력받은 학생 수
		char con = 'y';

		Scanner sc = new Scanner(System.in);

		do {
			// 한 학생의 정보를 입력
			System.out.printf("[%d] 학생 랜덤 생성 중...\n", cnt + 1);

			names[cnt] = getName();  // 랜덤 이름 생성
			kors[cnt] = getScore();  // 랜덤 국어 점수
			engs[cnt] = getScore();  // 랜덤 영어 점수
			mats[cnt] = getScore();  // 랜덤 수학 점수

			tots[cnt] = kors[cnt] + engs[cnt] + mats[cnt];
			avgs[cnt] = (double) tots[cnt] / 3;
			ranks[cnt] = 1; // 등수 초기화

			System.out.printf("이름: %s, 국어: %d, 영어: %d, 수학: %d, 총점: %d, 평균: %.2f\n",
					names[cnt], kors[cnt], engs[cnt], mats[cnt], tots[cnt], avgs[cnt]);

			cnt++; // 입력한 학생 수 증가

			// 입력 계속 여부 체크
			System.out.print("> 학생 입력 계속? (y/n): ");
			con = sc.next().charAt(0); // 한 문자 입력받기
		} while (Character.toUpperCase(con) == 'Y' && cnt < STUDENT_COUNT);

		sc.close();

		// 입력받은 학생 정보 출력
		System.out.printf("\n> 입력받은 학생수: %d명\n", cnt);
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t등수");

		for (int i = 0; i < cnt; i++) {
			System.out.printf("[%d]\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
					i + 1, names[i], kors[i], engs[i], mats[i], tots[i], avgs[i], ranks[i]);
		}
	}

	// 랜덤한 한글 이름 생성 (3글자)
	public static String getName() {
		Random rnd = new Random();
		char[] nameArr = new char[3];
		for (int i = 0; i < nameArr.length; i++) {
			nameArr[i] = (char) (rnd.nextInt('힣' - '가' + 1) + '가');
		}
		return new String(nameArr);
	}

	// 랜덤한 점수 (0~100) 생성
	public static int getScore() {
		return (int) (Math.random() * 101);
	}
}
