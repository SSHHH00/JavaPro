package days06;

import java.util.Scanner;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 10. - 오후 4:21:23
 * @subject		개행 출력 + 개행번호 매기기
 * @content
 */
public class Ex07_02 {

	public static void main(String[] args) {
		//[문제] 한 라인에 10개의 ASCII 문자를 출력
		//윈도우 개행 :Carriage Return(CR) +Line feed(LF)
		//					'\r'13		'\n'10
		//리눅스 " LF
		
//		for (int i = 0; i < 256; i++) {
//			System.out.printf("[%c]",(char)i);
//			if (i%10==0) System.out.println();
//			}
		//마지막 라인 :6 남음
		//개행
		
//		int lineNumber= 1;
//		for (int i = 0; i < 256; i++) {
//			System.out.printf("[%c]",(char)i);
//			if (i % 10 == 0) { // 10줄씩 나눠서 라인번호 매김
//				System.out.printf("\n[%02d]",lineNumber);
//			}
//			System.out.printf("%c",(char) i);
//			}
		
//		 for (int i = 0, lineNumber = 1; i < 256; i++) {
//	         // if(i%10==0) System.out.printf("%d :", i/10+1);
//	         if(i%10==0) System.out.printf("%d :", lineNumber++);
//	         System.out.printf("[%c]", (char)i);
//	         if(i%10==9) System.out.println();
	         
		for (int i = 0, lineNumber = 1; i < 256; i++) {
	         // if(i%10==0) System.out.printf("%d :", i/10+1);
			
	         if(i%10==0) System.out.printf("%d :", lineNumber);
	         System.out.printf("[%c]", (char)i);
	         if(i%10==9) {
	        	 System.out.println();
	        	 if (lineNumber %5 ==0) {
					System.out.println("\t 진행시 엔터");
					Scanner scanner = new Scanner(System.in);
					scanner.nextLine();
				} //f
	        	 lineNumber++;
	        }	
	         
		}		
	}

}
 


