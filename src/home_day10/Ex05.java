package home_day10;

import java.util.Random;
import java.util.Scanner;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 14. 오후 5:42:08
 * @subject
 * @content
 */
public class Ex05 {

	public static void main(String[] args) {
/*		1. 입력 정보 : 이름, 국어, 영어, 수학 (랜덤 생성)
		2. 총점, 평균, 등수 계산 
		3. 모든 학생 정보 출력
*/	
		
		final int Student_Count= 30;
		
		String[] names = new String[Student_Count];
		int[] kors = new int[Student_Count];
		int[] engs = new int[Student_Count];
		int[] mats = new int[Student_Count];
		int[] tots = new int[Student_Count];
		int[] ranks = new int[Student_Count];
		double[] avgs = new double[Student_Count];
		
		int cnt = 0;
		char con = 0;
		
		Scanner sc = new Scanner(System.in);
		
		
		do {
			System.out.printf("[%d] 학생랜덤 새");
			
			
		} while ( Character.toUpperCase(con) == 'Y' );
		
		// 등수처리.
		
		// 학생정보출력.
		System.out.printf("> 입력받은 학생수 : %d명\n", cnt);
		for (int i = 0; i < cnt; i++) {
			System.out.printf("[%d]\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n"
					, i+1
					, names[i]
					, kors[i], engs[i], mats[i], tots[i]
					, avgs[i], ranks[i]);
		} // for i
		
	} // main
	
	public static String getName() {
		// '가' ~ '힣'
		// 44032 ~ 55203
		
		// 5 ~ 13
		// 0 ~ 8                -5
		// 5 <=  (int)(Math.random()*9)+5 <= 13
		
		 
		//char one = (char)(rnd.nextInt('힣'-'가'+1)+'가');
		
		char [] nameArr = new char[3];
		Random rnd = new Random();
		for (int i = 0; i < nameArr.length; i++) {
			nameArr[i] = (char)(rnd.nextInt('힣'-'가'+1)+'가');
		}
		
		// char[] -> String 변환
		String name = new String(nameArr);
		return name;
	}

	public static int getScore() {
		return  (int)( Math.random()*101 ) ;
	}

} // class