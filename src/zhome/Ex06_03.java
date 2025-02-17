package zhome;

import java.util.Scanner;

public class Ex06_03 {

	public static void main(String[] args) {
		// // [문제] if문 사용,  if ~ else문
	      // 국어 점수를 입력받아서
	      // 수/우/미/양/가
	      // 출력
	      // 수    90 이상 ~ 100이하
	      // 우    80 이상 ~ 90 미만(89이하)
	      // 미    70 이상 ~ 80 미만(79이하)
	      // 양    60 이상 ~ 70 미만(69이하)
	      // 가    0 이상 ~ 60 미만(59이하)
		
		int kor = -1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수입력 : ");
		kor = sc.nextInt(); 
		
			if (!(0 <= kor && kor <=100)) {
			System.out.println("[알림] 0~100사이의 점수만 입력가능");
			sc.close();
			return;
		}	if ( 90 <= kor ) {
			System.out.println("수");
		}	if ( 80 <= kor) {
			System.out.println("우");
		}	if ( 70 <= kor) {
			System.out.println("미");
		}	if ( 60 <= kor) {
			System.out.println("양");
		}	if ( 0<= kor && kor < 60)	
		{
			System.out.println("가");
		}
			else {
				System.out.println("[알림] 0~100다!!!");
			}
		System.out.println("End");
		sc.close();
	

	}

}
 


