package days12;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;


/**
 * @author C_Seung_H0
 *
 */
public class Ex01 {

	public static void main(String[] args) throws IOException {
		 String name;
	      int kor, eng, mat, tot, rank;
	      double avg;

	      final int CLASS = 3;
	      final int STUDENT_COUNT = 30;

	      //String [] names = new String[3*STUDENT_COUNT];
	      String [][] names = new String[CLASS][STUDENT_COUNT];
	      int [][] kors = new int[CLASS][STUDENT_COUNT];
	      int [][] engs = new int[CLASS][STUDENT_COUNT];
	      int [][] mats = new int[CLASS][STUDENT_COUNT];
	      int [][] tots = new int[CLASS][STUDENT_COUNT];
	      int [][] ranks = new int[CLASS][STUDENT_COUNT];
	      double [][] avgs = new double[CLASS][STUDENT_COUNT];

	      // int cnt1 = 0, cnt2 = 0, cnt3 = 0; // 입력받은 학생 수
	      //     cnts[0]   cnts[1]  cnts[2]
	      int [] cnts = new int[3]; // 배열은 int 자료형의 기본값 0로 초기화.
	      
	      char con = 'y';

	      Scanner scanner = new Scanner(System.in);

	      int ban ; 
	      do {
	         // "가변 배열" 처리
	         // 1. 반 입력 ? 
	            System.out.print("> 1. 반 입력 ? ");
	            ban = scanner.nextInt();  // 2
	            
	         // 한 학생의 정보를 입력
	         System.out.printf("> 2. %d반 [%d번] 학생 이름,국어,영어,수학 입력 ? "
	               , ban, cnts[ban-1]+1);
	         name = getName(); // scanner.next();
	         kor = getScore(); // scanner.nextInt();
	         eng = getScore(); // scanner.nextInt();
	         mat = getScore(); // scanner.nextInt();

	         tot = kor + eng + mat;
	         avg = (double)tot/3;
	         rank = 1;
	         // 각 배열에 요소로 추가. ( 각 배열의 index ==> cnt 처리 )
	         names[ban-1][cnts[ban-1]] = name;
	         kors[ban-1][cnts[ban-1]] = kor;
	         engs[ban-1][cnts[ban-1]] = eng;
	         mats[ban-1][cnts[ban-1]] = mat;
	         tots[ban-1][cnts[ban-1]] = tot;
	         avgs[ban-1][cnts[ban-1]] = avg;
	         ranks[ban-1][cnts[ban-1]] = rank;

	         // 입력받은 학생수 1증가
	         cnts[ban-1]++;
	         // 입력 계속 여부 체크
	         System.out.print("> 학생 입력 계속 ? ");
	         con = (char)System.in.read();
	         System.in.skip(System.in.available()); // 13, 10
	      } while ( Character.toUpperCase(con) == 'Y' );

	      // 등수처리.
	      

	      // 학생정보출력.
	     // int totalCnt = 0;
	      int totalCnt = IntStream.of(cnts).sum();
	      System.out.printf("[전체 학생 수 : [%d]\n",totalCnt);
	      for (int i = 0; i < cnts.length; i++) {
			System.out.printf("[%d]반의 학생수 : %d명\n", i+1, cnts[i]);
			// 그반 학생 출력...
			for (int j = 0; j < cnts[i]; j++) {
				
			} //for
		} //for

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