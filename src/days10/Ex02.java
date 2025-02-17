package days10;

import java.util.Scanner;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 14. 오전 10:49:06
 * @subject
 * @content 정처기 예시일수도? 2진수 활용
 */
public class Ex02 {

	public static void main(String[] args) {
		/*
		 * 5만원 : 2 개 1만원 : 2 개 5천원 : 1 개 1천원 : 0 개 5백원 : 1 개 1백원 : 2 개 5십원 : 1 개 1십원 : 1
		 * 개 5원 : 0 개 1원 : 0 개
		 */
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("금액입력 : ");
		int amount = sc.nextInt();

		int[] units = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
		int[] counts = new int [units.length];
		
		for (int i = 0; i < units.length; i++) {
			counts[i] = amount / units[i];
			
		} //for
	}

}
