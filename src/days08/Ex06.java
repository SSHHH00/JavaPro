package days08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 12. - 오후 2:15:14
 * @subject			매소드 선언 + 호출
 * @content
 */
public class Ex06 {

	public static void main(String[] args) throws IOException {
		// [문제]
		// 이름, 국어, 영어, 수학 점수를받아서
		// 총점
		// 평균
		// [ 출력 ]
		// 이름="홍길동", 국어=90, 영어=89, 수학=77, 총점=256, 평균=85.33
		// 자료형 끝날때까지 byte 사용			
		// days03.Ex06_02.java 복사+붙이기
	      
	      String name;
	      byte kor, eng, mat;
	      short tot;
	      double avg;

	      Scanner scanner = new Scanner(System.in); 
	      
	      name = getName(scanner);
	      
	      kor = getScore(scanner, "국어");
	      eng = getScore(scanner, "영어");
	      mat = getScore(scanner, "수학");      
	      
	      tot = getTotal(kor, eng, mat);
	      avg = getAvg(tot);
	      
	      printScore(name, kor, eng, mat, tot, avg);
	           

	   } // main

	   private static void printScore(String name, byte kor, byte eng, byte mat, short tot, double avg) {
	      
	      System.out.printf("이름=\"%s\", 국어=%d, 영어=%d, 수학=%d, 총점=%d, 평균=%5.2f\n"
	            , name, kor, eng, mat, tot, avg);
	      
	   }

	   private static double getAvg(short tot) { 
	      return (double)tot/3;
	   }

	   private static short getTotal(byte kor, byte eng, byte mat) { 
	      return (short) (kor + eng + mat);
	   }

	   private static byte getScore(Scanner scanner, String subject) {
	      // 0<=   <=100  
	      // String.matches() 메서드 사용해서 유효성 검사~
	      byte score;
	      String strScore;
	      
	      
	      String regex = "[0-9]{1,3}"; // 
	      
	      
	      
	      boolean isFirst = false;
	      do {
	         if (isFirst) {
	            System.out.print("[다시] ");
	         } // if
	         System.out.printf("> %s 점수 입력 ? ", subject);
	         strScore = scanner.next();
	         isFirst = true;
	      } while ( !strScore.matches(regex ) );
	      
	      score = Byte.parseByte(strScore);      
	      return score;
	   }

	   private static String getName(Scanner scanner) {
	      System.out.print("> 이름 입력 ? ");
	      String name = scanner.next();
	      return name;
	   }
	 

	} // class





