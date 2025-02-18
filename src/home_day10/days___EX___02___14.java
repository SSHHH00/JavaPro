package home_day10;

import java.io.StreamCorruptedException;
import java.net.MulticastSocket;
import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Random;
import java.util.Scanner;

import javax.naming.NameAlreadyBoundException;

public class days___EX___02___14 {

	public static void main(String[] args) {
		final int STUDENT_COUNT = 10;
		
		String[] names = new String[STUDENT_COUNT];
		int[] kors = new int[STUDENT_COUNT];
		int[] engs = new int[STUDENT_COUNT];
		int[] mats = new int[STUDENT_COUNT];
		int[] tots = new int[STUDENT_COUNT];
		int[] ranks = new int[STUDENT_COUNT];
		double[] avgs = new double[STUDENT_COUNT];
		
		int cnt = 0;
		char con = 'y';
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.printf("[%d] 학생랜덤 생성중...\n",cnt);
			names[cnt] = getName();
			kors[cnt] = getScore();
			engs[cnt] = getScore();
			mats[cnt] = getScore();
			
			tots[cnt] = kors[cnt] + engs[cnt] + mats[cnt];
			avgs[cnt] = (double) tots[cnt] /3;
			ranks[cnt] = 1;
			
			System.out.printf("이름: %s, 국어: %d, 영어: %d, 수학: %d, 총점: %d, 평균: %.2f\n",
					names[cnt], kors[cnt], engs[cnt], mats[cnt], tots[cnt], avgs[cnt]);
			
			cnt++;
			System.out.println("> 학생 입력 계속? (y/n): ");
			con = sc.next().charAt(0);
		} while (Character.toUpperCase(con) == 'Y' && cnt < STUDENT_COUNT);
		
		sc.close();
		
		System.out.printf("\n 입력받은 학생수: %d명\n" , cnt);
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t등수");
		
		for (int i = 0; i < cnt; i++) {
			System.out.printf();
		} //for
	
	
	
	
	
	
	
	}//main

	private static int getScore() {
		return (int) (Math.random() * 101);
		return 0;
	}

	private static String getName() {
		Random rnd = new Random();
		char[] nameArr = new char[3];
		for (int i = 0; i < nameArr.length; i++) {
			nameArr[i] = (char) (rnd.nextInt('힣' - '가' + 1)+ '가');
			
		} //for
		return new String(nameArr);
	}
	
}
