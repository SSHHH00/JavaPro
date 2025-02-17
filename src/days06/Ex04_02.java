package days06;

import java.util.Scanner;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 10. - 오후 12:02:33
 * @subject
 * @content
 */
public class Ex04_02 {

	public static void main(String[] args) {
		// 두 정수 (n,m)을 입력받아서 두정수 사이의 합을 출력.
		//for문과 while문 사용
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("n정수입력 : ?");
		int n = sc.nextInt();
		
		System.out.println("m정수입력 : ?");
		int m = sc.nextInt();
		
		int sum=0;
		
		int min = Math.min(n, m);
		int max = Math.max(n, m);
		
		for (int i = min; i <= max; i++) {
			sum +=i;
			if (i < max) {
				System.out.printf("%d + ",i);
			} else{
				System.out.printf("%d = ",i);//f
			}
		} // for i
		System.out.printf("%d\n",sum);
		sc.close();
		
//		int i= min;
//		while (i<=max) {
//			sum+=i;
//			if (i<max) {
//				System.out.printf("%d + ",i);
//			} else {
//				System.out.printf("%d = ",i);
//			}i++;
//		}System.out.printf("%d\n",sum);
//		sc.close();
		
		
	}
}
 


