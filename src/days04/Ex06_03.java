package days04;

import java.util.Scanner;


/**
 * @author C_Seung_H0
 * @date 2025. 2. 6. - 오후 4:13:16
 * @subject  if문 사용 if ~else문
 * @content
 */
public class Ex06_03 {
   
   public static void main(String[] args) {
																      // [문제] if문 사용,  if ~ else문
																      // 국어 점수를 입력받아서
																      // 수/우/미/양/가
																      // 출력
																      // 수    90 이상 ~ 100이하
																      // 우    80 이상 ~ 90 미만(89이하)
																      // 미    70 이상 ~ 80 미만(79이하)
																      // 양    60 이상 ~ 70 미만(69이하)
																      // 가    0 이상 ~ 60 미만(59이하)
      int kor ;       
      Scanner scanner = new Scanner(System.in);
      System.out.print("> 국어 점수 입력 ? ");  // 0<=   <=100
      
      kor = scanner.nextInt();
      
      if ( 0 <= kor && kor <= 100 ) {
    	  																// 수/우/미/양/가
         if ( 90 <= kor && kor <= 100 ) {
            System.out.println("수");
         } // if
         if ( 80 <= kor && kor <= 89 ) {
            System.out.println("우");
         } // if
         if ( 70 <= kor && kor <= 79  ) {
            System.out.println("미");
         } // if
         if ( 60 <= kor && kor <= 69 ) {
            System.out.println("양");
         } // if
         if ( 0 <= kor && kor <= 59 ) {
            System.out.println("가");
         } // if
      } else {
         System.out.println("[알림] 국어 점수 0~100 !!!");
      } // if
      
     
      
      System.out.println(" end ");
   } // main

} // class








