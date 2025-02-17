package days04;

import java.util.Scanner;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 6. - 오후 10:06:41
 * @subject		스캐너 사용 과목별 등급출력
 * @content
 */
public class Ex06_04 {

	public static void main(String[] args) {
		int n ;

//		Scanner scanner = new Scanner(System.in);
//		System.out.println(">정수(n)입력 : ");		//Ctrl + Shift + B 중간지점 포인트 
//			n = scanner.nextInt();
//		
//			if ( 90<= kor ) {
//				
//			}else if  ( 80 <= kor ) {
//	            System.out.println("수");
//	         } // if
//	         if ( 70 <= kor ) {
//	            System.out.println("우");
//	         } // if
//	         if ( 70 <= kor && kor <= 79  ) {
//	            System.out.println("미");
//	         } // if
//	         if ( 60 <= kor && kor <= 69 ) {
//	            System.out.println("양");
//	         } // if
//	         if ( 0 <= kor && kor <= 59 ) {
//	            System.out.println("가");
//	         } // if
//	      } else {
//	         System.out.println("[알림] 국어 점수 0~100 !!!");
//	      } // if
			 int kor = -1 ;       
		      Scanner scanner1 = new Scanner(System.in);
		      System.out.print("> 국어 점수 입력 ? ");  
		       
		      if (!scanner1.hasNextInt()) {
		         System.out.println("[알림] 국어 점수 0~100 !!!");
		         return ;
		      } // if
		    
		      kor = scanner1.nextInt();   
		      char grade = '수'; 
		      if ( 0 <= kor && kor <= 100 ) {
		         if ( 90 <= kor ) {   
		            // System.out.println("수");
		            grade = '수';
		         }else if ( 80 <= kor ) {
		            //System.out.println("우");
		            grade = '우';
		         }else if ( 70 <= kor  ) {
		            //System.out.println("미");
		            grade = '미';
		         }else if ( 60 <= kor) {
		            //System.out.println("양");
		            grade = '양';
		         }else {
		            //System.out.println("가");
		            grade = '가';
		         } // if
		         
		         System.out.printf("%d => %c\n", kor, grade);
		      } else {
		         System.out.println("[알림] 국어 점수 0~100 !!!");
		      } // if
		      
		      System.out.println(" end ");

			
			
			
	}

}
 


