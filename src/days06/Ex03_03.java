package days06;

import java.util.Scanner;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 10. - 오전 11:37:09
 * @subject
 * @content
 */
public class Ex03_03 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("숫자입력");
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			if (i % 2==0) {
				System.out.println(i+"는 짝수입니다");
			} else {
				System.out.println(i+"는 홀수입니다.");

			}sc.close();
			
		} // for i
		
		
	}

}
 


