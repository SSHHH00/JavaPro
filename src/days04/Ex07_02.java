package days04;

import java.util.Scanner;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 6. - 오후 4:35:21
 * @subject		switch 문을 활용한 학점 판별
 * @content
 */
public class Ex07_02 {
	public static void main(String[] args) {
		int kor = -1;
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 국어 점수 입력 ? ");

		// 입력값이 정수가 아닐 경우 처리
		if (!scanner.hasNextInt()) {
			System.out.println("[알림] 국어 점수는 0~100 사이의 정수만 입력 가능합니다!");
			scanner.close();
			return;
		}

		kor = scanner.nextInt();		//정수를 입력받았다는 의미

		// 0~100 범위를 벗어난 경우 예외 처리
		if (kor < 0 || kor > 100) {
			System.out.println("[알림] 국어 점수는 0~100 사이의 값이어야 합니다!");
			scanner.close();
			return;
		}
		String grade;		/// 학점 저장을 위한 변수

		// 89
		// switch문을 사용하여 학점 결정
		switch (  kor / 10 ) {   //  변수명을 10으로 나눔
		case 10: // 100점 
		case 9:  // 90~99점
			grade = "수";
			break;
		case 8:  // 80~89점
			grade = "우";
			break;
		case 7:  // 70~79점
			grade = "미";
			break;
		case 6:  // 60~69점
			grade = "양";
			break;
		default: // 0~59점
			grade = "가";
			break;
		} // switch

		// 최종 출력
		System.out.printf("%d점 => 학점: %s%n", kor, grade);

		scanner.close(); // 자원 해제
		
	
		
		
//
//		      int kor = -1 ;       
//		      Scanner scanner = new Scanner(System.in);
//		      System.out.print("> 국어 점수 입력 ? ");  
//		       
//		      if (!scanner.hasNextInt()) {
//		         System.out.println("[알림] 국어 점수 0~100 !!!");
//		         return ;
//		      } // if
//		    
//		      kor = scanner.nextInt(); 
//		      // int 정수            0~100 체크X
//		      char grade = '수';
//		      
//		      // 수/우/미/양/가 출력         switch문 사용~
//		      // 5:00 수업 시작~~ 
//		      // 100  수
//		      // 90 91 92   99/10 = 9 수
////		      case 90: case 91: case 99:
//		      // 80 81 82 ~ 89/10 = 8 우
//		      
//		      // Cannot switch on a value of type boolean. 
//		      // Only convertible int values, strings or enum variables are permitted
//		      int key = 0 <= kor && kor <= 100 ? 1 : 0;
//		      // String key = 0 <= kor && kor <= 100 ? "o" : "x";
//		      switch ( key ) {
//		      case 1: 
//		         switch ( kor/10 ) {
//		         case 10: 
//		         case 9:         
//		            grade = '수';
//		            break;
//		         case 8:
//		            grade = '우';
//		            break;
//		         case 7:
//		            grade = '미';
//		            break;
//		         case 6:
//		            grade = '양';
//		            break;   
//		         default: // 0~5
//		            grade = '가';
//		            //break;
//		         } // switch
//		         
//		         System.out.printf("%d => %c\n", kor, grade);
//		         break; 
//		      default:  // 0 "x"
//		         System.out.println("[알림] 국어 점수 0~100 !!!");
//		         break;
//		      } // switch
		      
		      
		      
		   } // main

		







	}

