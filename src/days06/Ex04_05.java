package days06;

import java.util.Scanner;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 10. - 오후 2:05:57
 * @subject
 * @content
 */
public class Ex04_05 {

	public static void main(String[] args) {
		//세정수를 입력받아서 세정수 중에 가장 큰값, 가장 작은 값을 구해서 출력
		
		int n,m,o;
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		m = scanner.nextInt();
		o = scanner.nextInt();
		
		 int max = Math.max(n, Math.max(m, o));
		 int min = Math.min(n, Math.min(m, o));
		
		System.out.printf("출력 : ",max,min);
		scanner.close();
		
		
		
		
	}

}
 


