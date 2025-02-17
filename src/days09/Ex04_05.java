package days09;

import java.util.Scanner;

public class Ex04_05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
	      String rrn = getRrn(scanner);
	      System.out.println( rrn );
	      
	      // 1) 출생지역(전공자) 해보기
	      /*
	      ‘ㅍ’은 주민등록번호에 오류가 없는지 확인하는 검증번호로, 아래와 같은 특수한 규칙으로 만든다.
	      ㅍ = 11-{(2×ㄱ+3×ㄴ+4×ㄷ+5×ㄹ+6×ㅁ+7×ㅂ+8×ㅅ+9×ㅇ+2×ㅈ+3×ㅊ+4×ㅋ+5×ㅌ) % 11}
	                                             ㅍ
	      830412-270000                          1
	      xx
	      234567 892345
	      11 - [(16+ 9+?+?+?+) % 11] 
	        ??  10-> 0, 11->1
	      즉, 소괄호 안에 있는 것을 계산한 값을 11로 나눠서 나온 나머지를 11에서 뺀 값이 ㅍ이다. (단, 10은 0, 11은 1로 표기한다.)
	      */
	      
	      int ㅍ = Integer.parseInt( rrn.substring(13, 14) );
	      
	      int ㄱ = Integer.parseInt( rrn.substring(0, 1) );
	      int ㄴ = Integer.parseInt( rrn.substring(1, 2) );
	      int ㄷ = Integer.parseInt( rrn.substring(2, 3) );
	      int ㄹ = Integer.parseInt( rrn.substring(3, 4) );
	      int ㅁ = Integer.parseInt( rrn.substring(4, 5) );
	      int ㅂ = Integer.parseInt( rrn.substring(5, 6) );
	      // - 6,7
	      int ㅅ = Integer.parseInt( rrn.substring(7, 8) );
	      int ㅇ = Integer.parseInt( rrn.substring(8, 9) );
	      int ㅈ = Integer.parseInt( rrn.substring(9, 10) );
	      int ㅊ = Integer.parseInt( rrn.substring(10, 11) );
	      int ㅋ = Integer.parseInt( rrn.substring(11, 12) );
	      int ㅌ = Integer.parseInt( rrn.substring(12, 13) );
	      
	      int checkSum = 11-((2*ㄱ+3*ㄴ+4*ㄷ+5*ㄹ+6*ㅁ+7*ㅂ+8*ㅅ+9*ㅇ+2*ㅈ+3*ㅊ+4*ㅋ+5*ㅌ) % 11);
	      
	      if (checkSum == 10) {
	         checkSum = 0;
	      }else if ( checkSum == 11) {
	         checkSum = 1;
	      } // if // if
	      
	      if (ㅍ == checkSum) {
	         System.out.println("검증 주민번호 O");
	      } else {
	         System.out.println("검증 실패된 주민번호 X");
	      } // if
	       
	   }

	private static String getRrn(Scanner scanner) {
		// TODO Auto-generated method stub
		return null;
		
	} // main
	
}