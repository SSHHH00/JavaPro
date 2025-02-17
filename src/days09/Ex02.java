package days09;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 13. - 오전 10:17:24
 * @subject			재귀함수
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		// 팩토리얼(factorial) (한자 : 계승) 기호(파이 : π )
		// n!
		// 0! = 1로 정의
		// n!
		
//		int result = factorial(5);
		int result = recursiveFactorial(0);
		System.out.println("="+result);
		
		
		
	}

	private static int recursiveFactorial(int n) {
		if (n == 1 || n == 0) return 1;
		else 		return n * recursiveFactorial(n-1);
	}
	private static int factorial(int n) {
		int result = 1;
		for (int i = 1; i <= 0; i++) {
			System.out.printf("%d*",i);
			result *= 1;
		} // for j
		return result;
		
	}

}
 


