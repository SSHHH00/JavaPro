package days13;

import java.util.Scanner;

/**
 * @author C_Seung_H0
 *			[배열의 배열이다]
 */
public class Ex04_02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 게임 횟수 입력 ? ");
		int gameNumber = scanner.nextInt();

		int[][] lotto = new int[gameNumber][6];

		// 로또 번호 생성 및 출력
		fillLotto(lotto, gameNumber);
		dispLotto(lotto, gameNumber);

		scanner.close();
	}

	// **로또 번호 출력 함수**
	private static void dispLotto(int[][] lotto, int gameNumber) {
		for (int i = 0; i < gameNumber; i++) {
			System.out.printf("[%d 게임] ", i + 1);
			for (int j = 0; j < lotto[i].length; j++) {
				System.out.printf("[%d]", lotto[i][j]);
			}
			System.out.println();
		}
	}

	// **로또 번호 생성 함수**
	private static void fillLotto(int[][] lotto, int gameNumber) {
		int n;

		// 게임 횟수만큼 반복하여 로또 번호 생성
		for (int i = 0; i < gameNumber; i++) {
			int index = 0;
			while (index < 6) {
				n = getRandomInteger(1, 45);
				if (!isDuplicateLotto(lotto[i], n, index)) {
					lotto[i][index++] = n;
				}
			}
		}
	}

	// **중복 검사 함수 (한 게임의 로또 번호 내에서 중복 확인)**
	private static boolean isDuplicateLotto(int[] lotto, int n, int index) {
		for (int i = 0; i < index; i++) {
			if (lotto[i] == n) {
				return true; // 중복된 숫자 발견
			}
		}
		return false;
	}

	// **랜덤 숫자 생성 함수**
	public static int getRandomInteger(int min, int max) {
		return (int) (Math.random() * (max - min + 1)) + min;
	}

}