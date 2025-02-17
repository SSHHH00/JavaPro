package home_day10;

import java.io.IOException;
import java.util.Scanner;

public class Ex04_02 {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
	      int [] korArr = new int[3];
	      int index = 0;
	      //   ↓
	      //  [0] [0] [0]
	      // k[0]k[1]k[2]
	      String regex = "^(100|[1-9]?[0-9])$";
	      int score;
	      char con = 'y';
	      do {
	         System.out.printf("%d번 학생 점수 입력 ? ",  index+1);
	         score = scanner.nextInt();
	         korArr[index++] = score;
	         
	         System.out.printf(" > 입력 계속 할래?");
	         con = (char)System.in.read();
	      } while ( con == 'y' || con == 'Y');
	      
	      System.out.printf("> 입력한 수 : %d\n", index);
	      for (int i = 0; i < korArr.length; i++) {
	         System.out.printf("[%d]번 학생의 점수 : %d점\n", i+1, korArr[i]);
	      } // for i
	}

}
