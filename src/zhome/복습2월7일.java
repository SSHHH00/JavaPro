package zhome;

import java.util.Scanner;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 7. - 오후 5:12:18
 * @subject
 * @content
 */
public class 복습2월7일 {

	public static void main(String[] args) {
		
		int kor1, kor2, kor3;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 첫번째 : ");
		kor1 = sc.nextInt();
		
		System.out.print("국어점수 두번째 : ");
		kor2 = sc.nextInt();
		
		System.out.print("국어점수 세번째 : ");
		kor3 = sc.nextInt();
		
		System.out.printf("첫번째점수 :%d\n두번째 점수 :%d\n세번째 점수:%d\n ", 
				kor1,kor2,kor3);
		sc.close();
	}

}
 


