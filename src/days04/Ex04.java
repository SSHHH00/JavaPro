package days04;

import java.util.Scanner;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 6. - 오후 12:15:06
 * @subject		Scanner		, next
 * @content		BufferedReader 와 비슷?
 */
public class Ex04 {

		public static void main(String[] args) {
//		//BufferedReader br 키보드로부터 입력...
//		//Scanner 클래스
//		Scanner sc = new Scanner(System.in);
//		System.out.print(" > 정수 입력 : ");
//		int n = sc.nextInt();	// 1. 기능	2. 매개변수	3.리턴값(리턴자료형) //입력된 인티제값은 반환
//		System.out.println( n );
		//-----------------------------------------------
		
		String name = null;
		byte kor = 0, eng = 0, mat = 0;
		short tot;
		double avg;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("> 이름 국어 영어 수학 입력 ?");	//홍갈동 90 87 65
		name = sc.next();
		kor = sc.nextByte();
		eng	= sc.nextByte();		///next ~ 형변환식에 따라 다르게 입력.
		mat	= sc.nextByte();
		
		tot = (short) (kor + eng + mat);
		avg = (double) tot / 3;
		
		System.out.printf("이름=\"%s\", 국어=%d, 영어=%d, 수학=%d, 총점=%d, 평균=%5.2f\n", 
				name, kor, eng, mat, tot, avg);
		
		
	}//main

}//class
 


