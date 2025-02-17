package days09;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 13. - 오전 10:33:55
 * @subject		Math.pow(2,3)
 * @content
 */
public class Ex02_2 {

	public static void main(String[] args) {
		// 거듭제곱==멱
		// 2^3	=	2 * 2 * 2	=	8
		// 2를 밑수(base)
		// 3을 지수(exsponent, power)
		// 밑수를 지무만큼 반복해서 곱하는 수
		//		double result = power(2,-3);
		double result = recursivePower(2,-3);		
		System.out.println( result );

	}

	private static double recursivePower(int b, int e) {
		if( e < 0  )      return 1/recursivePower(b,  -e);
		else if( e == 1 ) return b;
		else			  return b * recursivePower(b, e-1);	
	}
	private static double power(int b, int e) {
		int result = 1;
		int e2 = Math.abs(e);
		for (int i = 1; i <= e2; i++) {
			result *= b;
		} // for i
		return  e < 0 ? (double)1/result : result;
	}

}



