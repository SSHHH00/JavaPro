package zhome;

import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 6. - 오후 10:46:33
 * @subject
 * @content
 */
public class Ex06_04 {

	public static void main(String[] args) {
		//[문제] if문 사용,  if ~ else문
	      // 국어 점수를 입력받아서
	      // 수/우/미/양/가
	      // 출력
	      // 수    90 이상 ~ 100이하
	      // 우    80 이상 ~ 90 미만(89이하)
	      // 미    70 이상 ~ 80 미만(79이하)
	      // 양    60 이상 ~ 70 미만(69이하)
	      // 가    0 이상 ~ 60 미만(59이하)
		//
		
		//
		Scanner sc = new Scanner(System.in);
		int kor = -1;

		System.out.print("국어점수 입력");
		
		if (!sc.hasNextInt()) {		//정수확인 하는
			System.out.println("[알림]0~100!!!");
			sc.close();
			return;
		}
		
		kor = sc.nextInt();
		char  grade = '가';
			if ( 0 <= kor && kor <= 100 ) {
				if ( 90 <= kor ) {
					grade = '수';
				}else if ( 80 <= kor) {
					grade = '우';
				}else if ( 70 <= kor) {
					grade = '미';	
				}else if ( 60 <= kor) {
					grade = '양';
				}else {
					grade = '가';
				}
				System.out.printf("%d점 -> 등급 = %c\n",kor,grade);
				}	else {
				System.out.println("[알림] 국어점수는 0~100 사이만 입력가능합니다!!!");
				}
			sc.close();
					
					
					
					

						
				
				
				
				
			

	}

}
 


